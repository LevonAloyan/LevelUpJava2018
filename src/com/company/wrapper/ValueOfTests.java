package com.company.wrapper;

public class ValueOfTests {

  public static void main(String[] args) {
    Long var1 = Long.valueOf(122);
    Long var2 = Long.valueOf(122);
    System.out.println(var1 == var2);

    Long var3 = Long.valueOf(225);
    Long var4 = Long.valueOf(225);
    System.out.println(var3 == var4);

  }

}
