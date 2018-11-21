package com.company.arrayutil;

public class ArrayTest {

  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};
    int [] array = {0,5,26,55,1,52,88,47,5};
    System.out.println(ArrayUtil.getMaximum(arr));
    ArrayUtil.reverseInSameArray(arr);
  }

}
