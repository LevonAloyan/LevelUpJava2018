package com.company.interfaceDemo.defaultmethods;

public interface I1 {

    boolean isValid = true;

    default void method(){
        System.out.println("I1");
    }
}
