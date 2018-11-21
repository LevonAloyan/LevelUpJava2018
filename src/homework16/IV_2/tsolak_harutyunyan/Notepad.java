package homework16.IV_2.tsolak_harutyunyan;



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

public class Notepad extends JFrame {
    public static final  String DEFAULT_TITLE = "-Notepad";
    public static final String DEFAULT_FILENAME = "Untitled";
    private String fileName = DEFAULT_FILENAME + DEFAULT_TITLE;
    private JTextArea textArea;
    private JTextField resultMessageField;
    private BraceChecker braceChecker;
    private File file = null;
    private JFileChooser fileChooser;

    public Notepad() {

        super(DEFAULT_FILENAME);
        //fileChooser = new MyFileChooser();
        braceChecker = new BraceChecker();
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(textArea);
        JPanel tFPanel = new JPanel();
        GridLayout layout = new GridLayout(1, 1);
        tFPanel.setLayout(layout);
        resultMessageField = new JTextField();
        tFPanel.add(resultMessageField);
        add(scrollPane, BorderLayout.CENTER);
        add(tFPanel, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocation(200, 200);
        setVisible(true);
        // add  manu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        JMenuItem menuItemNew = new JMenuItem("New");
        JMenuItem menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemSave = new JMenuItem("Save");
        JMenuItem menuItemSaveAs = new JMenuItem("Save As...");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menu.add(menuItemNew);
        menu.add(menuItemOpen);
        menu.add(menuItemSave);
        menu.add(menuItemSaveAs);
        menu.add(menuItemExit);

        menuItemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleNewAction(e);
            }
        });
        menuItemOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOpenAction(e);
            }
        });
        menuItemSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSaveAction(e);
            }
        });
        menuItemSaveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSaveAsAction(e);
            }
        });
        menuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleExitAction(e);
            }
        });

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

            }
        });

    }

    private void newActionPerformed(ActionEvent e) {
        if (isChanged()) {
            if (textArea.getText().length() > 0) {
                int selecteOption = JOptionPane.showConfirmDialog(textArea,
                        "Do You want to save changes '" + fileName + "'");
                if (selecteOption == JOptionPane.NO_OPTION) {
                    textArea.setText("");
                } else if (selecteOption == JOptionPane.YES_OPTION) {
                    JFileChooser fileChooser = new JFileChooser();
                    int choice = fileChooser.showSaveDialog(textArea);
                    if (choice == JFileChooser.CANCEL_OPTION) {

                    } else if (choice == JFileChooser.APPROVE_OPTION) {
                        textArea.setText("");
                    }
                }
            }

        }
    }

    private boolean isChanged(){
        if(file == null && textArea.getText().trim().length() > 0){
            return true;
        } else if (file != null && file.exists()){
            //return result of comparison.
        }
        return false;

    }

    public static void main(String[] args) {

        Notepad notepadFrame = new Notepad();

    }


    private void handleExitAction(ActionEvent e) {
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

    private void handleSaveAsAction(ActionEvent e)
    {
        saveAs();
    }

    private void handleSaveAction(ActionEvent e) {
        save();
    }

    private void handleOpenAction(ActionEvent e) {
        if (textArea.getText().equals("") || isTextEquals(file)) {
            open();
        } else {
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

    private void handleNewAction(ActionEvent e) {
        if (textArea.getText().equals("") || isTextEquals(file)) {
            newAction();
        } else {
            switch (askSave()) {
                case 0:
                    saveAs();
                    newAction();
                    break;
                case 1:
                    newAction();
                    break;
            }
        }
    }

    void handleDocumentUpdate(DocumentEvent e) {

        if (!braceChecker.parse(textArea.getText())) {
            resultMessageField.setForeground(Color.RED);
            resultMessageField.setText(braceChecker.getMessage());
        } else {
            resultMessageField.setForeground(Color.black);
            resultMessageField.setText("No Error");
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
        if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            write(file, textArea.getText());
            setTitle(file.getName());
        }
    }

    public void newAction() {
        setTitle(DEFAULT_FILENAME);
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
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read(File file) {
        byte[] b = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(b);
    }

    public boolean isTextEquals(File f) {
        if (f == null) {
            return false;
        }
        String text;
        String notepadsText = textArea.getText();
        byte[] b = new byte[(int) f.length()];
        try (FileInputStream fis = new FileInputStream(f)) {
            fis.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = new String(b);
        return notepadsText.equals(text);
    }

    private int askSave() {
        int returnval = JOptionPane.showConfirmDialog(null, "Do you want save file?");
        return returnval;
    }
}
