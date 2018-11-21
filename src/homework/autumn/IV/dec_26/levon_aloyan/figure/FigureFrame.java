package homework.autumn.IV.dec_26.levon_aloyan.figure;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FigureFrame extends JFrame {
    FigureCanvas canvas = new FigureCanvas();

    public FigureFrame() throws HeadlessException {
        super("Figure");

        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");
        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.start(e);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addActionPerformed(e);
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 removeActionPerformed(e);
            }
        });

controlPanel.add(startButton);
        controlPanel.add(addButton);
        controlPanel.add(removeButton);

        add(controlPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);


        setSize(450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    private void addActionPerformed (ActionEvent e){
        canvas.add(new Rectangle(10,10, 40, 50));
        canvas.add(new Circle(100,100, 30));
    }
    private void removeActionPerformed (ActionEvent e){
        canvas.remove();
    }



    public static void main(String[] args) {
        new FigureFrame();
    }


}
