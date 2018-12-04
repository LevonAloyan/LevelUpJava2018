package com.company.interfaceDemo;

public class Child extends Parent {



    public static void main(String[] args) {
        Parent parent = new Child();
        parent.work();
        parent.drive();
    }

    @Override
    public void drive() {

    }

    @Override
    public void work() {

    }
}
