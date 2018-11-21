package homework.autumn.II.oct24.gor_gevorgyan.arrays;
//import static gor_gevorgyan.auditorium.array.ArrayUtil.sortByOddAndEven;




public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 2, 8, 6, 100, 15, 20};
        ArrayUtil.sortByOddAndEven(a);
        ArrayUtil.getMax(a);
        ArrayUtil.getMin(a);
        ArrayUtil.getSum(a);
        ArrayUtil.reverse(a);
        ArrayUtil.print(a);
    }

    public static void sortByOddAndEvenTest() {
        int[] arrayBefore = {3, 5, 2, 8, 6, 100, 15, 20};
        int[] array = {2, 3, 8, 5, 6, 15, 100, 20};

        ArrayUtil.sortByOddAndEven(arrayBefore);
        for (int i = 0; i < arrayBefore.length; i++) {
            if (arrayBefore[i] != array[i]) {
                System.err.print("The sortByOddAndEven method Test is not passed");
                return;
            }
        }
        System.out.println("sortByOddAndEven method Test is passed");
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
            System.err.println("Test is not passed");
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
