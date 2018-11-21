package homework.autumn.II.oct3.babken_tovmasyan.array;


public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] a = new int[]{7, 3, 5, 2, 11, 10, 13};
        // todo complete the code
        // Call all methods of ArrayUtil class to test them
        System.out.println(ArrayUtil.getMax(a));
        System.out.println(ArrayUtil.getMin(a));
        System.out.print(ArrayUtil.getSum(a));
        ArrayUtil.reverse(a);
        ArrayUtil.print(a);

    }
}