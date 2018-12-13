package com.company.designpatterns.factory;

public class XmlReader implements Reader {
    @Override
    public void read() {
        System.out.println("XML reader");
    }

    public void write(){

    }
}
