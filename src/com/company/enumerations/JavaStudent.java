package com.company.enumerations;

import java.lang.reflect.Constructor;

public class JavaStudent {

  private String name;
  private String lastName;
  private int age;
  private Level level;
  private Gender gender;

  public JavaStudent() {
  }

  public JavaStudent(String name, String lastName, int age, Level level, Gender gender) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.level = level;
    this.gender = gender;
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

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public static void main(String[] args) {
    Constructor<?>[] constructors =
        JavaStudent.class.getConstructors();

  }
}
