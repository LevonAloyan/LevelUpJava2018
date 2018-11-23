package com.company;

public class ArrayTest {
  public static void main(String[] args) {


    // testing git push
    int [] array ={4,5,7,9,6,3,2,1,45,8};
    for(int i = 0; i < array.length; i++){
      if (array[i] % 2 == 0){
        System.out.println(array[i]);
      }
    }
  }
}
