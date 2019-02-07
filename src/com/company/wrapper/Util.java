package com.company.wrapper;

public class Util {

  public static void main(String[] args) {
    String s = "12345678912";
    int i = parseInt(s);
    System.out.println(i);

    System.out.println(9223372036854775807L+1);

  }

  public static int parseInt(String number) {
    int result = 0;
    for (int i = 0; i < number.length(); i++) {
      char currentChar = number.charAt(i);
      if (currentChar < '0' || currentChar > '9'){
        throw new InvalidIntegerException("Given number is not integer");
      }
      result = result * 10 + currentChar-'0';
    }
    return result;
  }

}
