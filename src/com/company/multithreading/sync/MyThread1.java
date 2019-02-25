package com.company.multithreading.sync;

public class MyThread1 extends Thread {

  private String name;
  private Car car;

  public MyThread1(String name, Car car) {
    this.name = name;
    this.car = car;
    this.start();
  }

  @Override
  public void run() {

    System.out.println("in the Thread1 run method");
    System.out.println(name);
    car.method2();
  }
}
