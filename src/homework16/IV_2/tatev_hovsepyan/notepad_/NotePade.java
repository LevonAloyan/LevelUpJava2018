package homework16.IV_2.tatev_hovsepyan.notepad_;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NotePade extends JFrame {
    private static final String DEFAULT_NAME = "Notepad";
    private BraceChecker braceChecker;
    private JTextArea textArea;
    private TextField resultMesaggeField;
    private Font font;
    private File file;
    private JFileChooser jFileChooser;

    public NotePade() {
        super(DEFAULT_NAME);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        jFileChooser = new JFileChooser();
        textArea = new JTextArea();
        resultMesaggeField = new TextField();
        font = new Font("Font.plain", Font.PLAIN, 14);
        braceChecker = new BraceChecker();
        textArea.setFont(font);
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.getViewport().add(textArea);
        JPanel jPanel = new JPanel();
        GridLayout layout = new GridLayout(1, 1);
        jPanel.setLayout(layout);
        jPanel.add(resultMesaggeField);
        add(jScrollPane, BorderLayout.CENTER);
        add(jPanel, BorderLayout.SOUTH);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu file = new JMenu("file");
        menuBar.add(file);
        JMenuItem newfile = new JMenuItem("new");
        JMenuItem open = new JMenuItem("open");
        JMenuItem save = new JMenuItem("save");
        JMenuItem exit = new JMenuItem("exit");
        JMenuItem saveAs = new JMenuItem("saveAs");
        JMenuItem search = new JMenuItem("search");
        file.add(newfile);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(search);
        file.add(exit);

        // LISTENER

        newfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grenq  en metod@ vorn or 
                newAction(e);

            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAction(e);

            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAction(e);

            }
        });
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAs(e);
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitAction(e);

            }
        });


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(200, 200);
        setVisible(true);
        resultMesaggeField.setFont(font);
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

                handleDocumentUpdate(e);


            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                handleDocumentUpdate(e);

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

                handleDocumentUpdate(e);

            }
        });




    }

    private void exitAction(ActionEvent e) {
        if (textArea.getText().equals("") || isTextEquals(file)) {
            exit();
        } else {
            switch (askSave()) {
                case 0:
                    saveAs();
                    exit();
                    break;
                case 1:
                    exit();
                    break;
            }
        }


    }

    public static void main(String[] args) {
        NotePade notePade = new NotePade();

    }
     private void handleDocumentUpdate(DocumentEvent e) {
        
        if (!braceChecker.parse(textArea.getText())) {
            resultMesaggeField.setForeground(Color.RED);
            resultMesaggeField.setText(braceChecker.getMessage());
        } else {
            resultMesaggeField.setForeground(Color.black);
            resultMesaggeField.setText("No Error");
        }
    }



    public void write(File file, String text) {
        String path;
        if (!file.getName().contains(".txt")) {
            path = file.getAbsolutePath() + "txt";
        } else {
            path = file.getAbsolutePath();
        }
        try (FileOutputStream outputStream = new FileOutputStream(path)) {
            outputStream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();


        }

    }

    public void exit() {
        System.exit(0);

    }

    public void save() {
        if (file != null) {
            write(file, textArea.getText());
        } else {
            saveAs();
        }
    }


    public void saveAs() {
        if (jFileChooser.showOpenDialog(jFileChooser) == JFileChooser.APPROVE_OPTION) {
            file = jFileChooser.getSelectedFile();
            write(file, textArea.getText());
            setTitle(file.getName());
        }
    }

    public void newFile() {
        setTitle(DEFAULT_NAME);
        textArea.setText("");
    }

    public void open() {
        if (jFileChooser.showOpenDialog(jFileChooser) == jFileChooser.APPROVE_OPTION) {
            file = jFileChooser.getSelectedFile();
            textArea.setText(read(file));
            setTitle(file.getName());
        }
    }

    public String read(File file) {
        byte[] b = new byte[(int) file.length()];
        try (FileInputStream fileInput = new FileInputStream(file)) {
            fileInput.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(b);

    }

    public boolean isTextEquals(File file) {
        if (file == null) {
            return false;
        }
        String text;
        String notepadsText = textArea.getText();
        byte[] b = new byte[(int) file.length()];
        try (FileInputStream FileImput = new FileInputStream(file)) {
            FileImput.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = new String(b);
        return notepadsText.equals(text);
    }

    private int askSave() {
        int returnVal = JOptionPane.showConfirmDialog(null, "do you want to save file ");
        return returnVal;
    }


    private void saveAs(ActionEvent e) {
        saveAs();
    }


    private void openAction(ActionEvent e) {
        if (textArea.getText().equals("") || isTextEquals(file)){
            open();
        }else {
            switch (askSave()) {
                case 0:
                    saveAs();
                    break;
                case 1:
                    open();
                    break;
            }
        }

    }

    private void newAction(ActionEvent e) {
        if (textArea.getText().equals("") || isTextEquals(file)){
            newFile();
        }else{
            switch (askSave()){
                case 0:
                    saveAs();
                    newFile();
                    break;
                case 1:
                    newFile();
                    break;
            }
        }

    }


    private void saveAction(ActionEvent e) {

        save();
    }


}
