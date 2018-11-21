package com.company.stringdemo;

public class StringDemo {
 private static String testString = "Hello world";

  public static void main(String[] args) {
//    testsSplit(testString);
//    testsTrim("   hello world        ");
//  testsSubstring(testString);
    testsCharAt(testString);
  }

  public static void testsSplit(String testString){
    String[] split = testString.split(" ");
    for (String element : split) {
      System.out.println(element);
    }
  }

  public static void testsTrim(String testString){
    String trim = testString.trim();
    System.out.println(trim);
  }

  public static void testsSubstring(String testString){
    String substring = testString.substring(2,7);
    System.out.println(substring);
  }

  public static void testsCharAt(String testString){
    System.out.println(testString.length());
    for (int i = 0; i < testString.length(); i++) {
      if (i % 2 ==0 ) {
        System.out.println(testString.charAt(i));
      }
    }
  }

}
