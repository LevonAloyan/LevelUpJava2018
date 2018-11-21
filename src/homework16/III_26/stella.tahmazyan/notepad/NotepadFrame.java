package homework16.III_26.stella.tahmazyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotepadFrame extends JFrame {
    String filename = "firstFile";
    JTextArea text;
    boolean isFirstSave = true;
    String inputText;

    public NotepadFrame() {
//        super("Notepad");
        setTitle(filename);

        text = new JTextArea();
        JScrollPane scrol = new JScrollPane();

        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        scrol.getViewport().add(text);

        add(scrol, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem newM = new JMenuItem("New");
        fileMenu.add(newM);
        JMenuItem open = new JMenuItem("Open");
        fileMenu.add(open);
        JMenuItem save = new JMenuItem("Save");
        fileMenu.add(save);
        JMenuItem saveAs = new JMenuItem("Save As");
        fileMenu.add(saveAs);
        JMenuItem exit = new JMenuItem("Exit");
        fileMenu.add(exit);

        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        JMenu searchMenu = new JMenu("Search");
        JMenu viewMenu = new JMenu("View");

        menuBar.add(searchMenu);
        menuBar.add(viewMenu);

        setJMenuBar(menuBar);


        //NEW METHOD
        newM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newActionPerformed(e);
            }
        });


        //OPEN METHOD
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openActionPerformed(e);
            }
        });


        //SAVE METHOD
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveActionPerformed(e);
            }
        });


        //SAVE AS METHOD
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAsActionPerformed(e);
            }
        });


        //EXIT METHOD
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitActionPerformed(e);
            }
        });
    }


    private void newActionPerformed(ActionEvent e) {
        if (text.getText().length() > 0) {
            int confirmMessage = JOptionPane.showConfirmDialog(this, "Do you want to save?");
            if (confirmMessage == 0) {
                saveActionPerformed(e);
            } else if (confirmMessage == 1) {
                text.setText("");
            } else if (confirmMessage == 2) {
                return;
            } else {

            }
        }
    }

    private void openActionPerformed(ActionEvent e) {

    }

    private void saveActionPerformed(ActionEvent e) {
        saveAsActionPerformed(e);
    }





    private void saveAsActionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int choice = fileChooser.showSaveDialog(this);
        if (choice == JFileChooser.APPROVE_OPTION) {
            File file;
            PrintWriter writer = null;
            file = fileChooser.getSelectedFile();
            try {
                writer = new PrintWriter(file);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            if (isFirstSave) {
                isFirstSave = false;
                inputText = text.getText();
                    writer.print(inputText);
                    writer.close();
            } else {
                String name = file.getName();
                file.delete();
                file = new File(name);
                try {
                    writer = new PrintWriter(file);
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                writer.print(text.getText());
                writer.close();
            }
        } else {
            return;
        }

    }

    void exitActionPerformed(ActionEvent e) {

    }



    public static void main(String[] args) {
        new NotepadFrame();
    }
}
