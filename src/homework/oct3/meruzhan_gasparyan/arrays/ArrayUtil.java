package homework.oct3.meruzhan_gasparyan.arrays;


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
     *
     * @param array
     */
    public static void sortByOddAndEven(int[] array) {
        // use the swap method to swap  two elements with i and j indexes  of the specified  Array.
        int n = 1;
        if (array[0] % 2 == 1) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 1) {
                    System.out.print(array[i] + " ");
                }
                for (int j = n; j < array.length; j++) {
                    n++;
                    if (array[j] % 2 == 0) {
                        System.out.print(array[j] + " ");
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.print(array[i] + " ");
                }
                for (int j = n; j < array.length; j++) {
                    n++;
                    if (array[j] % 2 == 1) {
                        System.out.print(array[j] + " ");
                        break;
                    }
                }

            }
        }
        System.out.println();
    }

    public static int getMaximum(int[] array) {
//        TODO   implement
        int n = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[n] < array[i]) {
                n = i;
            }
        }
        return array[n];
    }

    public static int getMinimum(int[] array) {
        int n = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[n] > array[i]) {
                n = i;
            }
        }
        return array[n];
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {

            sumArray += array[i];
        }

        return sumArray;
    }

    public static int[] reverse(int[] array) {
        int n = array.length - 1;
        int s;
        int a = array.length / 2;
        for (int i = 0; i <= a; i++) {
            s = array[n];
            array[n] = array[i];
            array[i] = s;
            n--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return null;
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
            System.out.print(a[i] + " ");
        }
    }
}
      
