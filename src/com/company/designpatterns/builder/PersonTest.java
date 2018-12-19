package com.company.designpatterns.builder;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person.Builder().setAge(5).setFirstName("Vahe").setLastName("Mikayelyan").build();
//        System.out.println(person);
    }
}
