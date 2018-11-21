package homework.autumn.II.oct31.gasparyan_meruzhan.dynamicarray;


public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;

    /**
     * Use this field to indicate range of elements in dynamicArray,
     * during initializing in initDynamicArray method
     */
    private static int rangeOgElements = 20;

    public static DynamicArray<Integer> getDynamicArray() {
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);

        return dynamicArray;
    }

    /**
     * Use this field to indicate count of elements in dynamicArray,
     * during initializing in initDynamicArray method
     */
    private static int countOfElements = 7;


    //TODO add corresponding static methods to each method of DynamicArrayImple class
    // and organize them calls from main method

    public static void main(String[] args) {
        dynamicArray = new DynamicArrayImpl<>();
        sizeTest();
        isEmptyTest();
        indexOfTest();
        lastIndexOfTest();
        getTest();
        setTest();
        addTest();
        addByIndexTest();
        removeByIndexTest();

    }

    public static void sizeTest() {
        getDynamicArray();
        if (dynamicArray.size() != 8) {
            System.err.println("The sortByOddAndEven method Test is not passed");
        } else {
            System.out.println("size  method Test is passed");
        }

    }

    public static void isEmptyTest() {
        if (dynamicArray.isEmpty()) {
            System.out.println("isEmpty  method Test is passed");
        } else {
            System.err.println("The isEmpty method Test is not passed");
        }
    }


    public static void indexOfTest() {
        if (dynamicArray.indexOf(5) != 4) {
            System.err.println("The indexOf method Test is not passed");
        } else if (dynamicArray.indexOf(8) != 7) {
            System.err.println("The indexOf method Test is not passed");
        } else {
            System.out.println("indexOf  method Test is passed");
        }
    }

    public static void lastIndexOfTest() {
        if (dynamicArray.lastIndexOf(6) != 5) {
            System.err.println("The lastIndexOf method Test is not passed");
        } else if (dynamicArray.lastIndexOf(5) != 4) {
            System.err.println("The lastIndexOf method Test is not passed");
        } else {
            System.out.println("lastIndexOf  method Test is passed");
        }
    }

    public static void getTest() {
        if (dynamicArray.get(2) != 3) {
            System.err.println("The get method Test is not passed");
        } else if (dynamicArray.get(4) != 5) {
            System.err.println("The get method Test is not passed");
        } else {
            System.out.println("get  method Test is passed");
        }
    }

    public static void setTest() {
        if (dynamicArray.set(1, 5) != 5) {
            System.err.println("The set method Test is not passed");
        } else if (dynamicArray.set(5, 2) != 2) {
            System.err.println("The set method Test is not passed");
        } else {
            System.out.println("set  method Test is passed");
        }
    }

    public static void addTest() {
        if (!dynamicArray.add(5)) {
            System.err.println("The add method Test is not passed");
        } else if (!dynamicArray.add(8)) {
            System.err.println("The add method Test is not passed");
        } else {
            System.out.println("add  method Test is passed");
        }

    }

    public static void addByIndexTest() {
        dynamicArray.addByIndex(5, 8);
        if (dynamicArray.get(5) != 8) {
            System.err.println("The addByIndex method Test is not passed");
        }
        dynamicArray.addByIndex(2, 9);
        if (dynamicArray.get(2) != 9) {
            System.err.println("The addByIndex method Test is not passed");
        } else {
            System.out.println("addByIndex  method Test is passed");
        }
    }

    public static void removeByIndexTest() {
        if (dynamicArray.get(6) != dynamicArray.removeIndex(5)) {
            System.err.println("The removeByIndex method Test is not passed");
        } else if (dynamicArray.get(3) != dynamicArray.removeIndex(2)) {
            System.err.println("The removeByIndex method Test is not passed");

        } else {
            System.out.println("removeByIndex  method Test is passed");
        }

    }

}
