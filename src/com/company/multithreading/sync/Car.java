package com.company.multithreading.sync;

public class Car {

  public void method1() {
    synchronized (this) {
      System.out.println("method1");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public synchronized void method2() {
    System.out.println("method2");
  }

  public void method3() {
    System.out.println("method3");
  }

  public synchronized static void method4() {
    System.out.println("static method 4");
  }

  public synchronized static void method5() {
    System.out.println("static method 5");
  }

  public static void method6() {
    System.out.println("static method 6");
  }

}
