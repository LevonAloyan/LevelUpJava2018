package homework.autumn.IV.dec_05.srapion_hunanyan.dynarraytest;

public class DynArrayTest {

    private static DynArrayInterface<Integer> dynamicArray;

    public static void main(String[] args) {

        dynamicArray = new DinArrayInterfaceImpl(4);
//        tests without exception:
        addTest(3);
        sizeTest();
        isEmptyTest();
        containsTest(3);
        addByIndexTest(0,4);
        addTest(3);
        indexOfTest(3);
        lastIndexOfTest(3);
        setTest(2,5);
        getTest(2);
        removeTest(3);
        removeByIndexTest(0);
//        throwing exception tests:
        addByIndexTest(5,6);
        setTest(2,5);
        getTest(2);
        removeByIndexTest(2);

    }

    public static void sizeTest() {
        System.out.println("dynamic array size is " + dynamicArray.size());
    }

    public static void isEmptyTest() {
        if (true == dynamicArray.isEmpty()) {
            System.out.println("dynamic array is empty");
        } else {
            System.out.println("dynamic array is not empty");
        }
    }

    public static void containsTest(Integer i) {
        if (true == dynamicArray.contains(i)) {
            System.out.println("dynamic array contains object '" + i + "'");
        } else {
            System.out.println("dynamic array don't contain object '" + i + "'");
        }
    }

    public static void addTest(Integer i) {
        dynamicArray.add(i);
        System.out.println("object '" + i + "' is added to dynamic array");
    }

    public static void addByIndexTest(int index, Integer e) {
        try {
            dynamicArray.add(index, e);
            System.out.println("object '" + e + "' is added to dynamic array at index '" 
                    + index + "'");
        } catch (ArrayIndexOutOfBoundsException exc) {
            int maxIndex = dynamicArray.size() - 1;
            if (index >= dynamicArray.size()) {
                exc.printStackTrace();
                System.err.println("\nMaximum value of index is: " + maxIndex);
            } else {
                exc.printStackTrace();
                System.err.println("\n mnimum value of index is: 0");
            }
        }
    }

    public static void getTest(int index) {
        try {
            System.out.println("element in dynamic array in index "
                    + index + " is " + dynamicArray.get(index));
        } catch (ArrayIndexOutOfBoundsException exc) {
            int maxIndex = dynamicArray.size() - 1;
            if (index >= dynamicArray.size()) {
                exc.printStackTrace();
                System.err.println("\nMaximum value of index is: " + maxIndex);
            } else {
                exc.printStackTrace();
                System.err.println("\n mnimum value of index is: 0");
            }
        }
    }

    public static void indexOfTest(Integer i) {
        if (-1 == dynamicArray.indexOf(i)) {
            System.out.println("in dynamic array there is no object '" + i + "'");
        } else {
            System.out.println("first index of object '" + i
                    + "' in dynamic array is " + dynamicArray.indexOf(i));

        }
    }

    public static void lastIndexOfTest(Integer i) {
        if (-1 == dynamicArray.lastIndexOf(i)) {
            System.out.println("in dynamic array there is no object '" + i + "'");
        } else {
            System.out.println("last index of object '" + i
                    + "' in dynamic array is " + dynamicArray.lastIndexOf(i));

        }
    }

    public static void setTest(int index, Integer e) {
        try {
            System.out.println("in dynamic array element '"
                    + dynamicArray.set(index, e) + "' in index '"
                    + index + "' is changed by element '" + e + "'");
        } catch (ArrayIndexOutOfBoundsException exc) {
            int maxIndex = dynamicArray.size() - 1;
            if (index >= dynamicArray.size()) {
                exc.printStackTrace();
                System.err.println("\nMaximum value of index is: " + maxIndex);
            } else {
                exc.printStackTrace();
                System.err.println("\n mnimum value of index is: 0");
            }
        }
    }

    public static void removeTest(Integer i) {
        if (true == dynamicArray.remove(i)) {
            System.out.println("element '" + i + "' in dynamic array is removed");
        } else {
            System.out.println("in dynamic array there is no object '" + i + "'");
        }
    }

    public static void removeByIndexTest(int index) {
        try {
            System.out.println("element '" + dynamicArray.remove(index) 
                    + "' at index '" + index + "' in dynamic array is removed");
        } catch (ArrayIndexOutOfBoundsException exc) {
            int maxIndex = dynamicArray.size() - 1;
            if (index >= dynamicArray.size()) {
                exc.printStackTrace();
                System.err.println("\nMaximum value of index is: " + maxIndex);
            } else {
                exc.printStackTrace();
                System.err.println("\n mnimum value of index is: 0");
            }
        }
    }
}
