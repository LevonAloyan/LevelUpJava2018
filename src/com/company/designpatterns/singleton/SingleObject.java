package com.company.designpatterns.singleton;

public class SingleObject {

    private static SingleObject instance;

    private SingleObject(){}

    public static SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void print(){
        System.out.println("hello world");
    }


}
