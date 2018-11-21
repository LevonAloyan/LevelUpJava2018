package homework.autumn.II.oct3.tsolak_harutyunyan.array;

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
        int s;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                s = array[i];
                array[i]=array[j];
                s = array[j];
                System.out.print(array[j]);
                System.out.println();
            }
            
        }
        // use the swap method to swap  two elements with i and j indexes  of the specified  Array. 
    }

    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
           
        }
         System.out.print("max" + max);
            System.out.println();
        return max;   // this must be replaced by correct code
    }

    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            
        }
        System.out.print("min" + min);
            System.out.println();
        return min;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code> elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            
            sum = sum + array[i];
        }
        System.out.print("sum" + sum);
        System.out.println();
        return sum;   // this must be replaced by correct code
    }

    public static int[] reverse(int[] array) {
        int j = 0;
        int[] re =  new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            re[j] = array[i];
            j++;
        }
        return re;   // this must be replaced by correct code
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        System.out.print(tmp);
        System.out.println();
    }

    /**
     * Prints all elements in an array.
     *
     * @param a the array to print
     */
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}

