package homework.autumn.II.oct16.zaven_chilingaryan.array;


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

    public static int getMaximum(int[] q) {
        int max = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] > max) {
                max = q[i];
            }
        }
        return max;
    }

    public static int getMinimum(int[] q) {
        int min = q.length;
        for (int i = 0; i < q.length; i++) {
            if (q[i] < min) {
                min = q[i];
            }
        }
        return min;
    }

    public static int getSum(int[] q) {
        int sum = 0;
        for (int i = 0; i < q.length; i++) {
            sum += q[i];
        }
        return sum;
    }

    public static int[] reverse(int[] array) {

        int lastIndex = array.length - 1;
        int count = array.length / 2;
        for (int i = 0; i < count; i++) {
            swap(array, i, lastIndex - i);
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
      
