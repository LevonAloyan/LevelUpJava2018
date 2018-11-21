package com.company.stringdemo;

public class StringUtil {

  public static void main(String [] args) {
    String s = trim("    hel lo     ");
    System.out.println(s);
  }

  public static String trim(String text){
      int i = 0;
      int j = text.length()-1;

      while (text.charAt(i) == ' '){
        i++;
      }
      while ( text.charAt(j) == ' '){
        j--;
      }
     return text.substring(i,j+1);
  }

}
