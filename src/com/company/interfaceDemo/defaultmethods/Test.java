package com.company.interfaceDemo.defaultmethods;

public class Test implements I1,I2 {

   static boolean isValid;

//    @Override
//    public void method() {
//        System.out.println("override method");
//    }

    public static void main(String[] args) {
        Test test = new Test();
        test.method();

    }
}
