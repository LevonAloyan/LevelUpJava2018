package com.company.overridedemo;

public class Dog extends Animal {

//  public Animal move() {
//    System.out.println("Dog can walk and run");
//    return new Dog();
//  }

  public Animal move(int i) {
    System.out.println("Dog can walk and run");
    return new Dog();
  }

  public String move(int j, int i) {
    System.out.println("Dog can walk and run");
    return "";
  }

  public Animal move(String j, String i) {
    System.out.println("Dog can walk and run string");
    return new Dog();
  }

  public Animal move(String i) {
    System.out.println("Dog can walk and run");
    return new Dog();
  }

  public void bark() {
    System.out.println("Dogs can bark");
  }


  @Override
  public void makeVoice() {
    System.out.println("haf");
  }
}
