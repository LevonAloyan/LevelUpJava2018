package homework.autumn.II.oct31.srapion_hunanyan.dynamicarray;

public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;

    /**
     * Use this field to indicate range of elements in dynamicArray,
     * during initializing in initDynamicArray method
     */
    private static int rangeOgElements = 20;

    /**
     * Use this field to indicate count of elements in dynamicArray,
     * during initializing in initDynamicArray method
     */
    private static int countOfElements = 7;
    public void initDynamicArray (int range, int count){
        for (int i = 0; i < count; i ++){
            
//            DynamicArrayImpl.initarray(2);
        }
    }


    //TODO add corresponding static methods to each method of DynamicArrayImple class
    // and organize them calls from main method

    public static void main(String[] args) {
        // call all test methods
        
        DynamicArrayImpl prob = new DynamicArrayImpl(7);     
        
    }

    public static void sizeTest() {
        //TODO change body of implemented methods
        System.out.println(dynamicArray.size());
    }

    public static void isEmptyTest() {
        //TODO: change body of implemented methods
    }

  
    public static void indexOfTest() {
        //TODO: change body of implemented methods
    }

    public static void lastIndexOfTest() {
        //TODO: change body of implemented methods
    }

    public static void getTest() {
        //TODO: change body of implemented methods
    }

    public static void setTest(int index, Integer element) {
        //TODO: change body of implemented methods
    }

    public static void addTest() {
        //TODO: change body of implemented methods
    }

    public static void addByIndexTest() {
        //TODO: change body of implemented methods
    }

    public static void removeByIndexTest() {
        //TODO: change body of implemented methods
    }


   
}
