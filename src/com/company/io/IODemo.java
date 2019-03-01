package com.company.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class IODemo {

  public static void main(String[] args) throws IOException {

    File file = new File("/home/levon/Desktop/levelup/java/");

    System.out.println("File name is: "+ file.getName());
    System.out.println("isFile() "+file.isFile());
    System.out.println("isDirectory() "+file.isDirectory());
    System.out.println("getAbsolutePath() "+file.getAbsolutePath());
    System.out.println("getCanonicalPath() "+file.getCanonicalPath());
    System.out.println("length() "+ file.length() );
    System.out.println(Arrays.toString(file.list()));

  }
}
