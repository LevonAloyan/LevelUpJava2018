package auditorium.taskstodo;

import auditorium.taskstodo.task_III.StringUtil;

public class ArrayShiftingTask {
    public static void main(String[] args) {

        System.out.println(trim("   hello   "));
    }

    public static void shiftLeft(int a[], int shiftSize) {

    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static String trim (String text){
        int i =0;
        int j =text.length()-1;
        while (text.charAt(i) == ' ' ){
            i++;
        }while ( text.charAt(j) == ' '){
            j--;
        }
        return text.substring(i,j+1);
    }


}

// auditorium.taskstodo.ArrayShiftingTask - public static void shiftLeft(int a[], int shiftSize)

// auditorium.taskstodo.TextAnalyzer.findLongestPalindrome(String text)