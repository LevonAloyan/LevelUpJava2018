package com.company.multithreading.specialforliana;

public class MyThread extends Thread {

  private String message;

  public MyThread(String message){
    System.out.println("Before start method: "+this.getState());
    this.message = message;
    this.start();
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(message + " " + i);
      System.out.println("in the run method: "
          + getState().name());
      try {
        Thread.sleep(1000);
        System.out.println("in the sleep method: "
            + getState().name());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
