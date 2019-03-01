package com.company.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadImage {

  private static final String IMAGE_PATH = "/home/levon/Downloads/gagik_movsesyan.jpg";
  private static final String DEST_IMAGE_PATH = "/home/levon/Desktop/gago.JPG";

  public static void main(String[] args) {
    try (InputStream inputStream =new BufferedInputStream(new FileInputStream(IMAGE_PATH));
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(DEST_IMAGE_PATH));
    ){
      int data;
      long start = System.currentTimeMillis();
      while ((data= inputStream.read()) != -1){
        outputStream.write(data);
      }
      long end = System.currentTimeMillis();
      System.out.println(end -start);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
