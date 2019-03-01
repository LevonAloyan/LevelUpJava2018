package com.company.io;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

  private transient String name;
  private String lastName;
  private int age;
  private String university;
  private Gender gender;

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", university='" + university + '\'' +
            ", gender=" + gender +
            '}';
  }

  @Override
  public boolean equals(Object o) {

    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return age == student.age &&
        Objects.equals(name, student.name) &&
        Objects.equals(lastName, student.lastName) &&
        Objects.equals(university, student.university) &&
        gender == student.gender;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName, age, university, gender);
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  enum Gender {
    MALE,FEMALE
  }
}
