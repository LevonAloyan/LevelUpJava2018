package com.company.figure_gagik;

import javax.swing.*;
import java.awt.Graphics;
import java.util.Scanner;



public abstract class Figure {

    protected Scanner userInputScanner = new Scanner(System.in);

    protected int width;
    protected int height;
    protected String color;

    private static int frameWidth = 500;
    private static int frameHeight = 500;


    public static void createFrame() {

        JFrame frame = new JFrame("Painter");
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Custom Constructor / Initialization of Custom Variables
     *
     * All Child classes use the same Parameters
     *
     * @param width
     * @param height
     * @param color
     */

    public Figure(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /**
     *  Must have Default Constructor...
     */

    public Figure() {

    }

    /**
     * Abstract methods
     */

    public abstract void draw();

    public static void main(String[] args) {
        Figure figure = new Rectangle(5,5,"");
        figure.draw();

        figure = new Circle(5,5,"");
        figure.draw();

        figure = new Square(5,5,"");
        figure.draw();
    }
}
