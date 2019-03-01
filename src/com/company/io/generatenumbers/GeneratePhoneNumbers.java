package com.company.io.generatenumbers;

import java.io.*;

public class GeneratePhoneNumbers {

    public static void generate(long startNumber)  {

        try {
            Writer writer = new BufferedWriter(new FileWriter("/home/levon/Desktop/generatedNumber.txt"));
            for (int i = 0; i < 100; i++) {
                writer.write("hello");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args)  {
        generate(93000000);
    }


}
