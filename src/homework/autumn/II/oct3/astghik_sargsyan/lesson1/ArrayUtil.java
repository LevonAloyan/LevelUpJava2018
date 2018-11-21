package homework.autumn.II.oct3.astghik_sargsyan.lesson1;

public class ArrayUtil {

    public void sortByOddAndEven(int[] array) {
        int i, j, temp;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                for (j = i; j < array.length; j++) {
                    if (array[j] % 2 == 1) {
                        int[] y = null; //TODO  clarify why this is not correct

                        temp = y[i];
                        y[i] = y[j];
                        y[j] = temp;
                    }
                }
            }
            System.out.println(array[i]);
        }

    }

    public static int getMaximum(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
            System.out.println(maximum);
        }
        return maximum;
    }

    public static int getMinimum(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int getSum(int[] array) {

        int summa = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
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

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("I_12[i]");
        }
    }

}
