package com.company.multithreading.sync;

public class Car {

  public synchronized void method1() {
    System.out.println("method1");
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("end of thread 1");
  }

  public void method2() {
    System.out.println("start");
    synchronized (this) {
      System.out.println("method2");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("end");
  }

  public void method3() {
    System.out.println("method3");
  }

  public static void method4() {
    synchronized (Car.class) {
      System.out.println("static method 4");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }

  public synchronized static void method5() {
    System.out.println("static method 5");
  }
//
//  public static void method6() {
//    System.out.println("static method 6");
//  }

}
