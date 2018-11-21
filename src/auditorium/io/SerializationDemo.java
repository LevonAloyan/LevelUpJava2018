package auditorium.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializationDemo {


    public static void main(String args[]) throws IOException, ClassNotFoundException {

        MyClass serialized = new MyClass(123.331, 10000000, "Some Test") ;
// Object serialization
        OutputStream os = new FileOutputStream(new File("serial"));
        ObjectOutputStream objOs = new ObjectOutputStream(os);

        objOs.writeObject(serialized);

        os.close();
// Object deserialization
        InputStream is = new FileInputStream("serial");

        ObjectInputStream objIs = new ObjectInputStream(is);

        MyClass deserializedObj = (MyClass) objIs.readObject();

        objIs.close();

        System.out.printf("-- " + deserializedObj + " --");

    }
}

class MyClass implements Serializable {
    private static final long serialVersionUID = 4438359708920307157L;
     double d ;
    int a ;
    String str;

    public MyClass(double d, int a, String str) {
        this.d = d;
        this.a = a;
        this.str = str;
    }

    @Override
    public String toString() {
        return "MyClass {" +
                "d=" + d +
                ", a=" + a +
                ", str='" + str + '\'' +
                '}';
    }
}
