package homework16.III_26.tatev_hovsepyan;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Notepad extends JFrame {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.setVisible(true);
    }

    private static final String DEFAULT_NAME = "Default Name";
    public static String fileName = DEFAULT_NAME;
    private TextArea textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);


    public Notepad() {
        textArea.setBackground(Color.white);

        getContentPane().add(textArea);
        setSize(700, 550);
        setTitle(fileName);
        MenuBar menubar = new MenuBar();
        setMenuBar(menubar);
        Menu file = new Menu("file");
        menubar.add(file);
        MenuItem newFile = new MenuItem("new");
        file.add(newFile);
        MenuItem save = new MenuItem("save");
        file.add(save);
        MenuItem open = new MenuItem("open");
        file.add(open);
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


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

            private void save(File selectedFile) {
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser open = new JFileChooser();
                int option = open.showOpenDialog(textArea);
                if (option == JFileChooser.APPROVE_OPTION) {
                    textArea.setText("");
                    try {

                        Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                        while (scan.hasNext())
                            textArea.append(scan.nextLine() + "\n");
                    } catch (Exception ex) {

                        System.out.println(ex.getMessage());
                    }
                }
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(textArea.getText().trim().length() <= 0){
                    int option = JOptionPane.showConfirmDialog(textArea, "  This file is not changit,   continue? '" +  fileName + " '");
                }

                JFileChooser save = new JFileChooser();
                int option = save.showSaveDialog(textArea);

                if (option == JFileChooser.APPROVE_OPTION) {
                    try {

                        BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                        out.write(textArea.getText());
                        out.close();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        });
    }
}

