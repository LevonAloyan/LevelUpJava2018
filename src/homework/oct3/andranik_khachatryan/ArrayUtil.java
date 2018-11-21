package homework.oct3.andranik_khachatryan;


/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {

    public static void main(String[] args) {
        //sort by odd and even


        int[] nums = new int[]{14, 7, 9, 20, 25, 31, 67};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                System.out.println(nums[i] + " number is even.");
            else
                System.out.println(nums[i] + " number is odd.");
        }


        //get maximum numbers

        int array[] = {8, 2, 6, 7, 15, 1, 4, 9, 5, 3};

        System.out.println("Maximum number is" + getMaximum(array));
        System.out.println("Minimum number is" + getMinimum(array));

        //get sum

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : numbers) {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }













  

    /**
     * Sorts the array elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element 
     * if the second element is odd. And so on for the next elements of the array
     */
    public void sortByOddAndEven(int[] array) {


    }

    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

        }

return max;
    }





    public static int getMinimum(int[] array) {
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }


    return min;

}

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {

//        TODO implement
        return 0;   // this must be replaced by correct code
    }

    public static int[] reverse(int[] array) {
//        TODO implement
        return null;   // this must be replaced by correct code
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        System.out.println(tmp);
    }

    /**
     * Prints all elements in an array.
     *
     * @param a the array to print
     */
    public static void print(int[] a) {
        // todo implement
    }
}
      
