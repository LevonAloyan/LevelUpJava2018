package homework16.III_26.gasparyan_meruzhan.task_II.util;

import java.util.Random;

/**
 * This class contains utility methods for util
 * manipulation.
 */
public class ArrayUtil {
    /**
     * Creates an util filled with random values.
     *
     * @param length the length of the util
     * @param n      the number of possible random values
     * @return an util filled with length numbers between
     * 0 and n-1
     */
    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];
        Random generator = new Random();
        for (int i = 0; i < length; i++) {
            a[i] = generator.nextInt(n);
        }
        return a;
    }

    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven(int[] array) {
        int length = array.length - 2;
        for (int i = 0; i < length; i++) {
            int j = i + 1;
            while ((array[i] + array[j]) % 2 == 0) {
                j++;
                if (j >= array.length) return;
            }
            if (j > i + 1) swap(array, i + 1, j);
        }
    }

    public static int getMaximum(int[] array) {
        int max = array[0];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int getMinimum(int[] array) {
        int min = array[0];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int sum = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        return sum;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponting to wich must be created reversed array
     * @return new created reversed array to the specified paramter "array"
     */
    public static int[] reverse(int[] array) {
        int length = array.length / 2;
        int lastindex = array.length - 1;
        for (int i = 0; i < length; i++) {
            swap(array, i, lastindex - i);
        }
        return array;
    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
        reverse(array);
    }

    /**
     * Swaps the elements at the specified positions in the specified array.
     * (If the specified positions are equal, invoking this method leaves
     * the array unchanged.)
     *
     * @param array The array in which to swap elements.
     * @param i     the index of one element to be swapped.
     * @param j     the index of the other element to be swapped.
     * @throws IndexOutOfBoundsException if either i or j
     *                                   is out of range (i < 0 || i >= array.length
     *                                   || j < 0 || j >= array.length).
     */
    private static void swap(int[] array, int i, int j) {
        if(i >= array.length || i < 0 || j>=array.length || j <0 ) {
            throw new IndexOutOfBoundsException();
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

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
        int length = a.length;
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + delimiter);
        }
    }


}
      
