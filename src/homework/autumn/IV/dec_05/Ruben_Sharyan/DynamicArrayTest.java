package homework.autumn.IV.dec_05.Ruben_Sharyan;

public class DynamicArrayTest {

    public static void main(String[] args) {

        try {
            getTest();
            setTest();
            sizeTest();
            isEmptyTest();
            indexOfTest();
            lastIndexOfTest();
            addByIndexTest();
            removeByIndexTest();
        } catch (DynamicArrayException a) {

        }

    }

    public static void sizeTest() {

        DynamicArray<Integer> dynamicArray = init(2);

        dynamicArray.add(2);

        if (dynamicArray.size() != 2) {
            System.err.println("error size metod");
        } else {
            System.out.println("NO error size metod");
        }

    }

    public static void isEmptyTest() {
        DynamicArray<Integer> dynamicArray = init();

        if (!dynamicArray.isEmpty()) {
            System.err.println("error isEmpti method");
        } else {

        }
        System.out.println("NO error IsEmpti method");
    }

    public static void indexOfTest() {
        DynamicArray dynamicArray = init(2, 3);

        dynamicArray.add(2);
        if (dynamicArray.indexOf(2) != 2) {
            System.err.println("error indexof method");
        } else {
            System.out.println("NO erroe indexof method");
        }
    }

    public static void lastIndexOfTest() {
        DynamicArray<Integer> dynamicArray = init(1, 2);
        dynamicArray.add(2);
        if (dynamicArray.lastIndexOf(2) != 2) {
            System.err.println("error454 lastindexOf method");
        } else {
            System.out.println("NO ERROR lastIndexOf method");
        }

    }

    public static void getTest() {
        DynamicArrayImpl array = new DynamicArrayImpl();
        try {
            array.add(4);

        } catch (DynamicArrayException a) {
            if ("get is - 1".equals(a.getMessage())) {
                System.err.println("Incorrect message of DynamicArrayException during the test of DynamicArray#getWidth method" +
                        "\n excpected :width is -1, but actual message is: " + a.getMessage());
                return;
            }
        }
        System.out.println("get method is no error");
    }

    public static void setTest() {
        DynamicArrayImpl array = new DynamicArrayImpl();
        try {

            array.add(3);

        } catch (DynamicArrayException a) {
            if ("set is - 1".equals(a.getMessage())) {
                System.err.println("Incorrect message of DynamicArrayException during the test of DynamicArray#setWidth method" +
                        "\n excpected :width is -1, but actual message is: " + a.getMessage());
                return;
            }
        }
        System.out.println("set method is no error");
    }


    public static void addByIndexTest() {

        DynamicArray<Integer> dynamicArray = init(1, 2, 3);

        dynamicArray.get(1);
    }

    public static void removeByIndexTest() {
        DynamicArrayImpl array = new DynamicArrayImpl();
        try {

            array.get(2);

        } catch (DynamicArrayException a) {
            if ("remove is - 1".equals(a.getMessage())) {
                System.out.println("remove method is no error");
                return;
            }

        }
    }

    private static <T> DynamicArray<T> init(T... values) {
        DynamicArray<T> array = new DynamicArrayImpl<>();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            array.add(values[i]);
        }

        return array;

    }
}


