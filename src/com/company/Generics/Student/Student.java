package com.company.Generics.Student;

import java.util.Comparator;

public class Student  {

    private int id;
    private String name;
    private String lastName;
    private int grade;

    public Student (){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int compare(Student o1) {
        int result;
        if ((result = this.id - o1.id) > 0){
            return result;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
