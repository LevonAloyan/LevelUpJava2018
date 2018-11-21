package homework.autumn.IV.dec_05.grigor_abroyan.dynamicarray;


public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;

    //TODO: complete the test methods corresponding to DynamicArrayImple class methods 

    public static void main(String[] args) throws Exception {
       sizeTest();
        isEmptyTest();
        indexOfTest();
        lastIndexOfTest();
        getTest();
        sizeTest();
        addTest();
        addByIndexTesst();
        removeByIndexTest();
    }

    public static void sizeTest() {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        if (dynamicArray.size() != 0) {
            System.err.println("Error the size method");
        } else {
            dynamicArray.add(2);
            dynamicArray.add(2);
            if (dynamicArray.size() != 1) {
                System.out.println("'Error the size method");
            } else {
                System.out.println("no Eror");
            }
        }

    }

    public static void isEmptyTest() {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i);
        }
        if (dynamicArray.isEmpty()) {
            System.out.println("|Error isEmpty method");
        } else {
            System.out.println("no Error isEmpty");
        }
    }

    public static void indexOfTest() {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i);
        }
        if (dynamicArray.indexOf(5) != 5) {
            System.err.println("Eror indexOf method");
        } else {
            System.out.println("'no Error indexOf method");
        }
    }


    public static void lastIndexOfTest() {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i);
        }
        if (dynamicArray.indexOf(4) != 4) {
            System.err.println("Error lastIndexOf method");
        } else {
            System.out.println("no error lastIndexOf method");
        }
    }

    public static void getTest() {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i);
        }
        try {
            dynamicArray.get(1);
            System.err.println("Error get method");
        } catch (NumberFormatException e) {
            System.err.println("Error NumberFormatException get method");
        }
        try {
            dynamicArray.get(10);
            System.err.println("Error get method");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error ArrayIndexOutOfBoundsException: get method");
        }
    }

    public static void setTest(int index, Integer element) {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        try {
            dynamicArray.set(-1, 5);
        } catch (NumberFormatException e) {
            System.err.println("Error set method");
        }
    }

    public static void addTest() throws Exception {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        for (int i = 0; i < 5; i++) {
            if (!dynamicArray.add(i)) {
                System.err.println("Error add method");
            } else {
                System.out.println("no Error add method");
            }
        }
    }

    public static void addByIndexTesst() {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(4);
        }
        try {
            dynamicArray.add(-2);
            System.err.println("Error ExceptionDynamicArray set method");
        } catch (ArrayIndexOutOfBoundsException e) {
            if (!"index is -1".equals(e.getMessage())) {
                System.err.println("Error ArrayIndexOutOfBoundsException#set method");
            }
        }
        try {
            dynamicArray.add(2);
            System.err.println("Error ArrayIndexOutOfBoundsException#set method");
        } catch (ArrayIndexOutOfBoundsException e) {
            if (!"index is 10".equals(e.getMessage())) {
                System.err.println("Error ArrayIndexOutOfBoundsException# set method");
            }
        }
    }

    public static void removeByIndexTest() {
        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i);
        }
        try {
            dynamicArray.remove(-2);
            System.out.println("Error ArrayIndexOutOfBoundsException#removeByIndex method");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error ArrayIndexOutOfBoundsException#removeByIndex method");

        }
        try {
            dynamicArray.remove(2);
            System.out.println("Error ArrayIndexOutOfBoundsException#removeByIndex method");
        } catch (ArrayIndexOutOfBoundsException e) {
            if (!"index is 14".equals(e.getMessage())) {
                System.err.println("Error ExceptionDynamicArray#removeByIndex method");

            }
        }

    }
}
