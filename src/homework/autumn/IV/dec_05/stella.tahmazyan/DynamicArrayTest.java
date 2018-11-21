package homework.autumn.IV.dec_05.stella.tahmazyan;
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


     public static void sizeTest() {
           dynamicArray = new DynamicArrayImpl();

    if (dynamicArray.size() != 0) {
                   System.err.println(" ERROR: Size method");
               }
               System.out.println("NO ERROR: size method");
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
           if (dynamicArray.indexOf(5) != 5) {
               System.err.println("Error:indexOf method");
           } else {
               System.out.println("No error:indexOf method");

           }
       }


       public static void lastIndexOfTest() {
           dynamicArray = new DynamicArrayImpl();
           if (dynamicArray.lastIndexOf(6) != 6) {
               System.err.println("Error:lastIndexOf method");
           } else {
               System.out.println("No error:lastIndexOf method");

           }
       }




   public static void getTest() {
        dynamicArray = new DynamicArrayImpl();
        for (int i = 0; i < 8; i++) {
            dynamicArray.add(i);
        }
        try {
            dynamicArray.get(-2);
            System.err.println("ERROR: get method");
        } catch (IndexOutOfSize e) {
            if (!"index is -2".equals(e.getMessage())) {
                System.err.println("Error: IndexOutOfSize get method does not work");
            }
        }

        if (dynamicArray.get(5) != 5) {
            System.err.println(" ERROR: get method");
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
            dynamicArray.set(-2, 9);
            System.err.println("ERROR: set method");
        } catch (IndexOutOfSize e) {
            if (!"index is -2".equals(e.getMessage())) {
                System.err.println("Error: IndexOutOfSize set method does not work");
            }

        if (dynamicArray.set(1, 5) != 5) {
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
           dynamicArray.add(-2, 9);
           System.err.println("ERROR: set method");
       } catch (IndexOutOfSize e) {
           if (!"index is -2".equals(e.getMessage())) {
               System.err.println("Error: IndexOutOfSize addIndexOf method does not work");
           }
       }
   }


   public static void removeIndexTest() {
       dynamicArray = new DynamicArrayImpl();

       for (int i = 0; i < 10; i++) {
           dynamicArray.add(i + 1);
       }
       if (dynamicArray.removeIndex(1) != true) {
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
            dynamicArray.remove(-2);
            System.err.println("ERROR: remove method");
        } catch (IndexOutOfSize e) {
            if (!"index is -2".equals(e.getMessage())) {
                System.err.println("Error: IndexOutOfSize remove method does not work");
            }
        }
    }


}
