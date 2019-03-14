package com.company.IOGeneratedNUmbers;

import java.io.FileNotFoundException;

public class GenerateNumbers {
    private int vivaCellNumbers;

    public static void main(String[] args) throws FileNotFoundException {
        generateNumbers(0);
    }

    public static void generateNumbers (int vivaCellNumbers) throws FileNotFoundException {
        int numbers = 94000000;
        int generatedNumbers = 999999;
        for (int i = 1; i <= generatedNumbers; i++) {
            System.out.println("0" + numbers++);
//            FileOutputStream fileOutputStream = new FileOutputStream("vivacellnumbers.txt");
//
//            fileOutputStream.write();
        }

    }
}