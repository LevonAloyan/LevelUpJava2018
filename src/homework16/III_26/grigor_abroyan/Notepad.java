package homework16.III_26.grigor_abroyan;


import javax.swing.*;
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

    }

    private static final String DEFAULT_NAME = "default name";
    private String fileName = DEFAULT_NAME;
    private TextArea textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);


    public Notepad() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 500);
        setTitle(fileName);
        getContentPane().setLayout(new BorderLayout());
        textArea.setFont(new Font("Century Gothic", Font.BOLD, 20));
        getContentPane().add(textArea);
        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);
        Menu file = new Menu("file");
        menuBar.add(file);
        MenuItem newfile = new MenuItem("new");
        file.add(newfile);
        MenuItem open = new MenuItem("open");
        file.add(open);
        final MenuItem save = new MenuItem("save");
        file.add(save);
        Menu color = new Menu("color");
        file.add(color);
        MenuItem black = new MenuItem("black");
        color.add(black);
        MenuItem blue = new MenuItem("blue");
        color.add(blue);
        MenuItem red = new MenuItem("red");
        color.add(red);


        newfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (fileName.equals(DEFAULT_NAME)
                        && textArea.getText().trim().length() > 0) {

                    int selecteOption = JOptionPane.showConfirmDialog(
                            textArea,
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
            public void actionPerformed(ActionEvent e) {
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
            public void actionPerformed(ActionEvent e) {
                if (textArea.getText().trim().length() <= 0) {
                    int saveOption = JOptionPane.showConfirmDialog(textArea, fileName + "  Ֆայլը դատարկ է պահե՞լ  դատարկ ֆայլ");
                    if (saveOption == JOptionPane.YES_OPTION) {
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
                    } else if (saveOption == JOptionPane.NO_OPTION || saveOption == JOptionPane.CANCEL_OPTION) {

                        try {
                            save.wait();

                        } catch (InterruptedException e1) {
                            textArea.setText("");
                        }
                    }
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

        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setBackground(Color.black);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setBackground(Color.blue);
            }
        });

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setBackground(Color.red);
            }
        });
    }


}


