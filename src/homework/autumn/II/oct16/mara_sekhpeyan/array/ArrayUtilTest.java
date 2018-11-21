package homework.autumn.II.oct16.mara_sekhpeyan.array;




public class ArrayUtilTest {

    public static void main(String[] args) {
        reversTest();
        sortByOddAndEvenTest();
        getMaxTest();
        getMinTest();
        getSumTest();
        
    }
    public static void sortByOddAndEvenTest(){
        int [] arrayBefore = {12, 4, 7, 5, 24, 2, 1};
        int [] array = {12,7,4,5,24,1,2};

        ArrayUtil.sortByOddAndEven(arrayBefore);
        for(int i=0; i<arrayBefore.length;i++){
            if (arrayBefore[i] != array[i] ){
                System.err.print("The sortByOddAndEven method Test is not passed");
                return;
            }
        }
        System.out.println("sortByOddAndEven method Test is passed");
    }

    public static void getMaxTest() {
        int[] array = {12, 4, 7, 5, 24, 2, 1};

        if (ArrayUtil.getMax(array) != 24) {
            System.err.print("The getMax method Test is not passed");
            return;
        }
        System.out.println("getMax method Test is passed");
    }

    public static void getMinTest(){
        int[] array = {12, 4, 7, 5, 24, 2, 1};
        if (ArrayUtil.getMin(array) != 1) {
            System.err.print("The getMin method Test is not passed");
            return;
        }
        System.out.println("getMin method Test is passed");
    }

    public static void getSumTest(){
        int[] array = {6, 4, 7, 5, 3, 2, 1};
        if (ArrayUtil.getSum(array) != 28) {
            System.err.print("The getSum method Test is not passed");
            return;
        }
        System.out.println("getSum method Test is passed");
    }

    
    public static void reversTest(){
        int [] arrayBefore = {12, 4, 7, 5, 24, 2, 1};
        int [] arrayAfter =  {1, 2, 24, 5, 7, 4, 12};

        ArrayUtil.reverse(arrayBefore);
        for (int i = 0; i < arrayBefore.length; i++) {
            if(arrayAfter[i] != arrayBefore[i]){
                System.err.print("The reverse method Test is not passed");
                return;
            }
        }
        System.out.println("reverse method Test is passed");
    }
}
