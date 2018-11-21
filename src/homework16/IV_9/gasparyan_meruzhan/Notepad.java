package homework16.IV_9.gasparyan_meruzhan;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Notepad extends JFrame {
    private final static String DEFAULT_FILE_NAME = "Untitled.txt";
    private File curentFile = null;
    private JTextArea textArea;
    private boolean curentSaveProces =false;

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
                openActionPerformed(e);
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveActionPerformed(e);
            }
        });

        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAsActionPerformed(e);
            }

        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitActionperformed(e);
            }
        });

    }

    public static void main(String[] args) {
        new Notepad();
    }

    private void newActionPerformed(ActionEvent e) {

        if (isChanged()) {
            saveAsFile(e);
        } else {
            textArea.setText("");
            curentFile = null;
            setTitle(DEFAULT_FILE_NAME);
        }
    }

    private void saveActionPerformed(ActionEvent e) {
        if (curentFile == null || !curentFile.exists()) {
            saveAsFile(e);
        } else {
            save();
        }
    }

    private void openActionPerformed(ActionEvent e) {
        if (isChanged()) {
            saveAsFile(e);
        }/*else {*/
        JFileChooser openFile = new JFileChooser();
        int select = openFile.showDialog(null, "open");
        File file = openFile.getSelectedFile();
        if (select == JFileChooser.APPROVE_OPTION) {
            if (file.exists()) {
                FileInputStream in = null;
                try {
                    in = new FileInputStream(file);
                    int length = in.available();
                    byte[] buf = new byte[length];
                    in.read(buf);
                    textArea.setText(new String(buf));
                    ;
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {

                    try {
                        if (in != null) in.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                curentFile = file;
                setTitle(curentFile.getAbsolutePath());
//            }
            }
        }
    }

    private void saveAsActionPerformed(ActionEvent e){
        savAs0(e);
    }

    private void exitActionperformed(ActionEvent e) {
        if (!isChanged() && curentFile == null) {
            System.exit(0);
        } else if (isChanged() && curentFile != null) {
            saveAsFile(e);
            if(curentSaveProces) System.exit(0);
        } else if (isChanged()&& curentFile == null) {
            saveAsFile(e);
            if (curentSaveProces) System.exit(0);
        }
    }

    private void savAs0(ActionEvent e){
        JFileChooser openFile = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt", "*.txt");
        openFile.setFileFilter(filter);
        if (openFile.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            FileWriter fw = null;
            try {
                String patch = serchFile(openFile.getSelectedFile().getPath(), openFile);
                if (patch != null) {
                    fw = new FileWriter(patch);
                    fw.write(textArea.getText());
                    curentSaveProces =true;
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
            int i = JOptionPane.showConfirmDialog(this, file.getName() + "  already exists.\n you want to replace it?", "Warning",
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
                    curentFile = file;
                    setTitle(curentFile.getAbsolutePath());
                }
            }
            return file.getAbsolutePath();
        }
        return null;
    }

    private void saveAsFile(ActionEvent e) {
        int select = JOptionPane.showConfirmDialog(this, "Do You want to save changes " + DEFAULT_FILE_NAME);
        if (select == JOptionPane.OK_OPTION) {
            savAs0(e);
        } else if (select == JOptionPane.NO_OPTION) {
            textArea.setText("");
            curentFile = null;
            setTitle(DEFAULT_FILE_NAME);
            curentSaveProces = true;
        } else if (select == JOptionPane.CANCEL_OPTION) {

        }
    }

    private void save() {
        OutputStream ot = null;

        try {
            ot = new FileOutputStream(curentFile);
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

    private boolean isChanged() {
        if (curentFile == null && textArea.getText().trim().length() > 0) {
            return true;
        } else if (curentFile != null && curentFile.exists()) {
            FileInputStream fileReader = null;
            String str;
            try {
                fileReader = new FileInputStream(curentFile);
                int len = fileReader.available();
                byte[] buf = new byte[len];
                fileReader.read(buf);
                str = new String(buf);
                return !str.equals(textArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileReader != null)
                        fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //return result of comparison.
        } else if (curentFile != null && !curentFile.exists()) {
//            try {
//                curentFile.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            return true;
        }
        return false;

    }

}
