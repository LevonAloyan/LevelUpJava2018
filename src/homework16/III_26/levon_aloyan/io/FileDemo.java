package homework16.III_26.levon_aloyan.io;

import java.io.*;
import java.util.*;

public class FileDemo {

	public static void main(String[] args) {

		File file = new File(".");
//		System.out.println(file.exists());
//		System.out.println(file.getAbsoluteFile());


		File[] files =  file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return false;
			}
		});
		for (File f : files) {
			System.out.println(f.getName() + " : isFile " + f.isFile());
		}
	}


	public static List<File> search(File dirTosearchIn, String fileNameMask){

		//TODO validation and call the search0 method
		List<File> resultList = new ArrayList<>();
		search0(resultList, dirTosearchIn, fileNameMask);
		return resultList;
	}

	private static void search0 (List<File> resultList, File dirTosearchIn, String fileNameMask) {

		File [] currentList = dirTosearchIn.listFiles();
		for (File currFile : currentList) {

			if( currFile.isDirectory()){
				FileFilter fileFilter= new FileFilter() {
					@Override
					public boolean accept(File file) {
						return file.isFile();

					}

				};
				currentList=dirTosearchIn.listFiles(fileFilter);
				System.out.println(currentList);
				search0 (resultList, currFile, fileNameMask);

			} else {
				if(currFile.getName().equals(fileNameMask)){
					resultList.add(currFile);
				}
			}

		}


	}




}
