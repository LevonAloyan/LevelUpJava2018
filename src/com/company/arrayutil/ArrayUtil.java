package com.company.arrayutil;

/**
 * This class contains utility methods for util manipulation.
 */
public class ArrayUtil {

  /**
   * Creates an util filled with random values.
   *
   * @param length the length of the util
   * @param n the number of possible random values
   * @return an util filled with length numbers between 0 and n-1
   */

  public static int[] randomIntArray(int length, int n) {
    int[] a = {}; // create an util by the specified  "length" parameter instead of assigning null
    //  Random generator = new Random();
    // use the following method: "nextInt(n)"   of Random class
    // initialize the util (a) using for loop and above mentioned method
    return a;
  }

  /**
   * Sorts the util elements by odd and even number such that if first number is odd then second must be even number
   * this means that it will be found the next even number and swap with the second element if the second element is
   * odd. And so on for the next elements of the util
   */
  public static void sortByOddAndEven(int[] array) {
//        TODO   implement
    for (int i = 0; i <= array.length - 1; i++) {
      if (array[i] % 2 == 0) {
        System.out.println("Zuyg tver" + array[i]);
      } else {
        System.out.println("Kent tver" + array[i]);
      }
    }
  }

  public static int getMaximum(int[] array) {
//      TODO   implement
    int max = array[0];
    for (int j = 1; j < array.length; j++) {

      if (max < array[j]) {
        max = array[j];
        //System.out.println(max);
      }
    }
    return max;   // this must be replaced by correct code

  }

  public static int getMinimum(int[] array) {
//        TODO implement
    int min = array[0];
    for (int j = 1; j < array.length; j++) {

      if (array[j] < min) {
        min = array[j];
        System.out.println(min);
      }
    }
    return min;   // this must be replaced by correct code
  }

  /**
   * Calculates the sum of specified <code>util</code>  elements
   *
   * @param array specified int util
   * @return the sum of the specified util elements
   */
  public static int getSum(int[] array) {
//        TODO implement

    int sum = 0;
    for (int a = 0; a < array.length; a++) {

      sum += array[a];
      //System.out.println(a);

    }
    return sum;   // this must be replaced by correct code
  }

  /**
   * Creates the reversed to specified array new array and returns it.
   *
   * @param array an array corresponting to wich must be created reversed array
   * @return new created reversed array to the specified paramter "array"
   */
  public static int[] reverse(int[] array) {
//      TODO implement

    int[] reversedArray = new int[array.length];
    for (int j = array.length-1 ; j >= 0; j--) {
      reversedArray[array.length - 1 - j] = array[j];
      // System.out.println(array[j]);
    }
    return reversedArray;   // this must be replaced by correct code
  }

  /**
   * Reverses the elements order of the specified array
   *
   * @param array an array: Elements order of wich must be reversed
   */
  public static void reverseInSameArray(int[] array) {
//        TODO implement
    int i = 0;
    int j = array.length - 1;
    while (i < j) {
      swap(array, i, j);
      i++;
      j--;
    }
    for (int anArray : array) {
      System.out.print(anArray + " ");
    }

  }

  /**
   * Swaps the elements at the specified positions in the specified array. (If the specified positions are equal,
   * invoking this method leaves the array unchanged.)
   *
   * @param array The array in which to swap elements.
   * @param i the index of one element to be swapped.
   * @param j the index of the other element to be swapped.
   * @throws IndexOutOfBoundsException if either i or j is out of range (i < 0 || i >= array.length || j < 0 || j >=
   * array.length).
   */
  private static void swap(int[] array, int i, int j) {
    //todo: implement
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void print(int[] a) {
    print(a, " ");
  }

  /**
   * Prints all elements in an array by using specified delimiter between elements.
   *
   * @param a the util to print
   */
  public static void print(int[] a, String delimiter) {
    for (int i = 0; i < a.length ; i++) {
      System.out.print(a[i] + delimiter);
    }
  }

}
      
