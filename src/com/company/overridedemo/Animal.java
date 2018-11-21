package com.company.overridedemo;

public class Animal {

  public Animal move() {
    System.out.println("Animals can move");
    return new Dog();
  }

}
