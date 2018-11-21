package homework.autumn.II.oct31.emma_abgaryan;


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


    //TODO add corresponding static methods to each method of DynamicArrayImple class
    // and organize them calls from main method

    public static void main(String[] args) {
        // call all test methods
        DynamicArrayImpl<Integer> dynamicArray1 = new DynamicArrayImpl(5);
        dynamicArray1.add(2,11);
        dynamicArray1.add(3,-8);
       // dynamicArray1.add(4,41);
        System.out.println("remove = " + dynamicArray1.remove(3));
        System.out.println("rem = " + dynamicArray1.remove(11)); //????

        System.out.println("add = " + dynamicArray1.add(45));
//        for (int i = 0; i < dynamicArray1.array.length; i++) {
//            System.out.println("array[" + i + "] = " + dynamicArray1.array[i]);
//        }

        System.out.println(dynamicArray1.size());
        System.out.println("isEmpty = " + dynamicArray1.isEmpty());
        System.out.println("contains = " + dynamicArray1.contains(11));
        System.out.println("indexOf = " + dynamicArray1.indexOf(111));
        System.out.println("lastIndexOf = " + dynamicArray1.lastIndexOf(111));
        System.out.println("set = " + dynamicArray1.set(3,7));
        System.out.println("add = " + dynamicArray1.add(7));



    }

    public static void sizeTest() {

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
