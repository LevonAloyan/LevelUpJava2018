package com.company.objectmethods;

import java.util.Date;

public class User implements Cloneable {

  private String name;
  private int age;
  private Date bday;


  @Override
  public Object clone() throws CloneNotSupportedException {
    bday.clone();
    return super.clone();
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Date getBday() {
    return bday;
  }

  public void setBday(Date bday) {
    this.bday = bday;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", bday=" + bday +
        '}';
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    User user = new User();
    user.setAge(5);
    user.setName("Vzgo");
    user.setBday(new Date(222222222));

    System.out.println("user: "+user.getAge());
    System.out.println("user: "+user.getBday());
    System.out.println("user: "+user.getName());

    System.out.println();

    User user1 =(User) user.clone();

    System.out.println("user 1: "+user1.getAge());
    System.out.println("user 1: "+user1.getBday());
    System.out.println("user 1: "+user1.getName());

    System.out.println();
    System.out.println("after changes");
    System.out.println();

    user.setAge(6);
    user.setName("Grno");
    user.setBday(new Date(333333333));

    System.out.println("user: "+user.getAge());
    System.out.println("user: "+user.getBday());
    System.out.println("user: "+user.getName());
    System.out.println();
boolean b = true;
    if (b =false){
      System.out.println(b);
    }
    System.out.println("user 1: "+user1.getAge());
    System.out.println("user 1: "+user1.getBday());
    System.out.println("user 1: "+user1.getName());

    System.out.println(user);


  }
}
