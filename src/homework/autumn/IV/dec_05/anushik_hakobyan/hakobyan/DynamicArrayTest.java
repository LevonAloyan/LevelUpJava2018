package homework.autumn.IV.dec_05.anushik_hakobyan.hakobyan;

import homework.autumn.IV.dec_05.anushik_hakobyan.hakobyan.IndexOutOfSize.*;

public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;

    public static void main(String[] args) {
        sizeTest();
        isEmptyTest();
        indexOfTest();
        lastIndexOfTest();
        getTest();
        setTest();
        addTest();
        addByIndexTest();
        removeIndexTest();
        removeTest();

    }


    public static void sizeTest() { //TODO : always send reformated code
        dynamicArray = new DynamicArrayImpl();

        if (dynamicArray.size() != 0) {
            System.err.println("Failed to test size method: initial size of dynamicArray not zero");
        }
//        TODO: add more cases
        System.out.println("No Error: size method");
    }


    public static void isEmptyTest() {
        dynamicArray = new DynamicArrayImpl();
        if (dynamicArray.isEmpty() != true) {
            System.err.println("Error:isEmpty method");
        }
        System.out.println("No error:isEmpty method");

    }


    public static void indexOfTest() {
        dynamicArray = new DynamicArrayImpl();
        if (dynamicArray.indexOf(4) != 4) {
            System.err.println("Error:indexOf method");
        } else {
            System.out.println("No error:indexOf method");

        }
    }


    public static void lastIndexOfTest() {
        dynamicArray = new DynamicArrayImpl();
        if (dynamicArray.lastIndexOf(4) != 4) {
            System.err.println("Error:lastIndexOf method");
        } else {
            System.out.println("No error:lastIndexOf method");

        }
    }


    public static void getTest() {
        dynamicArray = new DynamicArrayImpl();
        for (int i = 5; i < 10; i++) {
            dynamicArray.add(i);
        }
        try {
            dynamicArray.get(15);
            System.err.println("Error: get method");
        } catch (IndexOutOfSize e) {
            if (!"index is 15".equals(e.getMessage())) {
                System.err.println("Error: IndexOutOfSize get method does not work");
            }
        }

        if (dynamicArray.get(4) != 4) {
            System.err.println("ERROR: get method");
        } else {
            System.out.println("NO ERROR: get method");
        }
    }


    public static void setTest() {
        dynamicArray = new DynamicArrayImpl();
        for (int i = 5; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        try {
            dynamicArray.set(12, 8);
            System.err.println("ERROR: set method");
        } catch (IndexOutOfSize e) {
            if (!"index is 12".equals(e.getMessage())) {
                System.err.println("Error:IndexOutOfSize set method does not work");
            }

            if (dynamicArray.set(2, 4) != 4) {
                System.err.println("Error:set method");
            } else {
                System.out.println("No error:set method");

            }
        }
    }

    public static void addTest() {
        dynamicArray = new DynamicArrayImpl();
        for (int i = 5; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        if (dynamicArray.add(30) != true) {
            System.err.println("Error:add method");
        } else {
            System.out.println("No error:add method");

        }
    }


    public static void addByIndexTest() {
        dynamicArray = new DynamicArrayImpl();

        for (int i = 5; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        try {
            dynamicArray.add(3, 8);
            System.err.println("Error: set method");
        } catch (IndexOutOfSize e) {
            if (!"index is 3".equals(e.getMessage())) {
                System.err.println("Error: IndexOutOfSize addByIndex method does not work");
            }
        }
    }


    public static void removeIndexTest() {
        dynamicArray = new DynamicArrayImpl();

        for (int i = 0; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        if (dynamicArray.removeIndex(3) != true) {
            System.err.println("Error:removeIndex method");
        } else {
            System.out.println("No error:removeIndex method");

        }
    }

    public static void removeTest() {
        dynamicArray = new DynamicArrayImpl();

        for (int i = 5; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        try {
            dynamicArray.remove(-7);
            System.err.println("Error: remove method");
        } catch (IndexOutOfSize e) {
            if (!"index is -7".equals(e.getMessage())) {
                System.err.println("Error: IndexOutOfSize remove method does not work");
            }
        }
    }


}
