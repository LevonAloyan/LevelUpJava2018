package com.company.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("Gagik");
    list.add("Levon");
    list.add("Liana");
    list.add("Aram");
    list.add("Ashot");
    list.add("Vahe");

//    for (String s : list) {
//      if (s.equals("Levon")){
//        list.add("Nad");
//      }
//    }

    Iterator<String> iterator = list.iterator();
    if (iterator.hasNext()) {
      list.remove("Levon");
    }

    for (String s : list) {
      System.out.println(s);
    }
  }

}
