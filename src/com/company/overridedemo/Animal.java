package com.company.overridedemo;

public abstract class Animal {

  public Animal move() {
    System.out.println("Animals can move");
    return new Dog();
  }

  public Animal move(String j, String i) {
    System.out.println("Animal can walk and run");
    return new Dog();
  }
  abstract void makeVoice();

}
