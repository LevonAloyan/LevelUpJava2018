package com.company.objectmethods;

public class B extends A {

  @Override
  public Byte doSmth() {
    Byte b = new Byte("5");
    System.out.println("B");
    return new Byte("");
  }
}
