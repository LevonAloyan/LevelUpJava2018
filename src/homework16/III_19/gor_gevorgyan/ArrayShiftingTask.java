package homework16.III_19.gor_gevorgyan;

public class ArrayShiftingTask {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10/*, 11, 12, 13, 14, 15*/};
            shiftLeft(a, i);
            print(a);
        }
    }

    public static void shiftLeft(int a[], int shiftSize) {
        for (int i = 0; i < shiftSize; i++){
            int b = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--){
               a[j] = a[j - 1];
            }
            a[0] = 2;
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