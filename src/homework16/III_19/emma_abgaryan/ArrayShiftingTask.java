package homework16.III_19.emma_abgaryan;

public class ArrayShiftingTask {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10/*, 11, 12, 13, 14, 15*/};
            shiftLeft(a, i);
            print(a);
        }
    }

    public static void shiftLeft(int a[], int shiftSize) {
        int length = a.length;
        for (int i = 0; i < shiftSize ; i++) {
            int tmp = a[0];
            for (int j = 1; j < length; j++) {
                a[j-1] = a[j];
            }
            a[length-1] = tmp;
        }
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