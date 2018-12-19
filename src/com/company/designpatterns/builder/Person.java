package com.company.designpatterns.builder;

import java.sql.BatchUpdateException;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String fathersName;
    private String mothersName;
    private int height;
    private int weight;

    public static class Builder {

        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String fathersName;
        private String mothersName;
        private int height;
        private int weight;

        public Builder() {}

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFathersName(String fathersName) {
            this.fathersName = fathersName;
            return this;
        }

        public Builder setMothersName(String mothersName) {
            this.mothersName = mothersName;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person();
        }

    }
}
