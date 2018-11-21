package homework16.III_26.levon_aloyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by levon on 3/14/16.
 */


public class NotepadFrame extends JFrame {
    JFrame f = new JFrame();
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane();
    static final String DEFAULT_NAME="Untitled";
    String fileName=DEFAULT_NAME ;
    private Boolean isFirstSave=false;
    File file;
    public NotepadFrame() {


        f.setSize(450, 450);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        scrollPane.getViewport().add(textArea);
        f.add(scrollPane, BorderLayout.CENTER);
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        jMenuBar.add(file);
        jMenuBar.add(edit);
        JMenuItem newFile = new JMenuItem("New");
        file.add(newFile);
        JMenuItem open = new JMenuItem("Open");
        file.add(open);
        JMenuItem save = new JMenuItem("Save");
        file.add(save);
        JMenuItem saveas = new JMenuItem("Save as");
        file.add(saveas);
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        f.setJMenuBar(jMenuBar);
        // new Text
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
              newActionPerformed(actionEvent);
            }
        });
// Exit notepad
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                exitActionPerformed(actionEvent);
            }
        });

        // Save

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saveActionPerformed(actionEvent);

            }
        });

        // open

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                openActionPerformed(actionEvent);
            }
        });

        // Save as

        saveas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saveasActionPreformed(actionEvent);
            }
        });
        f.setVisible(true);
    }




private void save(File file){
    JFileChooser chooser= new JFileChooser(file);


    try {
        PrintWriter fout= new PrintWriter(file);

        fout.print(textArea.getText());
        fout.close();


    } catch (FileNotFoundException e1) {
        Logger.getLogger(NotepadFrame.class.getName()).log(Level.SEVERE,null, e1);
    }
}

//NEW
    private void newActionPerformed(ActionEvent e) {

        if(fileName.equals(DEFAULT_NAME)
                && textArea.getText().trim().length() > 0) {

            int selecteOption = JOptionPane.showConfirmDialog(
                    this,
                    "Do You want to save changes '" + fileName + "'");
            if(selecteOption == JOptionPane.NO_OPTION){
                textArea.setText("");
            } else if(selecteOption == JOptionPane.YES_OPTION) {

                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(this);
                file=null;
                if(choice == JFileChooser.CANCEL_OPTION){

                } else if (choice == JFileChooser.APPROVE_OPTION){
                    save(fileChooser.getSelectedFile());
                    textArea.setText("");
                }
            }
        }
    }
    // exit
    private void exitActionPerformed(ActionEvent e) {
                   int selecteOption = JOptionPane.showConfirmDialog(
                    this,
                    "Do You want to save changes '" + fileName + "'");
            if(selecteOption == JOptionPane.NO_OPTION){
                System.exit(0);
            } else if(selecteOption == JOptionPane.YES_OPTION) {

                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(this);
                if(choice == JFileChooser.CANCEL_OPTION){

                } else if (choice == JFileChooser.APPROVE_OPTION){
                    save(fileChooser.getSelectedFile());
                    textArea.setText("");
                }
            }
        }



    // save
    private void saveActionPerformed(ActionEvent e) {
        if(isFirstSave){
            saveasActionPreformed(e);
            isFirstSave=true;
        }else{
//            save();
        }
    }

    // open

    private void openActionPerformed(ActionEvent e){
        JFileChooser chooser = new JFileChooser();
        int chooserValue = chooser.showSaveDialog(this);
        if(chooserValue==JFileChooser.APPROVE_OPTION) {
            try {
                Scanner fin= new Scanner(chooser.getSelectedFile());

                String buffer="";
                while (fin.hasNext()){
                    buffer+=fin.nextLine()+'\n';
                }
                textArea.setText(buffer);

            } catch (FileNotFoundException e1) {
               JOptionPane.showMessageDialog(this,"File not found!");
            }
        }
    }


    private void saveasActionPreformed(ActionEvent e){
        JFileChooser chooser = new JFileChooser();
        int chooserValue = chooser.showSaveDialog(this);
        if(chooserValue==JFileChooser.APPROVE_OPTION){
            try {
                PrintWriter fout=new PrintWriter(chooser.getSelectedFile());
                fout.print(textArea.getText());
                fout.close();
            } catch (FileNotFoundException e1) {
                Logger.getLogger(NotepadFrame.class.getName()).log(Level.SEVERE,null, e1);
            }
        }

    }

    public static void main(String[] args) {
        new NotepadFrame();
    }


}
