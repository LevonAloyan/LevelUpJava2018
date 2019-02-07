package com.company.reflection;

import java.util.Calendar;

public class Student {

  private String name;
  private int bDayYear = 1994;


  private int calculate() {
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    return currentYear - getbDayYear();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public  int getbDayYear() {
    return bDayYear;
  }
}
