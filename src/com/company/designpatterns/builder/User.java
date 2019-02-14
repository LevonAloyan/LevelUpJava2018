package com.company.designpatterns.builder;

public class User {

  private String name;

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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public String getPet() {
    return pet;
  }

  public void setPet(String pet) {
    this.pet = pet;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public boolean isHasCar() {
    return hasCar;
  }

  public void setHasCar(boolean hasCar) {
    this.hasCar = hasCar;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  private String surname;
  private int age;
  private int id;
  private String race;
  private String pet;
  private Gender gender;
  private boolean hasCar;
  private String address;
  private String email;
  private String password;
  private String phone;

  public User(String name, String surname, int age, int id, String race, String pet,
      Gender gender, boolean hasCar, String address, String email, String password, String phone) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.id = id;
    this.race = race;
    this.pet = pet;
    this.gender = gender;
    this.hasCar = hasCar;
    this.address = address;
    this.email = email;
    this.password = password;
    this.phone = phone;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  enum Gender{
    MALE,FEMALE;
  }
}
