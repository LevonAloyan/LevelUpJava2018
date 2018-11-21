package homework.autumn.IV.dec_05.mara_sekhpeyan;


public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;


    public static void main(String[] args) {
        sizeTest();
        isEmptyTest();
        indexOfTest();
        lastIndexOfTest();
        getTest();
        setTest(4, 6);
        addTest();
        addByIndexTest();
        removeByIndexTest();
        removeTest();

    }


    public static void sizeTest() {
        dynamicArray = new DynamicArrayImpl<Integer>();
        if (dynamicArray.size() != 0) {
            System.err.println("Error");
        }
        System.out.println("No Error");
    }

    public static void isEmptyTest() {
        //TODO: change body of implemented methods
        dynamicArray = new DynamicArrayImpl<>();
        if (dynamicArray.isEmpty() != true) {
            System.err.println("Error");
        }
        System.out.println("No Error");
    }


    public static void indexOfTest() {
        //TODO: change body of implemented methods
        dynamicArray =  new DynamicArrayImpl<>();
        if (dynamicArray.indexOf(7) != 7) {
            System.err.println("Error");
        }
        System.out.println("No Error");
    }

    public static void lastIndexOfTest() {
        //TODO: change body of implemented methods
        dynamicArray =  new DynamicArrayImpl<>();
        if (dynamicArray.lastIndexOf(7) != 7) {
            System.err.println("Error");
        }
        System.out.println("No Error");
    }

    public static void getTest() {
        //TODO: change body of implemented methods
        dynamicArray = new DynamicArrayImpl<>();
        for (int i = 4; i < 10; i++) {
            dynamicArray.add(i);
        }
        try {
            dynamicArray.get(17);
            System.err.println("Error");
        } catch (IndexOutOfBoundsException e) {
            if (!"index is 17".equals(e.getMessage())) {
                System.err.println("Error:doesn't work");
            }
        }
        if (dynamicArray.get(7) != 7) {
            System.err.println("ERROR");
        }
        System.out.println("No ERROR");
    }

    public static void setTest(int index, Integer element) {
        //TODO: change body of implemented methods
        dynamicArray =  new DynamicArrayImpl<>();
        for (int i = 4; i < 10; i++) {
            dynamicArray.add(3, 6);
        }
        try {
            dynamicArray.set(3, 6);
            System.err.println("error");
        } catch (IndexOutOfBoundsException e) {
            if (!"index is 3".equals(e.getMessage())) {
                System.err.println("Error:doesn't work");
            }
        }
        if (dynamicArray.set(3, 6) != 3) {
            System.err.println("ERROR");
        }
        System.out.println("No ERROR");
    }

    public static void addTest() {

        //TODO: change body of implemented methods
        dynamicArray = new DynamicArrayImpl<>();
        for (int i = 4; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        if (dynamicArray.add(45) != true) {
            System.err.println("Error");
        } else {
            System.out.println("No error");

        }
    }

    public static void addByIndexTest() {
        //TODO: change body of implemented methods
        dynamicArray =  new DynamicArrayImpl<>();

        for (int i = 4; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        try {
            dynamicArray.add(3, 5);
            System.err.println("Error");
        } catch (IndexOutOfBoundsException e) {
            if (!"index is 3".equals(e.getMessage())) {
                System.err.println("Error");
            }
        }
    }

    public static void removeByIndexTest() {
        //TODO: change body of implemented methods
        dynamicArray =  new DynamicArrayImpl<>();

        for (int i = 0; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        if (dynamicArray.removeIndex(5) != true) {
            System.err.println("Error");
        }
            System.out.println("No error");

        }
    public static void removeTest() {
        //TODO: change body of implemented methods
        dynamicArray =  new DynamicArrayImpl<>();
        for (int i = 5; i < 10; i++) {
            dynamicArray.add(i + 1);
        }
        try {
            dynamicArray.remove(-2);
            System.err.println("Error: remove method");
        } catch (IndexOutOfBoundsException e) {
            if (!"index is -2".equals(e.getMessage())) {
                System.err.println("Error");
            }
        }
    }

   
}
