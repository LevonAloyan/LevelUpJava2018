package com.company.designpatterns.factory;

public class JsonReader implements Reader {
    @Override
    public void read() {
        System.out.println("Json reader");
    }
}
