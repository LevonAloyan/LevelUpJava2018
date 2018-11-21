package armen.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

  public static void main(String[] args) throws FileNotFoundException {
    int f = f();
    System.out.println(f);
  }

  public static int f() {
    byte [] arr= {1,2,3,4};
  String s = new String(arr,2,4);
    return 0;
  }
}
