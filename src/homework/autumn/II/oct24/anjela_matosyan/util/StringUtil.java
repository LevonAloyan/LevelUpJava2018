package homework.autumn.II.oct24.anjela_matosyan.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
    public static void main(String[] args) {
//        System.out.println(split("kuku-kuka-kuk-", "-"));

        System.out.println(trim(" k "));
        System.out.println(trim("   ku  "));
        System.out.println("!! " + trim("     ") + " !!");
//        System.out.println(subString("hello World", 2, 5));

    }

    public static List<String> split(String inputText, String delimiter) {
        {
            List<String> l = new ArrayList<>();
            int offset = 0;
            while (true) {
                int index = inputText.indexOf(delimiter, offset);
                if (index == -1) {
                    l.add(inputText.substring(offset));
                    return l;
                } else {
                    l.add(inputText.substring(offset, index));
                    offset = (index + delimiter.length());
                }
            }
        }
    }

    static public String subString(String inputText, int startIndex, int endIndex) {
        int length = inputText.length();
        int i = 0;
        StringBuilder builder = new StringBuilder();
//        char[] buffer = new char[endIndex - startIndex];
        for (i = 0; i < length; i++) {
            if (i >= startIndex && i < endIndex) {
                builder.append(inputText.charAt(i));
            }
        }
        return builder.toString();
    }

    public static String trim(String inputText) {
        String result;
        int end = inputText.length()-1;
        int startIndex = 0;

        while (startIndex < inputText.length() && inputText.charAt(startIndex) <= ' ') {
            startIndex++;

        }
        while (startIndex <= end && inputText.charAt(end ) <= ' ' ) {
            end--;
        }
        return subString(inputText, startIndex, end+1);
    }

    public static void parseInt(String str) {
    }
}