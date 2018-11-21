package homework16.III_19.grigor_abroyan;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class Notepad extends JFrame implements ActionListener {

    public TextArea textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
    //menuBar
    private MenuBar menuBar = new MenuBar();
    private MenuItem save = new MenuItem();
    private Menu file = new Menu();
    private MenuItem open = new MenuItem();
    private MenuItem close = new MenuItem();

    // menuBar 2

    private Menu help = new Menu();
    private MenuItem openHelp = new MenuItem();
    private MenuItem saveHelp = new MenuItem();
    private MenuItem closeHelp = new MenuItem();

    private Menu color = new Menu();

    //constroctor

    public Notepad() {
        this.setSize(700, 500);
        this.setTitle("my first Notepad");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.textArea.setFont(new Font("Century Gothic", Font.BOLD, 12));
        this.getContentPane().setLayout(new BorderLayout());
        getContentPane().add(textArea);

        //FILE
        this.setMenuBar(this.menuBar);
        this.menuBar.add(this.file);
        this.file.setLabel("file");
        //open
        this.open.setLabel("open");
        this.open.addActionListener(this);
        this.open.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        this.file.add(this.open);
        //save
        this.save.setLabel("save");
        this.save.addActionListener(this);
        this.save.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        this.file.add(this.save);
        //close
        this.close.setLabel("close");
        this.close.addActionListener(this);
        this.close.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        this.file.add(this.close);

        //HELP
        this.setMenuBar(this.menuBar);
        this.menuBar.add(this.help);
        this.help.setLabel("help");
        //open help
        this.openHelp.setLabel("open help");
        this.openHelp.addActionListener(this);
        this.openHelp.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        this.help.add(this.openHelp);
        //save help
        this.saveHelp.setLabel("save help");
        this.saveHelp.addActionListener(this);
        this.saveHelp.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        this.help.add(this.saveHelp);
        //close help
        this.closeHelp.setLabel("close help");
        this.closeHelp.addActionListener(this);
        this.closeHelp.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        this.help.add(this.closeHelp);

        this.setMenuBar(this.menuBar);
        this.menuBar.add(this.color);
        this.color.setLabel("Color");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                textArea.setText("Open Notepad by clicking the Open button Picture of the Open button");

            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("In the Save As dialog box, in the Save as type list, tap or click All Files");
            }
        });
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("");
            }
        });
        openHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("Open Notepad by clicking the Open button Picture of the Open button." +
                        " In the search box, type Notepad, and then, in the list of results, click Notepad.");
            }
        });
        saveHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("In the Save As dialog box, in the Save as type list, tap or click All Files (*.*). ");
            }
        });
        closeHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("bla bla");
            }
        });
    }


}

class main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.setVisible(true);


    }
}
