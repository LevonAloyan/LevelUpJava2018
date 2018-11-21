package homework.oct16.grigor_abroyan;

public class ArrayUtil {

    public void sortByOddAndEven(int[] array) {
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

    public static int[] reverse(int[] array) {
        int b = array.length - 1;
        int c;
        for (int i = 0; i < array.length / 2; i++) {
            c = array[i];
            array[i] = array[b];
            array[b] = c;
            b--;
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

   
    public static void print(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
      
