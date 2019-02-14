package com.company.multithreading;

public class MyThread1 implements Runnable {

  private Thread thread;
  private String name;

  public MyThread1(String name) {
    this.name = name;
    thread = new Thread(this, name);
    System.out.println("New thread: " + thread);
    thread.start();
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread());
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(name + ": " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(name + "Interrupted");
    }
    System.out.println(name + " exiting.");
  }

  public Thread getThread() {
    return thread;
  }

  public void setThread(Thread thread) {
    this.thread = thread;
  }
}