package homework.autumn.II.oct16.tsolak_harutyunyan.util;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] arr = new int[]{24, 14, 55, 68};
        ArrayUtil.getMin(arr);
        ArrayUtil.getMax(arr);
//       System.out.println(ArrayUtil.getMax(arr));
        ArrayUtil.getSum(arr);
        ArrayUtil.reverse(arr);
       // ArrayUtil.swap(arr, 0, 2);
        //ArrayUtil.print(arr);

    //public static void sortByOddAndEven(int[] array){
    }

    public static void getMax(int[] array) {
        int[] arr = new int[]{24, 14, 55, 68};

        if (68 != ArrayUtil.getMax(arr)) {
            System.err.println("The  max method Test  is not  passed");
        } else {

            System.out.println("The max method Test is passed");
        }

    }

    public static void getMin(String[] args) {
        int[] arr = new int[]{24, 14, 55, 68};

        if (14 != ArrayUtil.getMax(arr)) {
            System.err.println("The  min method Test  is not  passed");
        } else {

            System.out.println("The min method Test is passed");
        }

    }

    public static void getSum(int[] array) {
        int[] arr = new int[]{24, 14, 55, 68};

        if (161 != ArrayUtil.getSum(arr)) {
            System.err.println("The  sum method Test  is not  passed");
        } else {

            System.out.println("The sum method Test is passed");
        }

    }

    public static void reversTest() {
        int[] arrayBefore = {24, 14, 55, 68};
        int[] arrayAfter = {68, 55, 14, 24};

        ArrayUtil.reverse(arrayBefore);
        for (int i = 0; i < arrayBefore.length; i++) {
            if (arrayAfter[i] != arrayBefore[i]) {
                System.err.print("The reverse method Test is not passed");
                return;
            } else {

                System.out.println("reverse method Test is passed");
            }

        }
    }
}
