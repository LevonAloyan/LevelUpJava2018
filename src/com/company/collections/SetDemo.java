package com.company.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.company.algorithms.User;

public class SetDemo {

  public static void main(String[] args) {

    Set<User> stringSet = new HashSet<>();
    stringSet.add(new User("Levon",24));
    stringSet.add(new User("Vahe",22));
    stringSet.add(new User("Aram",25));
//    stringSet.add("Aram");
//    stringSet.add("Ashot");
//    stringSet.add("Liana");

    //
//    System.out.println(new Long(2147483648L).hashCode());
//
//    System.out.println("HashSet");
//    System.out.println();
//    for (String s : stringSet) {
//      System.out.println(s);
//    }

//    Set<String> stringSet = new LinkedHashSet<>();
//
//    stringSet.add("Levon");
//    stringSet.add("Gagik");
//    stringSet.add("Aram");
//    stringSet.add("Ashot");
//    stringSet.add("Ash");
//    stringSet.add("Liana");
//
//    System.out.println("LinkedHashSet");
//    System.out.println();
//    for (String s : stringSet) {
//      System.out.println(s);
//    }
//
    stringSet = new TreeSet<>();
//    stringSet.add("Levon");
//    stringSet.add("Gagik");
//    stringSet.add("Aram");
//    stringSet.add("Ashot");
//    stringSet.add("Ash");
//    stringSet.add("Liana");
//    stringSet.add("Vahe");
//    stringSet.add(null);
    stringSet.add(new User("Levon",24));
    stringSet.add(new User("Vahe",22));
    stringSet.add(new User("Aram",25));
    System.out.println("TreeSet");
    for (User s : stringSet) {
      System.out.println(s);
    }

    Short s1= 5;
    Short s2= 6;
    Set<Short> s= new HashSet<>();
    s.add(s1);
    s.add(s2);
    s.remove(5);

    for (Short aShort : s) {
      System.out.println(aShort);
    }

  }

}
