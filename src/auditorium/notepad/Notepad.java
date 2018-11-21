package auditorium.notepad;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Notepad extends JFrame {
	private static final String DEFAULT_TITLE = " - Notepade";
	private static final String DEFAULT_NAME = "Untitled";
	private String fileName = DEFAULT_NAME + DEFAULT_TITLE;
	private File curentFile = null;
	JTextArea textArea = new JTextArea();

	public Notepad() {
		//TODO add implementation here
	}

	private void newActionPerformed(ActionEvent e) {
		if (isChanged()) {

			int selectedOption = JOptionPane.showConfirmDialog(textArea,
				"Do You want to save changes '" + fileName + "'");
			if (selectedOption == JOptionPane.NO_OPTION) {
				textArea.setText("");
			} else if (selectedOption == JOptionPane.YES_OPTION) {
				JFileChooser fileChooser = new JFileChooser();
				int choice = fileChooser.showSaveDialog(textArea);
				if (choice == JFileChooser.APPROVE_OPTION) {
					save(fileChooser.getSelectedFile());
					textArea.setText("");
				}
			}


		}
	}

	private boolean isChanged() {
		if (curentFile == null && textArea.getText().trim().length() > 0) {
			return true;
		} else if (curentFile != null && curentFile.exists()) {
			//TODO read fiel and compare with textArea content
			//return result of comparison.
		}
		return false;

	}

	private void save(File file) {
		//   TODO impl
	}


	public static void main(String[] args) {
		Notepad notepade = new Notepad();
	}
}
