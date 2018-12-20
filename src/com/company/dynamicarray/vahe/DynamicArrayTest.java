package com.company.dynamicarray.vahe;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArrayImpl(5);
        dy.set(0,10);
        dy.set(1,20);
        dy.set(2,25);
        dy.set(3,30);
        dy.set(4,35);

//        System.out.println(dy.contains(15));
//        System.out.println(dy.get(2));
//        System.out.println(dy.lastIndexOf(20));
//        System.out.println(dy.indexOf(10));

          dy.add(1,45);
          dy.add(2,50);

        System.out.println(dy.remove(50));
    }
}
