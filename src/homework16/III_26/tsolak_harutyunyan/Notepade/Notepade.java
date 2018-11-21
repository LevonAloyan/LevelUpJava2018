package homework16.III_26.tsolak_harutyunyan.Notepade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Notepade extends JFrame {
	public static void main(String[] args) {
		Notepade notepade = new Notepade();
	}


	private static final String DEFAULT_TITLE = " - Notepade";
	private static final String DEFAULT_NAME = "Untitled";

	private String fileName = DEFAULT_NAME + DEFAULT_TITLE;
	private File curentFile = null;

	JTextArea textArea = new JTextArea();

	public Notepade() {

		getContentPane().add(textArea);
		MenuBar menubar = new MenuBar();
		setMenuBar(menubar);
		Menu file = new Menu("file");
		menubar.add(file);
		MenuItem newFile = new MenuItem("new");
		file.add(newFile);
		MenuItem open = new MenuItem("open");
		file.add(open);
		MenuItem saveFile = new MenuItem("save");
		file.add(saveFile);
		MenuItem saveAs = new MenuItem("saveAs");
		file.add(saveAs);
		MenuItem closeFile = new MenuItem("close");
		file.add(closeFile);

		newFile.addActionListener((e1) -> newActionPerformed(e1));

		open.addActionListener(e -> {
			JFileChooser open1 = new JFileChooser();
			int option = open1.showOpenDialog(textArea);
			if (option == JFileChooser.APPROVE_OPTION) {
				textArea.setText("");
				try {

					Scanner scan = new Scanner(new FileReader(open1.getSelectedFile().getPath()));
					while (scan.hasNext())
						textArea.append(scan.nextLine() + "\n");
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		});
		saveFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser saveAsFile = new JFileChooser();
				int saveFileOption = saveAsFile.showSaveDialog(textArea);

				if (saveFileOption == JFileChooser.APPROVE_OPTION) {
					try {
						BufferedWriter out = new BufferedWriter(new FileWriter(saveAsFile.getSelectedFile().getPath()));
						out.write(textArea.getText());
						out.close();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		});
		saveAs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser saveAsFile = new JFileChooser();
				int saveAsOption = saveAsFile.showSaveDialog(textArea);
				if (saveAsOption == JFileChooser.APPROVE_OPTION) {
					try {
						BufferedWriter out = new BufferedWriter(new FileWriter(saveAsFile.getSelectedFile().getPath()));
						out.write(textArea.getText());
						out.close();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}

			}
		});
		closeFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});


		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		setSize(dimension.width / 2, dimension.height / 2);
		setLocation(dimension.width / 4, dimension.height / 4);
		setTitle(fileName);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

	}


	private void newActionPerformed(ActionEvent e) {
		if (isChanged()) {
			if (textArea.getText().length() > 0) {
				int selecteOption = JOptionPane.showConfirmDialog(textArea,
					"Do You want to save changes '" + fileName + "'");
				if (selecteOption == JOptionPane.NO_OPTION) {
					textArea.setText("");
				} else if (selecteOption == JOptionPane.YES_OPTION) {
					JFileChooser fileChooser = new JFileChooser();
					int choice = fileChooser.showSaveDialog(textArea);
					if (choice == JFileChooser.CANCEL_OPTION) {

					} else if (choice == JFileChooser.APPROVE_OPTION) {
						save(fileChooser.getSelectedFile());
						textArea.setText("");
					}
				}
			}

		}
	}

	private boolean isChanged(){
		if(curentFile == null && textArea.getText().trim().length() > 0){
			return true;
		} else if (curentFile != null && curentFile.exists()){
			//TODO read fiel and compare with textArea content
			//return result of comparison.
		}
		return false;

	}

	private boolean isContentChanged() {
		if(curentFile != null && curentFile.exists()){
			//TODO read fiel and compare with textArea content
		}
		return false;
	}

	public void save(File selectedFile) {
	}


}




