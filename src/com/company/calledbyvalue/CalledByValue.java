package com.company.calledbyvalue;

public class CalledByValue {

    private static int a = 5;
    private static Student student;

    public void method(int a) {
        a = a + 1;
        System.out.println(a);
    }

    public void method(Student a) {
        int age = a.getAge();
        a.setAge(age + 1);
    }

    public static void main(String[] args) {
        CalledByValue calledByValue = new CalledByValue();
        calledByValue.method(a);
        System.out.println(a);

        student = new Student();
        student.setAge(20);
        student.setName("Anna");
        calledByValue.method(student);

        System.out.println(student.getAge());
    }
}
