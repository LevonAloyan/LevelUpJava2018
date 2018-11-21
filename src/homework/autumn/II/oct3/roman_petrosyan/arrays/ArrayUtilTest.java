package homework.autumn.II.oct3.roman_petrosyan.arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        ArrayUtil.sortByOddAndEven(array);
        ArrayUtil.getMaximum(array);
        ArrayUtil.getMinimum(array);
        ArrayUtil.getSum(array);
        ArrayUtil.reverse(array);
        int i = 0; int j=1;
        ArrayUtil.swap(array,i, j);
        ArrayUtil.print(array);
    }
}

