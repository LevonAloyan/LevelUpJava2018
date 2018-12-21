package com.company.designpatterns.builder;

public class PersonTest {
    public static void main(String[] args) {
        Person person = Person.personBuilder().addLastName("Mikayelyan").build();

        System.out.println(person);
        System.out.println(person.getLastName());

    }
}
