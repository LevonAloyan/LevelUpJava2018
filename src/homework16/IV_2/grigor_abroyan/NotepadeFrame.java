package homework16.IV_2.grigor_abroyan;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotepadeFrame extends JFrame {

    private static final String DEFAULT_NAME = "Untitled";
    private JTextArea textArea;
    private Font font;
    private JTextField resultMessage;
    private File file;
    private BraceChecker braceChecker;
    private JFileChooser fileChooser;


    public NotepadeFrame() {
        super(DEFAULT_NAME);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        fileChooser = new JFileChooser();
        braceChecker = new BraceChecker();
        textArea = new JTextArea();
        font = new Font("font Plain", Font.PLAIN, 14);
        braceChecker = new BraceChecker();
        textArea.setFont(font);
        JPanel jPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(1, 1);
        jPanel.setLayout(gridLayout);
        resultMessage = new JTextField();
        jPanel.add(resultMessage);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(textArea);
        add(scrollPane, BorderLayout.CENTER);
        add(jPanel, BorderLayout.SOUTH);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("file");
        menuBar.add(file);
        final JMenuItem newfile = new JMenuItem("new");
        JMenuItem open = new JMenuItem("open");
        JMenuItem save = new JMenuItem("save");
        JMenuItem exit = new JMenuItem("exit");
        final JMenuItem saveAs = new JMenuItem("save as");
        final JMenuItem search = new JMenuItem("search");
        file.add(newfile);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(search);
        file.add(exit);

        // listener

        newfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                saveAsAction(e);
            }
        });
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchAction(e);
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitAction(e);
            }
        });
        setJMenuBar(menuBar);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(200, 200);
        setVisible(true);
        resultMessage.setFont(font);
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                  update();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });


    }



    public static void main(String[] args) {
        NotepadeFrame notepadeFrame = new NotepadeFrame();
    }


    public boolean isEquals(File file) {
        if (file == null) {
            saveAs();
        }
        String text;
        String notepadeText = textArea.getText();
        byte[] b = new byte[(int) file.length()];
        try (FileInputStream fileOut = new FileInputStream(file)) {
            fileOut.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = new String(b);
        return notepadeText.equals(text);

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
        if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            write(file, textArea.getText());
            setTitle(file.getName());
        }
    }


    public void newFile() {
        setTitle(DEFAULT_NAME);
        textArea.setText("");
    }

    public void open() {
        if (fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            textArea.setText(read(file));
            setTitle(file.getName());
        }
    }

    public void write(File file, String text) {
        String path;
        if (!file.getName().contains(".txt")) {
            path = file.getAbsolutePath() + ".txt";
        } else {
            path = file.getAbsolutePath();
        }
        try (FileOutputStream fileOut = new FileOutputStream(path)) {
            fileOut.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
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
    private int  askSave(){
        int returnVal = JOptionPane.showConfirmDialog(null,   " do you want save file ? ");
        return returnVal;
    }

    private void exitAction(ActionEvent e) {
        if (textArea.getText().equals("") || isEquals(file)){
            exit();
        }else {
            switch (askSave()){
                case 0:
                    saveAs();
                    exit();
                    break;
                case 1:
                    exit();
            }
        }
    }
    private void searchAction(ActionEvent e) {

    }
    void update(){
        if(!braceChecker.parse(textArea.getText())){
            resultMessage.setForeground(Color.red);
            resultMessage.setText(braceChecker.getMessage());
        }else {
            resultMessage.setForeground(Color.black);
            resultMessage.setText("No Error");
        }
    }

    private void saveAsAction(ActionEvent e) {
        saveAs();
    }

    private void saveAction(ActionEvent e) {
        save();
    }

    private void openAction(ActionEvent e) {
        if (textArea.getText().equals("") || isEquals(file)){
            open();
        }else{
            switch (askSave()){
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
        if(textArea.getText().equals("") || isEquals(file)){
            newFile();
        }else {
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


}
