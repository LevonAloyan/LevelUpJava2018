package com.company.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadAndWriteFiles {



  public static void main(String[] args) {
    InputStream inputStream = null;
    OutputStream outputStream = null;
    try {

      inputStream = new FileInputStream("/home/levon/Downloads/HeadFirstJava2ndEdition.pdf");
      outputStream = new FileOutputStream("/home/levon/Desktop/book1.pdf");
      int data;
      long startTime = System.currentTimeMillis();
      while ((data = inputStream.read()) != -1) {
        outputStream.write(data);
      }
      long endTime = System.currentTimeMillis();

      System.out.println( endTime -startTime);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (inputStream != null) {
        try {
          inputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (outputStream != null) {
        try {
          outputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}
