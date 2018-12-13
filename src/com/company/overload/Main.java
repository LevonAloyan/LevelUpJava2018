package com.company.overload;

public class Main {


    public static void method(String a) {
        System.out.println("Int");
    }

    public static int method(int a) {

        System.out.println("Integer");
        return a;
    }


    public static void main(String[] args) {
        method(5);
    }
}
