package com.company.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println(read());
    }

    public static int read() {
        try {
            System.out.println("try");
            throw new Exception();
        }catch (Exception e){
            System.out.println("catch");
            System.out.println("catch");
            System.out.println("catch");
            System.exit(0);
            return 20;
        }finally {
            System.out.println("finally");
        }
    }
}
