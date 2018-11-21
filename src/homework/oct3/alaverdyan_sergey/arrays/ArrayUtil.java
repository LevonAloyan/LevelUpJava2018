package homework.oct3.alaverdyan_sergey.arrays;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil {

    /**
     * Sorts the array elements by odd and even number such that if first number
     * is odd then second must be even number this means that it will be found
     * the next even number and swap with the second element if the second
     * element is odd. And so on for the next elements of the array
     */
    public void sortByOddAndEven(int[] array) {
        // use the swap method to swap  two elements with i and j indexes  of the specified  Array. 
    }

    public static int getMaximum(int[] array) {
        int j = array[0];

        for (int i = 0; i < array.length; i++) {
            if (j < array[i]) {
                j = array[i];
            }

        }
        return j;   // this must be replaced by correct code
    }

    public static int getMinimum(int[] array) {
//        TODO implement
        int j = array[0];

        for (int i = 0; i < array.length; i++) {
            if (j > array[i]) {
                j = array[i];
            }

        }
        return j;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code> elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            j += array[i];

        }

        return j;  // this must be replaced by correct code
    }

    public static int[] reverse(int[] array) {
        int[] j = new int[array.length];
        int h = 0;

        for (int i = array.length - 1; i > 0; i--) {
            j[h++] = array[i];
        }

        return j;    // this must be replaced by correct code
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * Prints all elements in an array.
     *
     * @param array the array to print
     */
    public static void print(int[] array) {
        // todo implement
        int j;
        for (int i = 0; i < array.length; i++) {
            j = array[i];
            System.out.print(j + "  ");
        }

    }
}
