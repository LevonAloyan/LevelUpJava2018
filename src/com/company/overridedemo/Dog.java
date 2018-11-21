package com.company.overridedemo;

public class Dog extends Animal {

  public Animal move() {
    System.out.println("Dog can walk and run");
    return new Dog();
  }

  public Animal move(int i) {
    System.out.println("Dog can walk and run");
    return new Dog();
  }

  public Animal move(int j, int i) {
    System.out.println("Dog can walk and run");
    return new Dog();
  }

  public Animal move(String i) {
    System.out.println("Dog can walk and run");
    return new Dog();
  }

  public void bark() {
    System.out.println("Dogs can bark");
  }







}
