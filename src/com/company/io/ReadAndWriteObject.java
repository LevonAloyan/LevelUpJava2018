package com.company.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.company.io.Student.Gender;

public class ReadAndWriteObject {

  private static final String DEST_PATH = "/home/levon/Desktop/myObject.txt";

  public static void main(String[] args) {
    Student student = new Student();
    student.setAge(24);
    student.setName("Levon");
    student.setLastName("Aloyan");
    student.setUniversity("SEUA");
    student.setGender(Gender.MALE);

    writeToFile(student);

    student.setAge(25);
    student.setName("Levon1");
    System.out.println("Current STUDENT: " + student);

    Student newStudent = readFromFile();
    System.out.println("STUDENT from file: " + newStudent);

  }

  private static Student readFromFile() {
    Student newStudent = null;
    try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DEST_PATH))) {
      newStudent = (Student) objectInputStream.readObject();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return newStudent;
  }

  private static void writeToFile(Student student) {
    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DEST_PATH))) {
      outputStream.writeObject(student);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
