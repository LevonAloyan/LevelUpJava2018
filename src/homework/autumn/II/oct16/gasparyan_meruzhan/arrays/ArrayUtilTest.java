package homework.autumn.II.oct16.gasparyan_meruzhan.arrays;


public class ArrayUtilTest {

    public static void main(String[] args) {
        sortByOddAndEvenTest();
        getMaxTest();
        getMinTest();
        getSumTest();
        reversTest();
    }

    public static void sortByOddAndEvenTest() {
        int[] arrays = new int[]{3, 5, 8, 7, 0, 2};
        int[] arrays2 = new int[]{3, 8, 5, 0, 7, 2};
        ArrayUtil.sortByOddAndEven(arrays);
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != arrays2[i]) {
                System.err.println("The sortByOddAndEven method Test is not passed");
            }

        }
        System.out.println("sortByOddAndEven method Test is passed");
    }

    public static void getMaxTest() {
        int[] arrays = new int[]{5, 9, 8, 7, 4, 1};
        int maxtest = 9;
        ArrayUtil.getMax(arrays);
        if (maxtest != ArrayUtil.getMax(arrays)) {
            System.err.println("The getMax method Test is not passed");
        } else {
            System.out.println("getMax method Test is passed");
        }
    }

    public static void getMinTest() {
        int[] arrays = new int[]{5, 9, 8, 7, 4, 1};
        int minTest = 1;
        if (minTest != ArrayUtil.getMin(arrays)) {
            System.err.println("The getMin method Test is not passed");
        } else {
            System.out.println("getMin method Test is passed");
        }
    }

    public static void getSumTest() {
        int[] arrays = new int[]{5, 9, 8, 7, 4, 1};
        int sumTest = 34;
        if (sumTest != ArrayUtil.getSum(arrays)) {
            System.err.println("The getSum method Test is not passed");
        } else {
            System.out.println("getSum method Test is passed");
        }
    }

    public static void reversTest() {
        int[] arrayBefore = {12, 4, 7, 5, 24, 2, 1};
        int[] arrayAfter = {1, 2, 24, 5, 7, 4, 12};

        ArrayUtil.reverse(arrayBefore);
        for (int i = 0; i < arrayBefore.length; i++) {
            if (arrayAfter[i] != arrayBefore[i]) {
                System.err.println("The reverse method Test is not passed");
                return;
            }
        }
        System.out.println("reverse method Test is passed");

    }
}
