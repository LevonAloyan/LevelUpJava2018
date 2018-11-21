package homework.autumn.II.oct31.levon_aloyan.dynamicarray;


public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;

    public static void main(String[] args) {
        addTest();
        getTest();
    }

    public static void sizeTest() {
        System.out.println("size: " + dynamicArray.size());
    }

    public static void isEmptyTest() {
        System.out.println("empty:" + dynamicArray.isEmpty());
    }

    public static void indexOfTest() {
        System.out.println("indexOf" + dynamicArray.indexOf(1));
    }

    public static void lastIndexOfTest() {
        System.out.println("lasIndexOf" + dynamicArray.lastIndexOf(2));
    }

    public static void getTest() {
        dynamicArray = new DynamicArrayImpl(2);
        for (int i = 0; i < 2; i++) {
            dynamicArray.add(i + 1);
        }
        try {
            dynamicArray.get(3);
            System.err.println("ArrayIndexOutOfBoundsException not thrown");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            dynamicArray.get(-1);
            System.err.println("ArrayIndexOutOfBoundsException not thrown");

        } catch (ArrayIndexOutOfBoundsException e){

        }

    }

    public static void setTest(int index, Integer element) {

    }

    public static void addTest() {
        dynamicArray = new DynamicArrayImpl(2);
        for (int i = 0; i < 2; i++) {
            dynamicArray.add(i + 1);
        }
    }

    public static void addByIndexTest() {
        dynamicArray.add(5);
    }

    public static void removeByIndexTest(int index, Integer element) {
        dynamicArray.add(index, element);
    }


}
