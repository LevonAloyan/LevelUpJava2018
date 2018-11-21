package homework.autumn.II.oct3.levon_aloyan.arrays;

public class ArrayUtilTest {
    
    public static void main(String[] args) {
       int[] array = {4, 5, 6, -5, 8, 9};
        ArrayUtil.sortByOddAndEven(array);
        ArrayUtil.getMaximum(array);
        ArrayUtil.getMinimum(array);
        ArrayUtil.getSum(array);
        ArrayUtil.print(array);
        ArrayUtil.reverse(array);
        int i = 0; int j=1;
        ArrayUtil.swap(array,i, j);
        
    }
}

