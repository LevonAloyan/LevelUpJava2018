package armen.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class IoDemo {

  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( ));

    Writer writer = new FileWriter("/home/levon/number1.txt");


    for (int i = 93000000; i <= 93999999; i++) {
        writer.write("0"+i+'\n');
    }
    writer.close();

    FileReader fileReader =new FileReader("/home/levon/number1.txt");
    BufferedReader reader = new BufferedReader(fileReader);

    String s = reader.readLine();
    Writer writer1 = new BufferedWriter(new FileWriter("/home/levon/number2.txt"));
    while (true)
    writer1.write(s + String.format("Hello %h", "Levon"));
  }

}
