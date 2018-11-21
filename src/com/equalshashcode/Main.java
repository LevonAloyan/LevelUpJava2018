package com.equalshashcode;

public class Main {

  public static void main(String[] args) {
    Employee employee1 = new Employee(1,"bxdo",50000);
    Employee employee2 = new Employee(1,"hamest",0);

    int i = employee1.hashCode();
    System.out.println(i);
    int i1 = employee2.hashCode();
    System.out.println(i1);
    System.out.println(employee1.equals(employee2));
  }
}
