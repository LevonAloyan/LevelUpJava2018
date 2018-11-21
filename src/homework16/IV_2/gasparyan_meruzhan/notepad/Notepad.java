package homework16.IV_2.gasparyan_meruzhan.notepad;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Notepad extends JFrame {
    private final static String DEFAULT_FILE_NAME = "Untitled.txt";
    private File filenot = null;
    private JTextArea textArea;

    public Notepad() {
        super(DEFAULT_FILE_NAME);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem New = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save as");
        JMenuItem exit = new JMenuItem("Exit");
        textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        fileMenu.add(New);
        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.add(saveAs);
        fileMenu.add(saveAs);
        fileMenu.add(exit);
        setJMenuBar(menuBar);
        setSize(700, 500);
        add(scroll, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        New.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newActionPerformed(e);
            }

        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser openFile = new JFileChooser();
                openFile.showDialog(null, "open");
                File file = openFile.getSelectedFile();
                if (file.exists()) {
                    FileInputStream in = null;
                    try {
                        in = new FileInputStream(file);
                        int length = in.available();
                        byte[] buf = new byte[length];
                        in.read(buf);
                        textArea.setText(new String(buf));
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } finally {

                        try {
                            if (in != null) in.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }

                    filenot = file;
                    setTitle(filenot.getAbsolutePath());
                }
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (filenot == null) {
                    saveFile();
                } else {
                    OutputStream ot = null;

                    try {
                        ot = new FileOutputStream(filenot);
                        ot.write(textArea.getText().getBytes());
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } finally {
                        try {
                            if (ot != null) ot.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        });

        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }

        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea.getText().trim().length() == 0 && filenot == null) {
                    System.exit(0);
                } else if (textArea.getText().trim().length() > 0 && filenot != null) {
                    fileAppend();
                    System.exit(0);
                } else if (textArea.getText().trim().length() > 0 && filenot == null) {
                    saveFile();
                    System.exit(0);
                }
            }
        });

    }



    private void newActionPerformed(ActionEvent e) {
        if (textArea.getText().trim().length() > 0 && filenot == null) {
            saveFile();
            filenot = null;
            textArea.setText("");
            setTitle(DEFAULT_FILE_NAME);
        } else if (textArea.getText().trim().length() > 0 && filenot != null) {
            fileAppend();
        }

    }


    private String serchFile(String patch, JFileChooser fileChooser) {
        File file = new File(patch + ".txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } else {
            int i = JOptionPane.showConfirmDialog(fileChooser, file.getName() + "  already exists.\n you want to replace it?", "Warning",
                    JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
            if (i == JOptionPane.OK_OPTION) {
                file = new File(patch + ".txt");
            } else {
                int sav = fileChooser.showSaveDialog(this);
                if (sav == JFileChooser.APPROVE_OPTION) {
                    serchFile(fileChooser.getSelectedFile().getPath(), fileChooser);

                    try {
                        file.createNewFile();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    filenot = file;
                    setTitle(filenot.getAbsolutePath());
                }
            }
            return file.getAbsolutePath();
        }
        return null;
    }

    private void saveFile() {
        int select = JOptionPane.showConfirmDialog(this, "Do You want to save changes " + DEFAULT_FILE_NAME);
        if (select == JOptionPane.OK_OPTION) {
            JFileChooser openFile = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt", ".txt");
            openFile.setFileFilter(filter);
            if (openFile.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                FileWriter fw = null;
                try {
                    String patch = serchFile(openFile.getSelectedFile().getPath(), openFile);
                    if (patch != null) {
                        fw = new FileWriter(patch);
                        fw.write(textArea.getText());
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    try {
                        if (fw != null) fw.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        } else if (select == JOptionPane.NO_OPTION) {
            textArea.setText("");
        }
    }

    private void fileAppend() {
        InputStream sev;
        try {
            sev = new FileInputStream(filenot);
            try {
                int lengthFile = sev.available();
                if (textArea.getText().length() == lengthFile) {
                    textArea.setText("");
                } else {
                    saveFile();

                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
