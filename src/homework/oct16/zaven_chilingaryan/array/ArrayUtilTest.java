package homework.oct16.zaven_chilingaryan.array;


public class ArrayUtilTest {
    public static void main(String[] args) {

        int[] array = new int[]{7, 6, 21, 64, 4, 6};
        //ArrayUtil.sortByOddAndEven(array);
        //ArrayUtil.print(array);
        getMaximum(array);
        getMinimum(array);
        getSum(array);
        //ArrayUtil.reverse(array);
        reverseTest();
        //ArrayUtil.print(array);
//        System.out.println(prim);

    }

    public static void getMaximum(int[] q) {
        int[] array = new int[]{7, 6, 21, 64, 4, 6};
        if (64 != ArrayUtil.getMaximum(array)) {
            System.err.print("Erroe MaxTest is not passed");
        } else {
            System.out.println(" MaxTest is  passed");
        }
    }

    public static void getMinimum(int[] q) {
        int[] array = new int[]{7, 6, 21, 64, 4, 6};
        if (4 != ArrayUtil.getMinimum(array)) {
            System.err.println("Erroe MinTest is not passed");
        } else {
            System.out.println(" MinTest is  passed");
        }
    }

    public static void getSum(int[] q) {
        int[] array = new int[]{7, 6, 21, 64, 4, 6};
        if (108 != ArrayUtil.getSum(array)) {
            System.err.println("Erroe SumTest is not passed");
        } else {
            System.out.println(" SumTest is  passed");
        }
    }

    public static void reverseTest() {
        int[] arrayBefore = new int[]{7, 6, 21, 64, 4, 6};
        int[] arrayAfter = new int[]{6, 4, 64, 21, 6, 7};
        ArrayUtil.reverse(arrayBefore);
        for (int i = 0; i < arrayBefore.length; i++) {
            if (arrayBefore[i] != arrayAfter[i]) {
                System.err.println("Erroe ReverseTest is not passed");

            }
        }

        System.out.println(" ReverseTest is  passed");

    }


}