package homework.oct3.roman_petrosyan.arrays;

public class ArrayUtil {

    public static void sortByOddAndEven(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int even = array[i];
                System.out.print(even + " even:");
            }

            if (array[i] % 2 != 0) {
                int odd = array[i];
                System.out.print(odd + " odd:");
            }
        }
        System.out.println();
    }

    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }

        }
        System.out.println("max:" + max);

        return 0;
    }

    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }

        }
        System.out.println("min:" + min);

        return 0;
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum:" + sum);
        return 0;

    }

    public static int[] reverse(int[] array) {
        int[] a = new int[array.length];
        System.out.print("revers:");
        for (int i = 0; i < array.length; i++) {
            a[i] = array[array.length - 1 - i];

            System.out.print(" " + a[i] + ";");
        }
        return a;
    }

    static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void print(int[] array) {
        System.out.print("print array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";");
        }

    }
}
