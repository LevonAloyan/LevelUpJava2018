package com.company.classintro;

public class Rectangle extends Figure {

  public Rectangle(int width, int height){
    super(width,height);
  }

  public Rectangle(){
  }

//  @Override
  public void draw() {
    int a = getHeight() + getWidth();
    System.out.println("draw rectangle");
  }

  @Override
  public int getArea() {
    System.out.println("calculate rectangle area");
    return getWidth()*getHeight();
  }

}
