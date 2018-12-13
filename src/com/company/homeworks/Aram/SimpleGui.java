package com.company.homeworks.Aram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGui extends JFrame {
    private JButton button = new JButton("press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Inputs :");
    private JRadioButton radio1 = new JRadioButton("press");
    private JRadioButton radio2 = new JRadioButton("press");
    private JCheckBox check = new JCheckBox("press");

    public SimpleGui (){
        super("Simple Example");
        this.setBounds(100, 100, 100, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        button.add(radio1);
        button.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener ());
        container.add(button);

    }
     class ButtonEventListener implements ActionListener{

         @Override
         public void actionPerformed(ActionEvent e) {
             String  message = "";
             message += "Button was pressed \n";
             message += "Text is " + input.getText() +"\n";
             message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + "is selected \n";
             message += "Ceckbox is " + ((check.isSelected() ? "checked" : "uncheked"));
             JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);
         }
     }
}

