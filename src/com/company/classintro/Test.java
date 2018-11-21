package com.company.classintro;

public class Test {

  public static void main(String[] args) {
    Figure figure = new Rectangle(5,6);
    figure.draw();
    System.out.println(figure.getArea());
    figure = new Square(2,2);
    figure.draw();
    System.out.println(figure.getArea());
  }

}
