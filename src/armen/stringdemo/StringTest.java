package armen.stringdemo;

import java.util.Arrays;

public class StringTest {

  public static void main(String[] args) {
    String [] test = StringUtil.split("a b c d", ' ');

    String s = Arrays.toString(test);
    System.out.println(s);
    //    String s = "Levon";
//    String b = "hello world";
//
//    String sting = new String();
//
//    System.out.println(String.format("hello %s", s));

//    char [] c = {'h','e','l','l','o'};
//    String st= new String(c);
//    System.out.println("Char array "+st);
//
//    StringBuilder stringBuilder = new StringBuilder("abc");
//    stringBuilder.append("d5678912345678912456");
//    System.out.println(stringBuilder);
//
//    System.out.println("length "+s.length());
//    System.out.println("length "+s.substring(1));
//    System.out.println(s.charAt(6));
//    s.trim();
//    s.contains("ello");
//    s.replace('l','o');
//    s.startsWith("he");
//    s.endsWith("lo");
//    System.out.println(s.indexOf(" "));
//    s.split(" ");

  }

}
