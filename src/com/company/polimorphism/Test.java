package com.company.polimorphism;

public class Test {

  public static void main(String[] args) {
    Shape shape = new Rectangle();
    System.out.println(shape.draw());
    shape= new Square();
    System.out.println(shape.draw());


  }

}
