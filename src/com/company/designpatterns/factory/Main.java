package com.company.designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        Reader reader = ReaderFactory.getReader("db");
        reader.read();

    }
}
