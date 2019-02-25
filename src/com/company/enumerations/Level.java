package com.company.enumerations;

import java.lang.reflect.Constructor;

public enum Level {
  BEGINNER("you are a beginner") {
    public void method() {
      System.out.println();
    }
  },
  INTERMEDIATE("you are a intermediate") {
    public void method() {

    }
  },
  EXPERT("you are a expert") {
    public void method() {

    }
  };
  private String message;

  public abstract void method();

  Level(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public static void main(String[] args) {
    Constructor<?>[] constructors = Level.class.getConstructors();
    System.out.println(constructors.length);
  }
}
