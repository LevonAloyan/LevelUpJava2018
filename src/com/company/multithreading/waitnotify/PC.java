package com.company.multithreading.waitnotify;

class PC {

  public static void main(String [] args) {
    Q q = new Q();
    new Producer(q);
    new Consumer(q);
  }
}