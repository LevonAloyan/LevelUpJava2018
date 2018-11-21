package homework16.III_19.roman_petrosyan.taskstodo;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Arrays;

public class ArrayShiftingTask {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10/*, 11, 12, 13, 14, 15*/};
       shiftLeft(a, 5);
            print(a);
        }
    }

    public static void shiftLeft(int a[], int shiftSize) {
        if(shiftSize<=0)return;
        int  index=a[0];
        for (int j = 1; j <a.length ; j++) {
            a[j-1]=a[j];
        }
        a[a.length-1]=index;
        shiftLeft(a,shiftSize-1);



    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}
