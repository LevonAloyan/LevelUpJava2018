package com.company.multithreading.sync;

public class MyThread extends Thread {

  private String name;
  private Car car;

  public MyThread(String name, Car car) {
    this.name = name;
    this.car = car;
    this.start();
  }

  @Override
  public void run() {
    System.out.println("in the Thread run method");
    System.out.println(name);
    car.method1();
  }
}
