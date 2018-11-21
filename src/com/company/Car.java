package com.company;

import java.util.Objects;

public class Car {

  private  String color;
  private String model;
    {
    color = "White";
  }

  public Car (String color){
    color = color;
  }
  public Car (){

  }
  public void move() {

  }

  public String getColor() {
    return color;
  }

  public void setColor(String color, String b, String ... a) {
    System.out.println("First method");;
  }

  public String setColor( String a) {
    System.out.println("second method");
    return "";
  }

  public String setColor( Integer f) {
    System.out.println("third method");
    return "Parent";
  }

  @Override
  public String toString() {
    return "Color="+this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Car)) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(color, car.color) &&
        Objects.equals(model, car.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, model);
  }

  protected String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
