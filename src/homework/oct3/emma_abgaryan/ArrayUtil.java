package homework.oct3.emma_abgaryan;


/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {
  

    /**
     * Sorts the array elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element 
     * if the second element is odd. And so on for the next elements of the array
     */
    public void sortByOddAndEven(int[] array) {

    }

    public static int getMaximum(int[] array) {
        int maxElement = array [0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }

        }
        return maxElement;
    }


    public static int getMinimum(int[] array) {
       int minElement = array [0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array [i];
        }
        return sum;
    }

    public static int[] reverse(int[] array) {
        int [] result = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            result [i] = array [array.length - i - 1];
        }
        return result;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * Prints all elements in an array.
     *
     * @param a the array to print
     */
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("array[" + i + "] = " + a[i]);
        }
    }
}
      
