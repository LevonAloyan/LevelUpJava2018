package com.company.staticDemo;

public class CarTests extends Car {

  public static void main(String[] args) {

    Car mercedes = new Car();
    mercedes.setAutomatic(true);
    mercedes.setModel("Mercedes");
    mercedes.setWheelCount(4);

    Car bmw= new Car();
    bmw.setAutomatic(false);
    bmw.setWheelCount(4);
    bmw.setModel("BMW");

    Car lexus= new Car();
    lexus.setAutomatic(false);
    lexus.setWheelCount(4);
    lexus.setModel("lexus");



    System.out.println(Car.getCarCount());

  }
}
