package com.company.overload;

public class Main {


    public static void method(int a){
        System.out.println("Int");
    }

    public static void method(int ... a ){
        System.out.println("long");
    }

    public static void main(String[] args) {
        method(1);
    }
}
