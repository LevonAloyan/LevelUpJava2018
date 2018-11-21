package homework16.IV_2.levon_aloyan.string_util;


import javax.swing.*;
import java.util.Arrays;

public class StringUtil {

    public static void main(String[] args) {
        //print(split(" hello my dear friend", ' '));
        // System.out.println(subString("hello",0,3));
        // System.out.println(trim("           hello  "));
        // System.out.println(parseInt("-256"));
//        System.out.println('z'-'0');
//        System.out.println(toLowerCase("HELLO"));
//        System.out.println(toUpperCase("Hello"));
//        System.out.println(startsWith("hEllOOO","HElo"));
        //  System.out.println(endsWith("world","hellowOrld"));
    }

    private static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param inputText the string to be splitted by the specified delimiter
     * @param delimiter the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     * around matches of the given regular expression.
     */
    public static String[] split(String inputText, char delimiter) {
        int startIndex = 0;
        int j = 0;
        inputText = trim(inputText);
        int txtLength = inputText.length();
        String array[] = new String[txtLength / 2];
        for (int i = 0; i < txtLength; i++) {
            if (inputText.charAt(i) == delimiter) {
                array[j++] = subString(inputText, startIndex, i);
                startIndex = ++i;
            }

        }
        array[j] = subString(inputText, startIndex, txtLength);
        String[] resut = new String[++j];
        System.arraycopy(array, 0, resut, 0, resut.length);

        return resut;
    }

    /**
     * Returns a new string that is a substring of the spcified inputText. The
     * substring begins at the specified <code>beginIndex and
     * extends to the character at index <code>endIndex - 1.
     * Thus the length of the substring is <code>endIndex-beginIndex.
     * Examples:
     * <blockquote><pre>
     * "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     * <p/>
     * @param      inputText    the string substring of wich must be returned
     * @param      startIndex   the beginning index, inclusive.
     * @param      endIndex     the ending index, exclusive.
     * @return the specified substring.
     * @exception IndexOutOfBoundsException  if the
     *             beginIndex is negative, or
     *             endIndex is larger than the length of
     *             this String object, or
     *             beginIndex is larger than
     *             endIndex.
     */
    static public String subString(String inputText, int startIndex, int endIndex) {
        char[] array = new char[inputText.length()];
        if (startIndex > endIndex) {
            throw new IllegalArgumentException();
        }
        if (startIndex < 0) {
            throw new StringIndexOutOfBoundsException();
        }
        if (endIndex > inputText.length()) {
            throw new StringIndexOutOfBoundsException();
        }
        if (startIndex == 0 && endIndex == inputText.length()) {
            return inputText;
        } else {
            for (int i = startIndex; i < endIndex; i++) {
                array[i] = inputText.charAt(i);
            }

        }


        return new String(array);
    }

    /**
     * Returns a copy of the specified str, with leading and trailing whitespace
     * omitted.
     *
     * @param str the String will be trimmed.
     * @return A copy of the string with leading and trailing white
     * space removed, or this string if it has no leading or
     * trailing white space.
     */
    public static String trim(String str) {
        int length = str.length();
        int leftIndex = 0;
        int rightIndex = length - 1;
        for (int i = 0; i < length / 2; i++) {
            while (str.charAt(leftIndex) == ' ') {
                leftIndex++;

            }
            while (str.charAt(rightIndex) == ' ') {
                rightIndex--;
            }

        }
        String result = subString(str, leftIndex, rightIndex + 1);

        return result;
    }

    /**
     * Parses the string argument as a signed decimal integer. The
     * characters in the string must all be decimal digits, except
     * that the first character may be an ASCII minus sign.
     *
     * @param s a String containing the int representation to be parsed
     * @return the integer value represented by the argument in decimal.
     * @throws NumberFormatException if the string does not contain a
     *                               parsable integer.
     */
    public static int parseInt(String s) {
        int i = 0;
        int number = 0;
        boolean negative = false;
        if (s.charAt(0) == '-') {
            negative = true;
            i = 1;
        }
        while (i < s.length()) {
            number *= 10;
            number += s.charAt(i++) - '0';
        }
        if (negative)
            number = -number;
        return number;
    }

    public static String toLowerCase(String text) {
        int length = text.length();
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) < 'a') {
                result[i] = (char) ((text.charAt(i) + 32));
            } else {
                result[i] = text.charAt(i);
            }


        }
        return new String(result);
    }

    public static String toUpperCase(String text) {
        int length = text.length();
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) > 'Z') {
                result[i] = (char) ((text.charAt(i) - 32));
            } else {
                result[i] = text.charAt(i);
            }


        }
        return new String(result);
    }

    private static String changeCase(String text, char startIndex, char endIndex) {
        char current;
        int length = text.length();
        char[] array = new char[length];

        for (int i = 0; i < length; i++) {
            current = text.charAt(i);
            if (current >= startIndex && current <= endIndex) {
                if (startIndex == 'a') {
                    array[i] = (char) (current - 32);
                } else {
                    array[i] = (char) (current + 32);
                }
            } else {
                array[i] = current;
            }
        }
        return new String(array);
    }

    /**
     * Tests if this string starts with the specified prefix.
     *
     * @param sourceText the String to check if it is ended with the specified prefix
     * @param prefix     the prefix.
     * @return true if the character sequence represented by the
     * argument is a prefix of the character sequence represented by
     * this string; false otherwise.
     * Note also that true will be returned if the
     * argument is an empty string or is equal to this
     * String object as determined by the
     * equals(Object) method
     */
    public static boolean startsWith(String sourceText, String prefix) {
        sourceText = toLowerCase(sourceText);
        prefix = toLowerCase(prefix);

        int textLength = sourceText.length();
        int prefixLength = prefix.length();


        for (int i = 0; i < prefixLength; i++) {
            if (sourceText.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;

    }

    /**
     * Tests if this string ends with the specified suffix.
     *
     * @param sourceText the String to check if it is started with the specified suffix.
     * @param suffix     the suffix.
     * @return true if the character sequence represented by the
     * argument is a suffix of the character sequence represented by
     * this object;  false otherwise. Note that the
     * result will be true if the argument is the
     * empty string or is equal to this String object
     * as determined by the equals(Object) method.
     */
    public static boolean endsWith(String suffix, String sourceText) {


        sourceText = toLowerCase(sourceText);
        suffix = toLowerCase(suffix);

        int sourceLength = sourceText.length();
        int suffixLength = suffix.length();
        if (sourceLength < suffixLength) {
            JOptionPane.showMessageDialog(null, "Please enter correct data");
        }
        int dif = sourceLength - suffixLength;
        for (int i = 0; i < suffixLength; i++) {

            if (sourceText.charAt(i + dif) != suffix.charAt(i)) {
                return false;
            }
        }
        return true;
    }


}
