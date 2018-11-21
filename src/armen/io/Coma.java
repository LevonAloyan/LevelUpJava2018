package armen.io;
import java.io.*;
import java.util.TreeSet;
/**
 * Created by Amalia on 15.11.2018.
 */
public class Coma {

        public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(new File(reader.readLine()));


            int count = 0;
            while(input.available() > 0){
                if(input.read() == 44){
                    count ++;
                }
            }
            System.out.println(count);
            reader.close();
            input.close();
    }
}