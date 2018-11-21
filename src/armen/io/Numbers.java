package armen.io;

import java.io.*;

/**
 * Created by Amalia on 16.11.2018.
 */
public class Numbers{

    public static void main(String[] args) throws IOException{

//      create a new test.txt file and generate the numbers
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("/home/levon/test.txt"));

        for(int i = 93000000; i < 93999999; i++){
            writer1.write("0" + i+ '\n');
        }
        writer1.close();

//        read form test.txt file and write to test1.txt file
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/levon/test.txt"));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("/home/levon/test1.txt"));
        int c;
        while ((c= bufferedReader.read() )!= -1){
            writer2.write(c);
        }
        bufferedReader.close();
        writer2.close();
    }
}