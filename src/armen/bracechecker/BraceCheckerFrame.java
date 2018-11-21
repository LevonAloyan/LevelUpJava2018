package armen.bracechecker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class BraceCheckerFrame extends JFrame {
    private JTextArea   textArea     = new JTextArea();
    private JTextField  messageField = new JTextField();
    private Stack<String> stack = new StackImpl<>();

    List<Integer> list = new ArrayList<>();
    List<String> list1 = new ArrayList<>();

    public BraceCheckerFrame(){
        JPanel controlPanel = new JPanel();
        JPanel messagePanel = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        JButton parseButton = new JButton("Parse");

        parseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parseActionPerformed(e);
            }
        });

        controlPanel.add(parseButton);
        messagePanel.setLayout(new GridLayout(1, 1));

        messageField.setFont(messageField.getFont().deriveFont(Font.BOLD, 14));
        messageField.setForeground(Color.BLUE);

        messagePanel.add(messageField);

        scrollPane.getViewport().add(textArea);
        add(controlPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(messagePanel, BorderLayout.SOUTH);

        setLocation(100, 100);
        setSize(500, 400);
        setVisible(true);
//        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void parseActionPerformed(ActionEvent e){
        
       //TODO: implement Parse button logic
    }

    public static void main(String[] args) {
            new BraceCheckerFrame();
    }


}
