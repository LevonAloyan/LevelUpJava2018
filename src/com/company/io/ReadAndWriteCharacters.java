package com.company.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadAndWriteCharacters {

  private static final String FILE_PATH = "/home/levon/Documents/404Error.txt";
  private static final String DEST_FILE_PATH = "/home/levon/Desktop/404.txt";

  public static void main(String[] args) {
    try (Reader reader = new BufferedReader(new FileReader(FILE_PATH));
        Writer writer = new BufferedWriter(new FileWriter(DEST_FILE_PATH))
    ) {
      int data ;
      long start = System.currentTimeMillis();
      while ((data = reader.read()) != -1){
        writer.write(data);
      }
      long end = System.currentTimeMillis();
      System.out.println(end -start);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
