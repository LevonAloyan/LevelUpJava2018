package com.company.interfaceDemo.preventmethodwork;

public class A implements IA {

    @Override
    public void print() {
        System.out.println("A print method");
    }

    @Override
    public void eat() {
        System.out.println("A eat method");
    }

    @Override
    public void walk() {
        System.out.println("A walk method");
    }
}
