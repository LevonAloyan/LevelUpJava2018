package homework.oct16.tatev_hovsepyan;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] a = new int[]{3, 9, 2, 123, 23, 44};
        getMax(a);
        getMin(a);
        //System.out.println(ArrayUtil.getSum(a));
        //ArrayUtil.reverse(a);
        //ArrayUtil.print(a);
        reverseTest();

    }


public static void getMax(int[] array) {
    int[] a = new int[]{3, 9, 2, 123, 23, 44};
    if (123!=ArrayUtil.getMax(a)) {
        System.err.println("the max method test is not passed");
    }else{
    }
    System.out.println("the max method test is passed");
}



    public static void getMin(int[] array) {
        int[] a = new int[]{3, 9, 2, 123, 23, 44};
        if (2!=ArrayUtil.getMin(a)) {
            System.err.println("the min method test is not passed");
        }else{
        }
        System.out.println("the min method test is passed");
    }


    public static void reverseTest( ) {
        int[] arrayBefor = new int[]{3, 9, 2, 123, 23, 44};
        int[] arrayAfter = new int[]{44, 23, 123, 2, 9, 3};
        ArrayUtil.reverse(arrayBefor);
        for (int i = 0; i < arrayBefor.length; i++) {
            if (arrayBefor[i] != arrayAfter[i]) {
                System.err.println("Error reversTest is not passed");
            }  }
                System.out.println("reversTest is passed");
            }

        }


