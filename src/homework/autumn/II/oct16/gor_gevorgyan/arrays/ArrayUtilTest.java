package homework.autumn.II.oct16.gor_gevorgyan.arrays;
//import static gor_gevorgyan.auditorium.array.ArrayUtil.sortByOddAndEven;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 2, 8, 6, 100, 15, 20};
        //System.out.println(ArrayUtil.sortByOddAndEven(I_12));
        ArrayUtil.getMax(a);
        ArrayUtil.getMin(a);
        ArrayUtil.getSum(a);
        ArrayUtil.reverse(a);
        ArrayUtil.print(a);
    }

    public static void getMaxTest(int[] array) {
        int[] a = new int[]{3, 5, 2, 8, 6, 100, 15, 20};
        if (100 != ArrayUtil.getMax(array)) {
            System.err.println("Test is not passed");
        } else {
            System.out.println("Test is  passed");

        }
    }

    public static void getMinTest(int[] array) {
        int[] a = new int[]{3, 5, 2, 8, 6, 100, 15, 20};
        if (2 != ArrayUtil.getMin(array)) {
            System.err.println("powTest is not passed");
        } else {
            System.out.println("powTest is  passed");
        }
    }

    public static void getSumTest(int[] array) {
        int[] a = new int[]{3, 5, 2, 8, 6, 100, 15, 20};
        if (159 != ArrayUtil.getSum(array)) {
            System.err.println("powTest is not passed");
        } else {
            System.out.println("powTest is  passed");
        }
    }

    public static void reverseTest(int[] array) {
        int[] a = new int[]{3, 5, 2, 8, 6, 100, 15, 20};
        int[] b = new int[]{20, 15, 100, 6, 8, 2, 5, 3};
        if (b != ArrayUtil.reverse(array)) {
            System.err.println("powTest is not passed");
        } else {
            System.out.println("powTest is  passed");
        }
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
