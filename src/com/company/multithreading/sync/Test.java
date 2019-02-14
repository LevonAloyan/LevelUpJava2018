package com.company.multithreading.sync;

public class Test {

  public static void main(String[] args) {
    Car car1 = new Car();

    MyThread myThread1 = new MyThread("t1",car1);
    MyThread1 myThread2 = new MyThread1("t2",car1);
  }

}
