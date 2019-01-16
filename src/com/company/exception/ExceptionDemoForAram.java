package com.company.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemoForAram {

    public static void main(String[] args) {
        method();

    }

    public static void method() {
        if(1<30){
            throw new RuntimeException();
        }
        method0();
    }

    public static void method1() throws FileNotFoundException {
        method0();
    }

    public static void method0() {

        try (FileInputStream fileInputStream = new FileInputStream("/home/levon/newTesxt.txt")) {
            fileInputStream.read();
        } catch (FileNotFoundException e) {
            System.out.println("catch");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
