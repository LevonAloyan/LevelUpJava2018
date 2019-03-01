package com.company.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadAndWriteFilesWithBuffers {



  public static void main(String[] args) {
    InputStream inputStream = null;
    OutputStream outputStream = null;
    try {

      inputStream =new BufferedInputStream(new FileInputStream("/home/levon/Downloads/HeadFirstJava2ndEdition.pdf"));
      outputStream =new BufferedOutputStream(new FileOutputStream("/home/levon/Desktop/book.pdf"));
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
