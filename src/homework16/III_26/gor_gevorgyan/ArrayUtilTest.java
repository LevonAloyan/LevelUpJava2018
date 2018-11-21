package homework16.III_26.gor_gevorgyan;



public class ArrayUtilTest {

    public static void main(String[] args) {

        int[] array = new int[]{5,10,25,5,30};

        System.out.println(ArrayUtil.randomIntArray(array.length,5));
        System.out.println(ArrayUtil.getMaximum(array));
        System.out.println(ArrayUtil.getMinimum(array));
        System.out.println(ArrayUtil.getSum(array));
        System.out.println(ArrayUtil.reverse(array));
        ArrayUtil.reverseInSameArray(array);
        ArrayUtil.print(array);

    }
}
