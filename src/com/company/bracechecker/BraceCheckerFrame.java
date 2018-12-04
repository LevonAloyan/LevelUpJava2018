package com.company.bracechecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BraceCheckerFrame extends JFrame {

    private JButton button = new JButton("Parse");
    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();

    BraceCheckerFrame() {
        JPanel controlPanel = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        JPanel messagePanel = new JPanel();
        textField.setFont(new Font(Font.MONOSPACED,Font.BOLD,32));
        textField.setForeground(Color.RED);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parseActionPerformed();
            }
        });

        controlPanel.add(button);


        scrollPane.add(textArea);
        messagePanel.add(textField);

        add(controlPanel, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);

        setSize(700,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    private String getText(){
        return textArea.getText();
    }

    private void parseActionPerformed(){
        textField.setText(getText());
        textArea.setText("");
    }
}
