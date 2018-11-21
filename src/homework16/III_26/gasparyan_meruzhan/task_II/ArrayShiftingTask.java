package homework16.III_26.gasparyan_meruzhan.task_II;

public class ArrayShiftingTask {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10/*, 11, 12, 13, 14, 15*/};
            shiftLeft(a, i);
            print(a);
        }
    }

    public static void shiftLeft(int a[], int shiftSize) {
        if(shiftSize % a.length == 0 || shiftSize<0){
            return;
        }
        shiftSize =shiftSize % a.length;
        int[] array = new int[shiftSize];
        System.arraycopy(a, 0, array, 0, array.length);
        for (int i = 0; i < a.length - shiftSize; i++) {
            a[i] = a[i + shiftSize];
        }
    System.arraycopy(array, 0, a,a.length-shiftSize,shiftSize);
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}

