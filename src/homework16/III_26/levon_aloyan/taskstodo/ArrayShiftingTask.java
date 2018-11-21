package homework16.III_26.levon_aloyan.taskstodo;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Arrays;

public class ArrayShiftingTask {
    public static void main(String[] args) {
       // for (int i = 0; i < 10; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10/*, 11, 12, 13, 14, 15*/};
       shiftLeft(a, 15);
            print(a);
      //  }
    }


    public static void shiftLeft(int a[], int shiftSize) {
        int length = a.length;

        if (shiftSize <= 0) return;
        if (shiftSize > length) {
            shiftSize = shiftSize % length;
        }
        for (int i = 0; i < shiftSize; i++) {
            int index = a[0];

            for (int j = 1; j < length; j++) {
                a[j - 1] = a[j];
            }
            a[length - 1] = index;
        }
    }




    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}
