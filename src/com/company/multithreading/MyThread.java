package com.company.multithreading;

public class MyThread extends Thread {

  public MyThread(){
    this.start();
  }

  @Override
  public void run() {
    System.out.println("in the run method");
    Thread.currentThread().setName("myThread");
    Thread.currentThread().getState();
    System.out.println(Thread.currentThread());
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
