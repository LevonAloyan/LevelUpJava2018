package homework16.III_19.stella.tahamzyan;

public class ArrayShiftingTask {
    public static void main(String[] args) {
        for (int i = 0; i < 5.; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            shiftLeft(a, i);
            print(a);
        }
    }

    public static void shiftLeft(int a[], int shiftSize) {
         int tmp [] = new int[shiftSize];
       for (int i = 0; i < shiftSize; i++) {
           tmp[i] = a[i];
        }
        for (int i = 0; i < a.length - shiftSize ; i++) {
            a[i] = a[i + shiftSize];
        }
        for (int i = 0; i <shiftSize ; i++) {
            a[a.length - shiftSize + i] = tmp[i];
       }

    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}

