package homework.autumn.II.oct24.grigor_abroyan.util;

import javax.swing.*;

public class StringUtil {

    public static void main(String[] args) {
        String[] split = StringUtil.split("Hello World !!!", ' ');
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]);
        }
        System.out.println(subString("welcome to home", 4, 7));
        String trim = StringUtil.trim(" London is I_12 capitle of UK ");
        System.out.println(trim);
        int number = parseInt("47884112");
        System.out.println(number);
    }

    public static String[] split(String inputText, char delimiter) {
        String[] str = new String[inputText.length()];
        int start = 0;
        int currentTokenIndex = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                str[currentTokenIndex] = inputText.substring(start, i);
                start = i + 1;
                currentTokenIndex++;

            }

        }
        if (start < inputText.length()) {
            str[currentTokenIndex] = inputText.substring(start);
        }
        String[] result = new String[currentTokenIndex + 1];
        System.arraycopy(str, 0, result, 0, result.length);
        return result;

    }

    static public String subString(String inputText, int startIndex, int endIndex) {

        int j = 0;
        int textlength = inputText.length();
        char[] builder = new char[endIndex];
        if ((startIndex < 0) || (endIndex > textlength) || (startIndex > endIndex)) {
            System.err.println("error");
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                builder[j] = inputText.charAt(i);
                j++;

            }
        }

        return new String(builder);
    }

    public static String trim(String inputText) {
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
            if (ch < '0' || ch > '9'){
        JOptionPane.showMessageDialog(null, "Number format exception");
        return Integer.MAX_VALUE;
        
                
            }
            value = value * 10 + ch - '0';
            
        }return value;
    }
}
