package homework.autumn.II.oct31.andranik_khachatryan.dynamicarray;


public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;

    public static void main(String[] args) {
        dynamicArray = new DynamicArrayImpl();
        int value [] = {1,5,8};
        sizeTest();
        isEmptyTest();
        indexOfTest();
        lastIndexOfTest();
        getTest();
        //setTest();


        // call all test methods
        

    }

    public static void sizeTest() {
        System.out.println("size of dynamic value:" + dynamicArray.size());
    }

    public static void isEmptyTest() {
        System.out.println("is empty value or not:" + dynamicArray.isEmpty());
    }

  
    public static void indexOfTest() {
        System.out.println("index of value:" + dynamicArray.indexOf(5));
    }

    public static void lastIndexOfTest() {
        System.out.println("last index of value:" + dynamicArray.lastIndexOf(8));
    }

    public static void getTest() {
        System.out.println("get value: " + dynamicArray.get(1));
    }

    public static void setTest(int index, Integer element) {
        System.out.println("set value:" + dynamicArray.set(index,element));
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
