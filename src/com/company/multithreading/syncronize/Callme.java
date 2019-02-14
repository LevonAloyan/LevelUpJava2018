package com.company.multithreading.syncronize;

class Callme {

  void call(String msg) {
    synchronized (this) {

      System.out.print("[" + msg);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Interrupted");
      }
      System.out.println("]");
    }
  }

  public String print(String a) {
    return a;
  }

  public synchronized static void staticMethod() {

  }

  public static void staticMethod1() {

  }

}