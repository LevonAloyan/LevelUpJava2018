package com.company.classintro;

public class Square extends Figure {

  public Square(int width, int height){
    super(width, height);
  }

  @Override
  public void draw() {
    System.out.println("draw Square");
  }

  @Override
  public int getArea() {
    System.out.println("calculate square area");
    return getHeight()*getWidth();
  }

}
