package homework.autumn.II.oct3.artur_sahakyan.arrays;

//import static artur_sahakyan.arrays.ArrayUtil.*;
//import static artur_sahakyan.arrays.ArrayUtil.getMin;
//import static artur_sahakyan.arrays.ArrayUtil.getSum;
//import static artur_sahakyan.arrays.ArrayUtil.reverse;
//import static artur_sahakyan.arrays.ArrayUtil.print;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 12, 8, 3, 15, 22, 7, 55, 60, 68};
        System.out.println(ArrayUtil.getMax(a));
        System.out.println(ArrayUtil.getMin(a));
        System.out.println(ArrayUtil.getSum(a));
        ArrayUtil.reverse(a);
        ArrayUtil.print(a);
    }
}
