package com.company;

public class Merserdes extends Car {

  public static String setColor( String a,String b) {
    System.out.println("third method");
    return "Meredes";
  }

  @Override
  public String setColor(Integer f) {
    return "";
  }

}
