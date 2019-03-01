package com.company.io;

import java.io.*;

public class PreventSerializationOnChildClass {

    private static final String DEST_PATH = "/home/levon/Desktop/myChild1Object.txt";

    public static void main(String[] args) {

        A a = new A();
        a.setaAge(11);
        a.setaLastName("LastName");
        a.setaName("Name");

        writeChildObject(a);

        a.setaName("levon");

        A a1 = readChildObject();
        System.out.println(a1);


    }

    private static A readChildObject() {
        A a1 = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DEST_PATH))){
             a1 = (A)objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return a1;
    }

    private static void writeChildObject(A a) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DEST_PATH))){
            outputStream.writeObject(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
