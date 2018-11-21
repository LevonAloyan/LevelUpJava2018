package com.company.overridedemo;

public class TestOverride {

  public static void main(String[] args) {
    Animal animal = new Dog();
    animal.move();

    Dog dog = new Dog();

    dog.move(5,6);



    Animal animal1 = new Animal();

  }

}
