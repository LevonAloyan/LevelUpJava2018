package auditorium.io;

import java.io.File;
import java.io.FileFilter;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class FileDemo {

	public static void main(String[] args) {


		File file = new File(".");
		//		System.out.println(file.exists());
		//		System.out.println(file.getAbsoluteFile());

		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isFile();
			}
		});
		for (File f : files) {
			System.out.println(f.getName() + " : isFile " + f.isFile());
		}
	}


	public static List<File> search(File dirTosearchIn, String fileNameMask) {
		if (dirTosearchIn == null) {
			throw new NullPointerException("The directory to search in should not be null");
		}
		if (dirTosearchIn.isFile()) {
			throw new InvalidParameterException("Specified paraameter: 'dirTosearchIn' should be a directory");
		}
		if (fileNameMask == null || fileNameMask.length() == 0) {
			return new ArrayList<>();
		}


		List<File> resultList = new ArrayList<>();
		search0(resultList, dirTosearchIn, fileNameMask);
		return resultList;
	}

	private static void search0(List<File> resultList, File dirTosearchIn, String fileNameMask) {
		searchInCurrentDirFiles (resultList, dirTosearchIn, fileNameMask);

		File[] currentDirList = getDirectories (dirTosearchIn);
		for (File currFile : currentDirList) {
			search0(resultList, currFile, fileNameMask);
		}

	}

	private static File[] getDirectories (File currentDir){
		return currentDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});
	}

	private static void searchInCurrentDirFiles (List<File> resultList, File currenDir, String fileNameMask){
		File[] files = currenDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isFile();
			}
		});

		for (File file : files) {
			String name = file.getName();
			if(fileNameMask.indexOf('*') == -1){
				if(name.equals(fileNameMask)) {
					resultList.add(file);
				}
			} else if(fileNameMask.startsWith("*") && fileNameMask.endsWith("*")){
				if(name.contains(fileNameMask.substring(1, fileNameMask.length()-1))){
					resultList.add(file);
				}
			} else if(fileNameMask.startsWith("*")){
				if (name.endsWith(fileNameMask.substring(1))){
					resultList.add(file);
				}
			}  else if(fileNameMask.endsWith("*")){
				if (name.startsWith(fileNameMask.substring(0, fileNameMask.length()-1))){
					resultList.add(file);
				}
			}
		}

	}


}
