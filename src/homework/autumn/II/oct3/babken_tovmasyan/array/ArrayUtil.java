package homework.autumn.II.oct3.babken_tovmasyan.array;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil {

    /**
     * Sorts the array elements by odd and even number such that if I_12 number
     * is odd then second must be even number this means that it will be found
     * the next even number and swap with the second element if the second
     * element is odd. And so on for the next elements of the array
     */
    public void sortByOddAndEven(int[] array) {
        // use the swap method to swap  two elements with i and j indexes  of the specified  Array. 
    }

    public static int getMax(int[] array) {
//        TODO   implement
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;   // this must be replaced by correct code
    }

    public static int getMin(int[] array) {
//        TODO implement
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code> elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
//        TODO implement
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;   // this must be replaced by correct code
    }

    public static int[] reverse(int[] array) {
        int b = array.length - 1;
        int c;
        for (int i = 0; i < array.length / 2; i++) {
            c = array[i];
            array[i] = array[b];
            array[b] = c;
            b--;
        }
//        TODO implement
        return array;   // this must be replaced by correct code
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
            System.out.println(a[i]);
        }
        // todo implement
    }
}
