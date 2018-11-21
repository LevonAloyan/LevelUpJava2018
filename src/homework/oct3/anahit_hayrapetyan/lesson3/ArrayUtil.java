package homework.oct3.anahit_hayrapetyan.lesson3;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil {


    public void sortByOddAndEven(int[] array) {

               
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " is even number.");
            } else {
                System.out.println(array[i] + " is odd number.");
            }

        }

    }

    public static int getMaximum(int[] array) {
        int[] arr = {};

        int max = arr[0];
        for (int i = 0; i > arr.length; i++) {
            if (max > arr[i]);
            max = arr[i];
        }
        return max;
    }

    public static int getMinimum(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min);
            min = arr[i];

        }
             
        return min;  
    }

   
    public static int getSum(int[] array) {
        
        int sum=0;
        for(int i=0; i<array.length; i++){
        sum = sum + array[i];
        }
        return sum;
    }

    public static int[] reverse(int[] array) {
        
        for(int i=array.length-1; i>=0; i--)
            System.out.print(array[i] );
        
    
        return null;  
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

   
    public static void print(int[] a) {
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        
    }
}
