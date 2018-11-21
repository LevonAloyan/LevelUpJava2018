package homework16.IV_9.andranik_khachatryan;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import static com.sun.javafx.fxml.expression.Expression.add;

/**
 * Created by User on 4/6/2016.
 */
public class Notepad extends JFrame {

    private String fileName;
    private final String DEFAULT_NAME = "untitled";
    private boolean isChanged = false;
    File currentFile;
    JTextArea textArea;
    Reader reader;
    Writer writer;

    public Notepad(){
        fileName = DEFAULT_NAME;

        JPanel panel = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save As");
        JMenuItem exit = new JMenuItem("Exit");

        textArea = new JTextArea();

        file.add(newItem);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(exit);

        menuBar.add(file);
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {documentActionPerformed(e);}

            @Override
            public void removeUpdate(DocumentEvent e) {documentActionPerformed(e);}

            @Override
            public void changedUpdate(DocumentEvent e) {documentActionPerformed(e);}
        });

        add(textArea);
        add(menuBar,BorderLayout.NORTH);

        //newItem menu item actionListener

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newActionPerformed(e);
            }
        });

        // open menu item actionListener

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {openActionPerformed(e);}
            });

        // save menu item actionListener

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {saveActionPerformed(e);}
        });

        // save As menu item actionListener

        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {saveAsActionPerformed(e);}
        });

        //exit menu item actionListener
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {exitActionPerformed(e);}
        });

        setSize(850,850);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        changeTitle();

    }

    private void newActionPerformed(ActionEvent e){
        if (checkForSave()) {
            int selecteOption = JOptionPane.showConfirmDialog(
                    this,
                    "Do You want to save changes '" + fileName + "'");
            if (selecteOption == JOptionPane.NO_OPTION) {
                textArea.setText("");
            } else if (selecteOption == JOptionPane.YES_OPTION) {
                saveAsActionPerformed(e);
                currentFile = null;
                textArea.setText("");
                isChanged = false;
            }
        } else {
            textArea.setText("");
        }

    }

    private void openActionPerformed(ActionEvent e){
        if (checkForSave() || isChanged) {
            int selecteOption = JOptionPane.showConfirmDialog(
                    this,
                    "Do You want to save changes '" + fileName + "'");
            if (selecteOption == JOptionPane.NO_OPTION) {
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    currentFile = fileChooser.getSelectedFile();
                    textArea.setText(reader(currentFile));
                    fileName = currentFile.getName();
                    isChanged = false;
                    changeTitle();
                }
            } else if (selecteOption == JOptionPane.YES_OPTION) {
                saveAsActionPerformed(e);
            }
        }

    }

    private void saveActionPerformed(ActionEvent e){
        if (currentFile == null) {
            saveAsActionPerformed(e);
        } else {
            try {
                writer = new FileWriter(currentFile);
                BufferedWriter buff = new BufferedWriter(writer);
                buff.write(textArea.getText());
                buff.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

    }

    private void saveAsActionPerformed(ActionEvent e){
    JFileChooser fileChooser = new JFileChooser();
        int choice = fileChooser.showSaveDialog(this);
        if (choice == JFileChooser.CANCEL_OPTION) {
        } else if (choice == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();
            saveActionPerformed(e);
            fileName = currentFile.getName();
            changeTitle();
        }
    }

    private void exitActionPerformed(ActionEvent e){
        System.exit(0);
    }

    private void documentActionPerformed(DocumentEvent e){
    isChanged = true;
    }

    private boolean checkForSave(){return fileName.equals(DEFAULT_NAME) && textArea.getText().length() > 0;}



    private void changeTitle() {
        setTitle(fileName + " - Notepad");
    }
    private void cleverSave(ActionEvent e)throws IOException{
        if(currentFile == null){
            saveAsActionPerformed(e);
        }else{
            saveActionPerformed(e);
        }
    }
    private String reader(File currentFile) {
        this.currentFile = currentFile;
        String tmp;
        String res = "";
        try {
            reader = new FileReader(this.currentFile);
            BufferedReader br = new BufferedReader(reader);
            while ((tmp = br.readLine()) != null) {
                res += tmp;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void main(String[] args) {
      new Notepad();
    }
}
