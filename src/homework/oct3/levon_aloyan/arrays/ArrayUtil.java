package homework.oct3.levon_aloyan.arrays;

import java.util.Arrays;

public class ArrayUtil {

    public static void sortByOddAndEven(int[] array) {
        System.out.print("even/odd:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int even = array[i];
                System.out.print(even + ";");
            }
            if (array[i] % 2 != 0) {
                int odd = array[i];
                int s[] = {odd};
                System.out.print(Arrays.toString(s) + ";");
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

        return null;
    }

    static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        System.out.println();
        System.out.print("swap:");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + ";");
        }

    }

    public static void print(int[] array) {
        System.out.print("print array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";");
        }
        System.out.println();
    }
}
