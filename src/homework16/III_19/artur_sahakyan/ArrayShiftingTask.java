package homework16.III_19.artur_sahakyan;

public class ArrayShiftingTask {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10/*, 11, 12, 13, 14, 15*/};
            shiftLeft(a, i);
            print(a);
        }
    }

    public static void shiftLeft(int a[], int shiftSize) {
        if (shiftSize <= 0) {
            return;
        }
        int num = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = num;
        shiftLeft(a, shiftSize - 1);
        //todo implement
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}

// auditorium.taskstodo.ArrayShiftingTask - public static void shiftLeft(int a[], int shiftSize)

// auditorium.taskstodo.TextAnalyzer.findLongestPalindrome(String text)