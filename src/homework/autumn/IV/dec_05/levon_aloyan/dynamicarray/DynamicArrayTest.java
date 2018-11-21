package homework.autumn.IV.dec_05.levon_aloyan.dynamicarray;


public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;

    public static void main(String[] args) {


       //sizeTest();
//        addTest(2);
      isEmptyTest();
//        indexOfTest(2);
//        lastIndexOfTest(1);
      //  getTest();
      // setTest(8,5);
     //  removeByIndexTest(0);
       //addByIndexTest(2,12);



    }

    public static void sizeTest() {
        dynamicArray = new DynamicArrayImpl();
        try{
            init();
            System.out.println(dynamicArray.size());
        }
        catch (NegativeArraySizeException e){
            System.out.println(e.getMessage());
        }


    }

    public static void isEmptyTest() {
        dynamicArray = new DynamicArrayImpl();
        System.out.println(dynamicArray.isEmpty());
            init();
            System.out.println(dynamicArray.isEmpty());

    }


    public static void indexOfTest(int value) {
        dynamicArray = new DynamicArrayImpl();
        try {
            init();
            System.out.println(dynamicArray.indexOf(value));
        } catch (ElementIsNullException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static void lastIndexOfTest(int value) {
        dynamicArray = new DynamicArrayImpl();
       init();
        try{
            System.out.println(dynamicArray.lastIndexOf(value));
        }
        catch (ElementIsNullException e){
            System.out.println("Error"+e.getMessage());
        }

    }

    public static void getTest() {
        dynamicArray = new DynamicArrayImpl();
        init();
       try{
           System.out.println(dynamicArray.get(-1));
           System.out.println(dynamicArray.get(0));

           System.out.println(dynamicArray.get(11));
       }catch (InvalidIndexException e){
           System.out.println("error"+ e.getMessage());
       }

    }

    public static void setTest(int index, Integer element) {
 dynamicArray = new DynamicArrayImpl();
        init();
        try {
            System.out.println(dynamicArray.set(index, element));
        } catch (InvalidIndexException e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }

    public static void addTest(){
 dynamicArray = new DynamicArrayImpl();

        System.out.println(dynamicArray.size());
        init();
        System.out.println(dynamicArray.size());

    }

    public static void addByIndexTest(int index, int value) {
         dynamicArray = new DynamicArrayImpl();
        init();

        try {
        dynamicArray.add(index, value);
        } catch (InvalidIndexException e) {
        System.out.println("ERROR " +e.getMessage());
        }
}
    public static void removeByIndexTest(int index) {
        dynamicArray = new DynamicArrayImpl();
        init();
        try {
            System.out.println(dynamicArray.remove(index));
        }
        catch (InvalidIndexException e){
        System.out.println("ERROR " + e.getMessage());
        }

    }
    private static void init(){
        for (int i = 0; i <5 ; i++) {
            dynamicArray.add(i);
        }
    }

}
