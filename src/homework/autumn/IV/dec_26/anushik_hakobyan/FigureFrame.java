package homework.autumn.IV.dec_26.anushik_hakobyan;

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
        JButton start = new JButton("start");
        JButton stop = new JButton("stop");
        JButton removeButton = new JButton("Remove");


       start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startActionPerformed(e);
            }

        });
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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


        controlPanel.add(addButton);
        controlPanel.add(start);
        controlPanel.add(stop);
        controlPanel.add(removeButton);

        add(controlPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);


        setSize(450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    private void addActionPerformed (ActionEvent e){
        canvas.add(new Rectangle(20,30, 50, 60, canvas, Color.MAGENTA));
        canvas.add(new Circle(100,100, 30, canvas));
    }

    private void startActionPerformed(ActionEvent e){
        canvas.start();
    }

    private void removeActionPerformed (ActionEvent e){
        canvas.remove();
    }

    public static void main(String[] args) {
        new FigureFrame();
    }


}
