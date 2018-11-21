package homework.autumn.II.oct10.stella_tahmazyan;




public class ArrayUtilTest {

    public static void main(String[] args) {
        sortByOddAndEven();
        getMax();
        getMin();
        reversTest();
        getSum();

    }

    public static void sortByOddAndEven() {
        int[] arrayBefore = {32, 14, 5, 9, 7, 12, 4};
        int[] arrayAfter = {32, 5, 14, 9, 12, 7, 4};

        ArrayUtil.sortByOddAndEven(arrayBefore);
        for (int i = 0; i < arrayBefore.length; i++) {
            if (arrayAfter[i] != arrayBefore[i]) {
                System.err.print("This method  doesn't return sortByOddAndEven ");
                return;
            }
        }
        System.out.println("This method  return sortByOddAndEven");
    }


    public static void getMax() {
        int[] arrayBefore = {32, 14, 5, 9, 7, 12, 4};
        int res = ArrayUtil.getMax(arrayBefore);
        int acceptValue = 32;

        ArrayUtil.getMax(arrayBefore);
        if (res != acceptValue) {
            System.err.print("This method does'nt return max value");
            return;
        }

        System.out.println("This method  return max value");
    }

    public static void getMin() {
        int[] arrayBefore = {32, 14, 5, 9, 7, 12, 4};
        int res = ArrayUtil.getMin(arrayBefore);
        int acceptValue = 4;

        ArrayUtil.getMin(arrayBefore);
        if (res != acceptValue) {
            System.err.print("This method doesn't return min value");
            return;
        }

        System.out.println("This method  return min value");
    }

    public static void reversTest(){
        int [] arrayBefore = {32, 14, 5, 9, 7, 12, 4};
        int [] arrayAfter =  {4, 12, 7, 9, 5, 14, 32};

        ArrayUtil.reverse(arrayBefore);
        for (int i = 0; i < arrayBefore.length; i++) {
            if(arrayAfter[i] != arrayBefore[i]){
                System.err.print("This method  doesn't return revers");
                return;
            }
        }
        System.out.println("This method  return revers");
    }

    public static void getSum() {
        int[] arrayBefore = {32, 14, 5, 9, 7, 12, 4};
        int res = ArrayUtil.getSum(arrayBefore);
        int acceptedValue =83;

        ArrayUtil.getSum(arrayBefore);

        if (res != acceptedValue) {
            System.err.print("This method does'nt return sum ");
            return;
        }

        System.out.println("This method  return sum");
    }
}