package homework.oct24.gor_gevorgyan.arrays;

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
             //TODO: do this   if (j > i + 1)
            swap(array, i + 1, j);
        }
    }

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
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

        return min;
    }

    public static int getSum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int[] reverse(int[] array) {
        int b = array.length - 1;
        int c;
        // TODO: use variables intuitively clear by meaning
        for (int i = 0; i < array.length / 2; i++) {
        // TODO: use the swap method
            c = array[i];
            array[i] = array[b];
            array[b] = c;
            b--;  // TODO: see the code of auditorium.array.ArrayUtil class
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
            System.out.println(a[i]);
        }
    }

}
