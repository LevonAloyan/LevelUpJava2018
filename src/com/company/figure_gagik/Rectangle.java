package com.company.figure_gagik;


import java.awt.Graphics;

public class Rectangle extends Figure{

    public Rectangle(int width, int height, String color) {
        super(width, height, color);
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle");;
    }
}
