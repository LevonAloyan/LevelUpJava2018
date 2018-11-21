package homework.autumn.II.oct3.anushik_hakobyan;
public class ArrayUtil {
    // todo complete the code
    // Call all methods of ArrayUtil class to test them

    /**
     * Sorts the array elements by odd and even number
     * such that if I_12 number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the array
     */
    public void sortByOddAndEven(int[] array) {
        int b;
        if (array[0] % 2 == 1) {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0 && array[i] % 2 == 0) {
                    for (int j = i; j < array.length; j++)
                        if (array[i] % 2 == 1) {
                            b = array[i];
                            array[j] = array[i];
                            array[i] = b;
                            break;
                        } else {
                            //i % 2 == 1 && array[i] % 2 == 1;
                            for (j = i; j < array.length; j++) {
                                if (array[j] % 2 == 0) {
                                    b = array[i];
                                    array[i] = array[j];
                                    array[j] = b;
                                    break;
                                }

                            }
                        }
                }
            }
        } else for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1 && array[i] % 2 == 1) {
                for (int j = i; j < array.length; j++) {
                    if (array[i] % 2 == 0) {
                        b = array[j];
                        array[j] = array[i];
                        array[i] = b;
                        break;
                    } else {

                        for (j = i; j < array.length; j++) {
                            if (array[j] % 2 == 1) {
                                b = array[i];
                                array[i] = array[j];
                                array[j] = b;
                                break;
                            }

                        }
                    }
                }

            }
        }

        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    //array[0] % 2 == 0)
// use the swap method to swap  two elements with i and j indexes  of the specified  Array.

    public static int getMaximum(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;

//        TODO   implement
        //  return 0;   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {
        int min = 0;
        min = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
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
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        return s;
    }

    public static int[] reverse(int[] array) {
        int b = array.length;
        int c;
        for (int i = 0; i < array.length; i++) {
            c = array[i];
            array[i] = array[b];
            array[b] = c;
            b--;
        }
        return array;
    }

    //    private static void swap(int[] array, int i, int j) {
    //      int tmp = array[i];
    //    array[i] = array[j];
    //  array[j] = tmp;
    //}
    public static void swap(final int[] arr, final int pos1, final int pos2) {
        final int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;


        /**
         * Prints all elements in an array.
         *
         * @param I_12 the array to print
         */ /*

            public static void print(int[] I_12) {
                // todo implement
            }

            static class java {

                public java() {
                }
            }
        */
    }
}
