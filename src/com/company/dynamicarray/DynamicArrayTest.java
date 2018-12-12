package com.company.dynamicarray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();


        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(4, 6);
        dynamicArray.add(4, 9);
        dynamicArray.add(3, 7);
        dynamicArray.add(5, 8);
        dynamicArray.add(6, 7);
        dynamicArray.add(8, 6);
        dynamicArray.add(9, 6);

//        dynamicArray.removeByIndex(4);
//        System.out.println(dynamicArray.size());
//        System.out.println(dynamicArray.contains(6));
//        System.out.println(dynamicArray.get(5));
//        System.out.println(dynamicArray.remove(6));
//        System.out.println(dynamicArray.indexOf(10));
//        System.out.println(dynamicArray.lastIndexOf(7));
        System.out.println(dynamicArray.set(5, 3));
    }
}
