package armen.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;

class ReadPrimAndObjects {

  public static void main(String args[]) throws IOException,
      ClassNotFoundException {
    try (
        FileInputStream in = new FileInputStream("object.data");
        ObjectInputStream ois = new ObjectInputStream(in);
    ) {
      System.out.println(ois.readBoolean());
      Car c = (Car) ois.readObject();
      System.out.println(c.name);

    }
  }

  public static void method(Comparable comparable){

  }

  class Car implements Serializable {

    String name;

    Car(String value) {
      name = value;
    }
  }

}