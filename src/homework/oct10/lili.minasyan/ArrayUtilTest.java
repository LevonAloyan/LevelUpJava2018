package homework.oct10.lili.minasyan;




public class ArrayUtilTest {

    public static void main(String[] args) {
        sortByOddAndEven();
        getMax();
        getMin();
        reversTest();
        getSum();

    }

    public static void sortByOddAndEven() {
        int[] arrayBefore = {5, 7, 8, 2, 9, 4, 1};
        int[] arrayAfter = {5, 8, 7, 2, 9, 4, 1};

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
        int[] arrayBefore = {5, 7, 8, 2, 9, 4, 1};
        int res = ArrayUtil.getMax(arrayBefore);
        int acceptValue = 9;

        ArrayUtil.getMax(arrayBefore);
        if (res != acceptValue) {
            System.err.print("This method does'nt return max value");
            return;
        }

        System.out.println("This method  return max value");
    }

    public static void getMin() {
        int[] arrayBefore = {5, 7, 8, 2, 9, 4, 1};
        int res = ArrayUtil.getMin(arrayBefore);
        int acceptValue = 1;

        ArrayUtil.getMin(arrayBefore);
        if (res != acceptValue) {
            System.err.print("This method doesn't return min value");
            return;
        }

        System.out.println("This method  return min value");
    }

    public static void reversTest(){
        int [] arrayBefore = {5, 7, 8, 2, 9, 4, 1};
        int [] arrayAfter =  {1, 4, 9, 2, 8, 7, 5};

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
        int[] arrayBefore = {5, 7, 8, 2, 9, 4, 1};
        int res = ArrayUtil.getSum(arrayBefore);
        int acceptedValue = 36;

        ArrayUtil.getSum(arrayBefore);

        if (res != acceptedValue) {
            System.err.print("This method does'nt return sum ");
            return;
        }

        System.out.println("This method  return sum");
    }
}