package homework.autumn.II.oct3.tatevhovsepyan.arrays;


public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] a = new int[]{3, 9, 2, 123, 23, 44};
//        System.out.println(ArrayUtil.getMax(I_12));
//        System.out.println(ArrayUtil.getMin(I_12));
//        System.out.println(ArrayUtil.getSum(I_12));
        int prim = 0;
        ArrayUtil.print(a);
        ArrayUtil.reverse(a, prim);
        ArrayUtil.print(a);
        System.out.println(prim);


    }
}