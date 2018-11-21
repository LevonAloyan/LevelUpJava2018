package com.company.objectmethods;

public class A {

  protected Object doSmth(){
    System.out.println("parent");
    return new A();
  }

}
