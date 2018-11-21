package homework.autumn.II.oct3.emma_abgaryan;


public class ArrayUtilTest {

    public static void main(String[] args) {

        int [] array = new int[6];
        array[0] = 45;
        array[1] = 6;
        array[2] = 21;
        array[3] = -2;
        array[4] = 35;
        array[5] = 17;


        System.out.println("maximum number is " + ArrayUtil.getMaximum(array));
        System.out.println("minimum number is " + ArrayUtil.getMinimum(array));
        System.out.println("Sum is " + ArrayUtil.getSum(array));

        int [] ar = ArrayUtil.reverse(array);

        ArrayUtil.print(ar);


        // todo complete the code
       // Call all methods of ArrayUtil class to test them
    }

}