package homework16.IV_9.ruben_sharyan.notepad;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Notepad extends JFrame {

    private String fileName;
    private final String DEFAULT_NAME = "untitled";
    private boolean isChanged = false;
    private File currentFile;
    private Reader read;
    private Writer write;
    private JTextArea textArea;


    public Notepad(){
        fileName = DEFAULT_NAME;
        changeTitle();

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem neW = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("SaveAs");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(neW);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(exit);

        menuBar.add(file);

        textArea = new JTextArea();
        textArea.add(menuBar);

        JScrollPane scrol = new JScrollPane(textArea);

        scrol.setVerticalScrollBarPolicy(scrol.VERTICAL_SCROLLBAR_ALWAYS);
        scrol.setHorizontalScrollBarPolicy(scrol.HORIZONTAL_SCROLLBAR_ALWAYS);

        setSize(800, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(scrol);
        add(menuBar, BorderLayout.NORTH);

        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isChanged = true;
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isChanged = true;
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                isChanged = true;
            }
        });

        neW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newActionEvent(e);
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openActionEvent(e);
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveActionEvent(e);
            }
        });

        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAsActionEvent(e);
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitActionEvent(e);
            }
        });
    }


    private void newActionEvent(ActionEvent e){
        if (fileName.equals(DEFAULT_NAME) && textArea.getText().length() > 0){
            int selected = JOptionPane.showConfirmDialog(this,"Do you want to save changes '"+ fileName + "'?");
            if (selected == JOptionPane.NO_OPTION){
                textArea.setText("");
            }else if(selected == JOptionPane.YES_OPTION){
                saveAsActionEvent(e);
                newOptions();
            }
        }else {
            newOptions();
        }
    }
    private void newOptions(){
        currentFile = null;
        fileName = DEFAULT_NAME;
        textArea.setText("");
        isChanged = false;
        changeTitle();
    }

    private void openActionEvent(ActionEvent e){
        if(checkeForSave() || isChanged){
            int selected = JOptionPane.showConfirmDialog(this,"Do you want to save changes '"+ fileName + "'?");
            if(selected == JOptionPane.NO_OPTION){
                opening();
            }else if(selected == JOptionPane.YES_OPTION){
                saveAsActionEvent(e);
            }
        }else{
            opening();
        }
    }

    private void opening(){
        JFileChooser fileChooser = new JFileChooser();
        int choise = fileChooser.showOpenDialog(this);
        if(choise == fileChooser.APPROVE_OPTION){
            currentFile = fileChooser.getSelectedFile();
            textArea.setText(reader(currentFile));
            fileName = currentFile.getName();
            isChanged = false;
            changeTitle();
        }
    }

    private void saveActionEvent(ActionEvent e){
        if(currentFile == null){
            saveAsActionEvent(e);
        }else {
            try{
                write = new FileWriter(currentFile);
                BufferedWriter buff = new BufferedWriter(write);
                buff.write(textArea.getText());
                buff.close();
                isChanged = false;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    private void saveAsActionEvent(ActionEvent e){
        JFileChooser fileChooser = new JFileChooser();
        int choise = fileChooser.showSaveDialog(this);
        if(choise == JFileChooser.CANCEL_OPTION){
        }else if(choise == JFileChooser.APPROVE_OPTION){
            currentFile = fileChooser.getSelectedFile();
            fileName = currentFile.getName();
            saveActionEvent(e);
            changeTitle();
        }
    }

    private void exitActionEvent(ActionEvent e){
        if(checkeForSave() || isChanged){
            int selected = JOptionPane.showConfirmDialog(this,"Do you want to save changed '" + fileName +"'?");
            if(selected == JOptionPane.YES_OPTION){
                saveAsActionEvent(e);
            }else if(selected == JOptionPane.NO_OPTION){
                System.exit(0);
            }
        }else{
            System.exit(0);
        }
    }

    private boolean checkeForSave(){
        return fileName.equals(DEFAULT_NAME) && textArea.getText().length() > 0;
    }

    private void changeTitle(){
        setTitle(fileName + " - Notepad");
    }

    private String reader(File currentFile){
        this.currentFile = currentFile;
        String temp;
        String res = "";
        try{
            read = new FileReader(this.currentFile);
            BufferedReader buf = new BufferedReader(read);
            while ((temp = buf.readLine()) != null){
                res += temp;
            }
            buf.close();
        }catch (IOException e){
            System.out.println("IOexception " + e);
        }
        return res;
    }


    public static void main(String[] args) {
        new Notepad();
    }
}
