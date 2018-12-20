package com.company.dynamicarray.vahe;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArrayImpl(5);
//        dy.set(0,10);
//        dy.set(1,20);
//        dy.set(2,25);
//        dy.set(3,30);
//        dy.set(4,35);

//        System.out.println(dy.contains(15));
//        System.out.println(dy.get(-1));
//        System.out.println(dy.lastIndexOf(20));
//        System.out.println(dy.indexOf(10));

//          dy.add(1,45);
//          dy.add(2,50);
          dy.add(2);
          dy.add(3);
          dy.add(4);
          dy.add(5);
          dy.add(6);
          dy.add(7);
          dy.add(8);
          dy.add(9);
          dy.add(10);
          dy.add(11);
          dy.add(12);
          dy.add(13);
          dy.add(14);
          dy.add(15);

//          dy.removeByIndex(2);
//          dy.removeByIndex(3);
//        int i = dy.removeByIndex(dy.size() - 1);
//        System.out.println("Old Value :" + i);
        dy.remove(10);

        System.out.println(dy.print());


//        System.out.println(dy.remove(50));
    }
}
