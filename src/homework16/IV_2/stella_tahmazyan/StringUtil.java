package homework16.IV_2.stella_tahmazyan;


import java.security.InvalidParameterException;
import java.util.Arrays;

public class StringUtil {
    public static void main(String[] args) {
      System.out.println(subString("Armenia", 1, 4));
      for (String s : split("it is ver good",' '))
      System.out.print(s);
      System.out.println(trim(" barev dzez "));
      System.out.println(toLowerCase("GvaTeMaLa"));
      System.out.println(toUpperCase("GvaTeMaLa"));
      String s = "                helo       ";
      int a = parseInt("12358");
      System.out.println(a);
      System.out.println( startWith("Start","Sta"));
      System.out.println(endWidth("Start", "rt"));
        System.out.println(contain("Start","ar"));

    }

   
    public static String[] split(String inputText, char delimiter) {
        int startIndex = 0;
        int j = 0;
        String[] arr = new String[inputText.length() / 2];
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                if (inputText.charAt(i + 1) != delimiter) {
                    arr[j] = subString(inputText, startIndex, i);
                    startIndex = i + 1;
                    j++;
                }
            }
        }
        arr[j++] = subString(inputText, startIndex, inputText.length());
        String[] result = new String[j];
        System.arraycopy(arr, 0, result, 0, j);
        return result;
    }

    static public String subString(String inputText, int startIndex, int endIndex) {
        char[] arr = new char[endIndex];
        if (startIndex > endIndex) {
            throw new InvalidParameterException("start index must be smaller than end index");
        } else if (startIndex < 0 || endIndex > inputText.length()) {
            throw new StringIndexOutOfBoundsException();
        } else {
            int diff = endIndex - startIndex;
            for (int i = 0; i < diff; i++) {
                arr[i] = inputText.charAt(startIndex + i);
            }
        }
        String str = new String(arr);
        return str;
    }

  
    public static String trim(String str) {
        //TODO: implement
        int startIndex = 0;
        int endIndex = str.length() - 1;

        for (int i = startIndex; i <= str.length() - 1; i++) {
            if (str.charAt(startIndex) <= ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int i = endIndex; i > 0; i--) {
            if (str.charAt(i) <= ' ') {
                endIndex--;
            } else {
                break;
            }

        }
        str = subString(str, startIndex, endIndex + 1);
        return str;
    }


   
    public static int parseInt(String s) {
        int length = s.length();
        int result = 0;
        boolean startWith0 = true;
        int n = 1;
        int curr;
        for (int i = 0; i < length; i++) {
            curr = s.charAt(i);
            if (curr >= '0' && curr <= '9') {
                if (startWith0 && (curr == '0')) {
                    System.out.println("in if");
                } else {
                    result += (curr - 48);
                    result *= 10;
                    startWith0 = false;
                }
            } else {
                throw new NumberFormatException();
            }
        }
        return result / 10;
    }

    public static String toLowerCase(String text) {
        // TODO implement
        return changeCase(text, 'A', 'Z');
    }

    public static String toUpperCase(String text) {
        // TODO implement
        return changeCase(text, 'a', 'z');
    }

    private static String changeCase(String text, char startIndex, char endIndex) {
        // TODO implement
        char curr;
        int length = text.length();
        char[] arr = new char[length];
        String result;
        for (int i = 0; i < length; i++) {
            curr = text.charAt(i);
            if (curr >= startIndex && curr <= endIndex) {
                if (startIndex == 'a') {
                    arr[i] = (char) (curr - 32);
                } else {
                    arr[i] = (char) (curr + 32);
                }
            } else {
                arr[i] = curr;
            }
        }
        return new String(arr);
    }

    public static boolean startWith(String text, String startText) {
        int length = startText.length();
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != startText.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean endWidth(String text, String endText) {
        int length = endText.length();
        int diff = text.length() - endText.length();
        for (int i = 0; i < length; i++) {
            if (text.charAt(diff + i) != endText.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean contain(String text,String containText){
        int length = text.length();
        int containLength = containText.length();
        for (int i = 0; i < length; i++) {
            int n = 0;
            if (text.charAt(i) == containText.charAt(0)){
                for (int j = 0; j < containLength; j++) {
                    if (text.charAt(i + j) == containText.charAt(j)){
                        n++;
                    }
                }
                if (n == containLength){
                    return true;
                }else {
                    n = 0;
                }
            }
        }
        return false;
    }
}