package com.company.multithreading;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    //Create thread with anonymous class

   /*Thread t =   new Thread(new Runnable() {
       @Override
       public void run() {
         System.out.println("in the runnable ");
         Thread.currentThread().setName("myThread");
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
     });
     t.start(); */

//    Create multiple thread

    MyThread1 t1 = new MyThread1("One");
    t1.getThread().join();
    MyThread1 t2 = new MyThread1("Two");
    t2.getThread().join();
    MyThread1 t3 = new MyThread1("Three");
    t3.getThread().join();


    System.out.println("Thread One is alive: "
        + t1.getThread().isAlive());
    System.out.println("Thread Two is alive: "
        + t2.getThread().isAlive());
    System.out.println("Thread Three is alive: "
        + t3.getThread().isAlive());
    System.out.println("Main thread exiting.");
//    try {
//      System.out.println("Waiting for threads to finish.");
//      t1.getThread().join();
//      t2.getThread().join();
//      t3.getThread().join();
//    } catch (InterruptedException e) {
//      System.out.println("Main thread Interrupted");
//    }

    System.out.println("Thread One is alive: "
        + t1.getThread().isAlive());
    System.out.println("Thread Two is alive: "
        + t2.getThread().isAlive());
    System.out.println("Thread Three is alive: "
        + t3.getThread().isAlive());
    System.out.println("Main thread exiting.");

  }
}
