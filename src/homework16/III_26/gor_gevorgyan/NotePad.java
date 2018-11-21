package homework16.III_26.gor_gevorgyan;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;


public class NotePad extends JFrame {

    public static void main(String[] args) {
        NotePad notePad = new NotePad();
    }

    TextArea textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
    private static final String DEFAULT_NAME = "NotePad";
    private String fileName = DEFAULT_NAME;

    public NotePad() {
        setVisible(true);
        setSize(500, 500);
        setTitle(fileName);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(textArea);

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu file = new Menu("File");
        menuBar.add(file);

        MenuItem newFile = new MenuItem("New");
        file.add(newFile);

        MenuItem open = new MenuItem("Open");
        file.add(open);

        MenuItem save = new MenuItem("Save");
        file.add(save);

        MenuItem saveAs = new MenuItem("Save As");
        file.add(saveAs);

        MenuItem close = new MenuItem("Close");
        file.add(close);

        newFile.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (fileName.equals(DEFAULT_NAME)
                        && textArea.getText().trim().length() > 0) {

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
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser open = new JFileChooser();
                int option = open.showOpenDialog(textArea);
                if (option == JFileChooser.APPROVE_OPTION) {
                    textArea.setText("");
                    try {
                        Scanner scanner = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                        while (scanner.hasNext()) {
                            textArea.append(scanner.nextLine() + "\n");
                        }
                    } catch (FileNotFoundException e1) {
                        System.out.println(e1.getMessage());
                    }
                }
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea.getText().trim().length() <= 0) {
                    int saveOption = JOptionPane.showConfirmDialog(textArea, fileName + "Save this file if it is empty");
                    if (saveOption == JOptionPane.YES_OPTION) {
                        JFileChooser save = new JFileChooser();
                        int option = save.showSaveDialog(textArea);
                        if (option == JFileChooser.APPROVE_OPTION) {
                            try {
                                BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                                out.write(textArea.getText());
                            } catch (IOException e1) {
                                System.out.println(e1.getMessage());
                            }
                        } else if (saveOption == JOptionPane.NO_OPTION || saveOption == JOptionPane.CANCEL_OPTION) {
                            try {
                                save.wait();
                            } catch (InterruptedException e1) {
                                textArea.setText("");
                            }

                        }
                    }
                }
            }
        });
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser saveAs = new JFileChooser();
                int saveAsOption = saveAs.showSaveDialog(textArea);
                if (saveAsOption == JFileChooser.APPROVE_OPTION) {

                }
            }
        });
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void save(File selectedFile) {
    }
}

