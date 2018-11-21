package com.company;

import java.lang.reflect.Array;

public class Main {

  public static void main(String[] args) {
    int array [] = {1,2,3,4,5,6};

    Car bmw = new Bmw();
    bmw.setModel("BMW");
    Car mersedes = new Merserdes();
    ((Bmw) bmw).doFarshaj();
    mersedes.setModel("Mersedes");
    doPolimophism(bmw);
    doPolimophism(mersedes);
  }

  private static void doPolimophism(Car car) {
    System.out.println(car.getModel());
  }
}
