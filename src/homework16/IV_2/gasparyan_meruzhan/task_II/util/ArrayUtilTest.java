package homework16.IV_2.gasparyan_meruzhan.task_II.util;

public class ArrayUtilTest {

    public static void main(String[] args) {
        testSortByOddAndEven();
        getMaximumTest();
        getMinimumTest();
        getSumTest();
        reverseTest();

    }

    public  static void testSortByOddAndEven( ){
        int [] array ={ 4 , 8 , 3 ,9};
        int [] arrayTest = { 4 , 3 ,8 ,9 };
        ArrayUtil.sortByOddAndEven(array);
        for (int i = 0; i <array.length ; i++) {
            if(array[i] != arrayTest[i]){
                System.err.print("The SortByOddAndEven method Test is not passed");
                return;
            }
        }
        System.out.println("SortByOddAndEven method Test is passed");
    }

    public static void getMaximumTest(){
        int [] array = { 1 , 5 , 7 , 3};
        int testvalu =7;
       int value = ArrayUtil.getMaximum(array);
        if(testvalu != value){

            System.err.print("The getMaximum method Test is not passed");
            return;
        }
        System.out.println("getMaximum method Test is passed");
    }
    public static void  getMinimumTest(){
        int [] array = { 1 , 5 , 8, 0};
        int valuTest = 0;
        int value = ArrayUtil.getMinimum(array);
        if(valuTest != value){
            System.err.print("The getMinimum method Test is not passed");
            return;
        }
        System.out.println("getMinimum method Test is passed");
    }

    public static void getSumTest( ){
        int [] array = { 8 ,3 , 2 ,9 };
        int testValue=22;
        int value = ArrayUtil.getSum(array);
        if(testValue != value){
            System.err.print("The getSum method Test is not passed");
            return;
        }
        System.out.println("getSum method Test is passed");
    }

    public  static void reverseTest(){
        int [] array = { 1 , 5 , 4 , 7};
        int [] arrayTest = { 7 , 4 , 5 , 1};
        ArrayUtil.reverse(array);
        for (int i = 0; i <array.length ; i++) {
            if(array[i] != arrayTest[i]){
                System.err.print("The reverse method Test is not passed");
                return;
            }
        }
        System.out.println("reverse method Test is passed");
    }

}