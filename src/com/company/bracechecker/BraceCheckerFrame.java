package com.company.bracechecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BraceCheckerFrame extends JFrame {

    private int frameWidth = 750;
    private int frameHeight = 500;
    private BraceChecker braceChecker = new BraceChecker();

    JFrame braceFrame = new JFrame("Brace Checker Program");

    JPanel messagePanel = new JPanel();
    JPanel controlPanel = new JPanel();
    JTextArea textArea = new JTextArea();
    JTextField messageField = new JTextField();
    JScrollPane scrollPane = new JScrollPane();

    JButton parseButton = new JButton("Parse");

    public BraceCheckerFrame() {
        initComponents();
    }

    public void initComponents() {

        parseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parseActionPerformed();
            }
        });

        braceFrame.setSize(frameWidth, frameHeight);
        braceFrame.setResizable(true);
        braceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

    private void parseActionPerformed() {

        boolean parseSuccessful = braceChecker.parse(textArea.getText());
        String message = braceChecker.getErrorMessage();
        if (parseSuccessful) {
            this.messageField.setForeground(Color.BLUE);
            this.messageField.setText(braceChecker.noErrors);
        } else {
            this.messageField.setForeground(Color.RED);
            this.messageField.setText(message);
        }

    }
}
