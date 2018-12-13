package com.company.overridedemo;

public class Cat extends Animal {

    public Dog move() {
        System.out.println("Animals can move");
        return new Dog();
    }

    @Override
    public void makeVoice() {
        System.out.println("Meow");
    }
}
