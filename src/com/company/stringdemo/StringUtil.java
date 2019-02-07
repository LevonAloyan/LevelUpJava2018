package com.company.stringdemo;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

//  public static void main(String[] args) {
//    String s = trim("    hel lo     ");
//    System.out.println(s);
//  }

  protected static String trim(String text) {
    int i = 0;
    int j = text.length() - 1;

    while (text.charAt(i) == ' ') {
      i++;
    }
    while (text.charAt(j) == ' ') {
      j--;
    }
    return text.substring(i, j + 1);
  }

  private static String reverseString(String inputString) {

    StringBuilder stringBuilder = new StringBuilder();

    for (int i = inputString.length() - 1; i >= 0; i--) {

      stringBuilder.append(inputString.charAt(i));
    }

    return stringBuilder.toString();
  }

  public static void main(String[] args) {
    String hello = reverseString("Hello");
//    System.out.println(hello);

    List <String> list = new ArrayList<>();

    String a = "Hello";
    String b = "Hello";

    System.out.println(a == b);

    String c = new String("Hello");
    String d = new String("Hello");

    System.out.println(c == d);

    System.out.println(a.equals(c));

    Float s = 12.5f;
    Float s1 = 12.5f;

    System.out.println(s == s1);
  }

}
