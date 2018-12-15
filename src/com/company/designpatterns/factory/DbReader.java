package com.company.designpatterns.factory;

public class DbReader implements Reader {
    @Override
    public void read() {
        System.out.println("Database reader");
    }
}
