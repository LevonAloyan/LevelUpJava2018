package auditorium.array;

public class ArrayUtilTest {



    public static void main(String[] args) {
//        reversTest();
        int [] arrayAfter =  {2, 1, 6, 8, 3, 4, 5, 7};
//        ArrayUtil.sortByOddAndEven(arrayAfter);
//        ArrayUtil.reverse(arrayAfter);
//        ArrayUtil.print(arrayAfter);

        ArrayUtil.sortByOddAndEven(arrayAfter);
        ArrayUtil.print(arrayAfter);

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
