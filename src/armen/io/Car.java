package armen.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

class Car implements Serializable {

  private String name;
  private transient String number;

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Car)) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(name, car.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}

class ReadWriteObject {

  public static void main(String args[]) throws Exception {

    try (
//        write from object.data file
        FileOutputStream out = new FileOutputStream("object.data");
        ObjectOutputStream oos = new ObjectOutputStream(out);
//        read from object.data file
        FileInputStream in = new FileInputStream("object.data");
        ObjectInputStream ois = new ObjectInputStream(in);

    ) {
      Car c = new Car();
      c.setName("BMW");

      oos.writeObject(c);
      oos.flush();
      c.setName("mersedes");

      Car c2 = (Car) ois.readObject();
      System.out.println(c2.getName());
      System.out.println(c.equals(c2));
      System.out.println(c == c2);

    }

  }
}