package homework.oct10.gasparyan_meruzhan.arrays;


public class ArrayUtil {


    public static void sortByOddAndEven(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            int j = i + 1;
            while ((array[i] + array[j]) % 2 == 0) {
                j++;
                if (j >= array.length) {
                    return;
                }
            }

            swap(array, i + 1, j);
        }
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }

        return min;   // this must be replaced by correct code
    }


    public static int getSum(int[] array) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];

        }
        return s;
    }

    public static void reverse(int[] array) {
        int lastIndex = array.length - 1;
        int count = array.length / 2;

        for (int i = 0; i < count; i++) {
            swap(array, i, lastIndex - i);
        }
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
        System.out.println();

    }


}

