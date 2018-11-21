package com.company.classintro;

public abstract class Figure {

  private int width;
  private int height;
  private String color;

  public Figure(int width, int height, String color) {
    this.color = color;
    this.height = height;
    this.width = width;
  }

  public Figure(int width, int height) {
    this.width = width;
    this.height = height;
    this.color = "Red";
  }

  public Figure() {
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


  public abstract void draw();
//
  public abstract int getArea();

}
