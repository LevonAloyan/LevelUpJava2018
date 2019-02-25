package com.company.quizfull;

public class Test {

  public static void main(String[] args) {
    new Test().work();
  }

  private void work() {
    try {
      work();
    } finally {
      work();
    }
  }

}
