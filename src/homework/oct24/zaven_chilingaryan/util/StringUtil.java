package homework.oct24.zaven_chilingaryan.util;

import org.omg.CORBA.StringHolder;

import javax.swing.*;

public class StringUtil {
    public static void main(String[] args) {
        String[] split = StringUtil.split("han:jka:kaj", ':');
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        int number = parseInt("12354");
        System.out.println(number);

        String trim = StringUtil.trim(" dsfs  sfgdfg ");
        System.out.print(trim);

        System.out.println();
        System.out.println(subString("Zavencvxjchvzdf", 1, 8));
    }


    public static String[] split(String inputText, char delimiter) {
        int start = 0;
        String[] temp = new String[inputText.length()];
        int currentTokenIndex = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                temp[currentTokenIndex] = inputText.substring(start, i);
                start = i + 1;
                currentTokenIndex++;
            }
        }
        if (start < inputText.length()) {
            temp[currentTokenIndex] = inputText.substring(start);
        }
        String[] result = new String[currentTokenIndex + 1];
        System.arraycopy(temp, 0, result, 0, result.length);
        return result;
    }


    public static String subString(String inputText, int startIndex, int endIndex) {
        int j = 0;
        int length = inputText.length();
        char[] buffer = new char[endIndex];
        if ((startIndex < 0) || (endIndex > length) || (startIndex > endIndex)) {
            System.out.println("error");
        } else {
            for (int i = startIndex; i < endIndex - 1; i++) {
                buffer[j] = inputText.charAt(i);
                j++;
            }
        }
        return new String(buffer);
    }


    public static String trim(String inputText) {
        int j = 0;
        String temp = null;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(0) == ' ' || inputText.charAt(inputText.length()) == ' ') {
                temp = inputText.substring(1, inputText.length() - 1);
            }
        }
        return temp;
    }


    public static int parseInt(String str) {

        int i = 0;
        int value = 0;

        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                JOptionPane.showMessageDialog(null, " Number  format exception");
                return Integer.MAX_VALUE;
            }
            value = value * 10 + ch - '0';


        }

        return value;
    }
}