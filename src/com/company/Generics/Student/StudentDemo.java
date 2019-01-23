package com.company.Generics.Student;

import java.util.Set;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        student.setId(1);
        student1.setId(3);
        student2.setId(5);
        student.setName("Vahe");
        student1.setName("Miko");
        student2.setName("Levon");
        student.setLastName("Mikayelyan");
        student.setLastName("Adamyan");
        student.setLastName("Hakobyan");
        student.setGrade(30);
        student1.setGrade(40);
        student2.setGrade(50);


        Set<Student> t = new TreeSet<>();
        t.add(student);
        t.add(student1);
        t.add(student2);

        for (Student s: t) {
            System.out.println(s);
        }
    }
}
