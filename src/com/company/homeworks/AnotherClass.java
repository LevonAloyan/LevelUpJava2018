package com.company.homeworks;

public class AnotherClass {

  public static void main(String[] args) {
    System.out.println(methodA(true, 6));
    System.out.println(methodB(true, 6));
  }

  public static boolean methodA(boolean talking, int hour) {
    return (talking && (hour < 7 || hour > 20));
  }

  public static boolean methodB(boolean talking, int hour) {
    return (hour < 7 || hour > 20 && talking);
  }

}
