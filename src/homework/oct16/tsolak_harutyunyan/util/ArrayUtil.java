package homework.oct16.tsolak_harutyunyan.util;

public class ArrayUtil {

//    private static void swap(int[] array, int i, int length) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public static void sortByOddAndEven(int[] array) {
        for (int i =0; i < array.length -2; i++ ){
            int j = i + 1;
            while((array[i] + array[j])%2 == 0){
                j++;
                if(j >=array.length){
                    return;
                }
            }
            swap(array,i+1,j);
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
        int length = array.length;
        int count = array.length / 2;
        for (int i = 0; i < count; i++) {
            swap(array, i, length);
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
