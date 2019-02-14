package com.company.multithreading.specialforliana;

import java.lang.Thread.State;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    MyThread t1 = new MyThread("Mukik");
    State state = t1.getState();
    System.out.println("After start method: "+state.name());
    t1.join();
    System.out.println("after Join: "+ t1.getState().name());
    MyThread t2 = new MyThread("Dzukik");
    t2.join();
  }

}
