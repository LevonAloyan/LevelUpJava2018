package homework.oct3.zaven_chilingaryan.array;


/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {
  

    /**
     * Sorts the array elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element 
     * if the second element is odd. And so on for the next elements of the array
     */
    public void sortByOddAndEven(int[] q) {
//        if( )

    }

    public static int getMaximum(int[] q) {
        int max = 0;
        for(int i = 0; i < q.length;i++ ) {
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
        for(int i = 0; i < q.length; i++ ){
            sum += q[i];
        }
        return sum;
    }

    public static int[] reverse(int[] q) {
        int a = q.length - 1;
        int b;
        for(int i= 0; i < q.length/2; i++){
            b = q[i];
            q[i] = q[a];
            q[a] = b;
            a--;
        }
        return q;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    public static void print(int[] q) {
        for(int i = 0; i < q.length; i++){
            System.out.println(q[i]);
        }
    }
}
      
