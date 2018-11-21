
package homework.oct3.rimakhrkhryan.lesson2.lesson2;

public class ArrayUtil {

    public static void sortByOddAndEven(int[] array) {
        int t;
        int i = 5;
        int j = 9;
        t = array[i];
        array[i] = array[j];
        array[j] = t;
        for (i = 0; i < 10; i++)
            System.out.print(array[i]);
        // use the swap method to swap  two elements with i and j indexes  of the specified  Array. 
    }

    public static int getMaximum(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        System.out.print(max);
        System.out.println();
        return 0;
    }


    public static int getMinimum(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        System.out.print(min);
        System.out.println();
        return 0;
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
            sum = sum + array[i];
        }
        System.out.print(sum);
        System.out.println();
        return 0;
    }

    public static int[] reverse(int[] array) {

        int[] arr2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr2[i] = array[array.length - i - 1];
        }
        return arr2;

    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /*
     * Prints all elements in an array.
     *
     * @param a the array to print
    
     */
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);

    }

} 