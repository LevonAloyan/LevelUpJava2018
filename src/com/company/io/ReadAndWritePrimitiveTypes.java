package com.company.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadAndWritePrimitiveTypes {

  private static final String SOURCE_PATH = "/home/levon/Desktop/404.txt";
  private static final String DEST_PATH = "/home/levon/Desktop/new404.txt";

  public static void main(String[] args) {
    try (InputStream inputStream = new BufferedInputStream
        (new DataInputStream
            (new FileInputStream(SOURCE_PATH)));
        OutputStream outputStream = new BufferedOutputStream(
            new DataOutputStream(
                new FileOutputStream(DEST_PATH)))
    ) {

      int data;
      long start = System.currentTimeMillis();

      while ((data = inputStream.read()) != -1) {
        outputStream.write(data);
      }
      long end = System.currentTimeMillis();

      System.out.println(end - start);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
