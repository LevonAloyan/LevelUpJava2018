package com.company.collections.iterator;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Levon");
    list.add("Gagik");
    list.add("Liana");
    list.add("Aram");
    list.add("Ashot");

    for (String s : list) {
      list.add("Levon");
    }

  }

}
