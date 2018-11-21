package homework16.III_26.gor_gevorgyan;

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
        int[] a = null;


        // create an util by the specified  "length" parameter instead of assigning null
        //  Random generator = new Random();
        // use the following method: "nextInt(n)"   of Random class
        // initialize the util (a) using for loop and above mentioned method
        return a;
    }

    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven(int[] array) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even = array[i];
            } else {
                odd = array[i];
            }
        }
        swap(array, even, odd);

    }

    public static int getMaximum(int[] array) {
        int maxIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxIndex < array[i]) {
                maxIndex = array[i];
            }
        }
        return maxIndex;
    }


    public static int getMinimum(int[] array) {
        int minIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minIndex > array[i]) {
                minIndex = array[i];
            }
        }
        return minIndex;
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int sumIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            sumIndex += array[i];
        }
        return sumIndex;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponting to wich must be created reversed array
     * @return new created reversed array to the specified paramter "array"
     */
    public static int[] reverse(int[] array) {
        int arrayIndex = array.length - 1;
        int indexArray = array.length / 2;

        for (int i = 0; i <= indexArray; i++){
            swap(array,i,arrayIndex - i);
        }
        return array;
    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
        int arrayInSame = array.length;
        for (int i = array.length - 1; i > 0; i--){
            swap(array, i,arrayInSame - 1);
        }
        System.out.println(array);
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
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     */
    public static void print(int[] a, String delimiter) {

    }
}
      
