package com.company.exception;

public class ThisDemo {
    private int a;


    ThisDemo() {
        this("", 5);

    }

    ThisDemo(int a) {
        this.a = a;
    }

    ThisDemo(String a, int b) {

    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
    }


}
