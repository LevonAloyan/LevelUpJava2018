package homework.autumn.IV.dec_05.andranik_khachatryan.dynamicarray;

import java.security.InvalidParameterException;

/**
 * Created by User on 12/3/2015.
 */
public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray;
    public static void main(String[] args) {
      //  sizeTest();
       // isEmptyTest();
       // indexOfTest();
        addTest();
        //addByIndexTest();

    }
    public static void sizeTest(){
        System.out.println("size of dynamicArray: " + dynamicArray.size());
    }
    public static void isEmptyTest(){
        int size = 0;
        try {
            if(size>0||size<0){
                System.err.println("Invalid parameter");
            }
        }catch (InvalidParameterException e){
            System.out.println(e.getMessage());

        }
    }
    public static void indexOfTest(){
        System.out.println("indexof dynamicArray:" + dynamicArray.indexOf(4));
    }
    public static void lastIndexOfTest(){
        System.out.println("lasIndexOf" + dynamicArray.lastIndexOf(8));
    }
    public static void getTest(){
        dynamicArray = new DynamicArrayImpl(8);
        for (int i = 0; i < 8; i++) {
            dynamicArray.add(i + 1);
        }
        try {
            dynamicArray.get(9);
            System.err.println("ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void setTest(){}
    public static void addTest(){
        dynamicArray = new DynamicArrayImpl(8);
        for (int i = 0; i < 8; i++) {
            dynamicArray.add(i + 1);
        }
    }
    public static void addByIndexTest(){
        dynamicArray = new DynamicArrayImpl(8);
        for (int i = 0; i < 8; i++) {
            dynamicArray.add(i + 1);
        }
        try {
            dynamicArray.add(9);
            System.err.println("ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void removeByIndexTest(int index, Integer element){dynamicArray.add(index,element);}

}
