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

        public class Builder {

            public Builder() {
            }

            public Builder addFirstName(String firstName) {
                Person.this.firstName = firstName;
                return this;
            }

            public Builder addMiddleName(String middleName) {
                Person.this.middleName = middleName;
                return this;
            }

            public Builder addLastName(String lastName) {
                Person.this.lastName = lastName;
                return this;
            }

            public Builder addAge(int age) {
                Person.this.age = age;
                return this;
            }

            public Builder addFathersName(String fathersName) {
                Person.this.fathersName = fathersName;
                return this;
            }

            public Builder addMothersName(String mothersName) {
                Person.this.mothersName = mothersName;
                return this;
            }

            public Builder addHeight(int height) {
                Person.this.height = height;
                return this;
            }

            public Builder addWeight(int weight) {
                Person.this.weight = weight;
                return this;
            }

            public Person build() {
                return Person.this;
            }
        }

    private Person (){}

    public static Builder personBuilder(){
        return new Person().new Builder();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
        public String toString () {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", fathersName='" + fathersName + '\'' +
                    ", mothersName='" + mothersName + '\'' +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }

