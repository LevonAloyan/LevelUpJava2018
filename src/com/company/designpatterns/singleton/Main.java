package com.company.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        SingleObject singleObject1 = SingleObject.getInstance();


        singleObject.print();
        System.out.println(singleObject);
        System.out.println(singleObject1);
    }
}
