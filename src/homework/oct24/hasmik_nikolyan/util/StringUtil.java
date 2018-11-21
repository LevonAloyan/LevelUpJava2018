package homework.oct24.hasmik_nikolyan.util;

import java.util.Arrays;

public class StringUtil {
    public static void main(String[] args) {
//        System.out.println("1. Result of string split method ");
//        String[] splitResult = split("red-green-blue-black-white", '-');
//        for (int i = 0; i < splitResult.length; i++) {
//            System.out.println(splitResult[i]);
//        }
//        System.out.println("2. Result of subString method ");
//        System.out.println(subString("Hello world", 0, 5));
//        trim(" Hello world  ");
        System.out.println("4. Result of parseInt method ");
        System.out.println(parseInt("786"));
//        System.out.println(trim(" Hello world "));
    }

    /**
     * Parses the specified inputText and divides it into tokens by specified delimiter
     * <p/>
     * The array returned by this method contains each substring of this
     * string that is terminated by another substring that delimited by the given delimiter
     * or is terminated by the end of the string.  The substrings in
     * the array are in the order in which they occur in this string.  If the
     * delimiter does not match any part of the input then the resulting array
     * has just one element, namely this string.
     * <p/>
     * For example, the result of splitting of the "boo:and:foo" string with ':' delimiter
     * is the following String array: {"boo", "and", "foo"}
     *
     * @param inputText the String to be split
     * @param delimiter the delimiting character
     * @return the array of strings computed by splitting inputText string
     * around matches of the given delimiter
     */

    public static String[] split(String inputText, char delimiter) {
        int start = 0;
        int lastIndex = 0;
        String[] temp = new String[inputText.length() / 2];
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                temp[lastIndex] = subString(inputText, start, i );
                start = i + 1;
                lastIndex++;
            }
        }
        if (start < inputText.length()) {
            temp[lastIndex] = subString(inputText, start, inputText.length());
        }
        String[] result = new String[lastIndex + 1];
        System.arraycopy(temp, 0, result, 0, result.length);

        return result;
    }


    /**
     * Returns a new string that is a substring of this string. The
     * substring begins at the specified startIndex and
     * extends to the character at index endIndex - 1.
     * Thus the length of the substring is endIndex-startIndex.
     * <p/>
     * Examples:
     * "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     *
     * @param inputText  the specified string object substring of which will be returned
     * @param startIndex the beginning index, inclusive.
     * @param endIndex   the ending index, exclusive.
     * @return the specified substring.
     */
    static public String subString(String inputText, int startIndex, int endIndex) {
        String result = "";
        int diff = endIndex - startIndex;
        if (startIndex < 0) {
            System.err.print("Error: the start number can not be a negative one");
            return null;
        }
        if (endIndex > inputText.length()) {
            System.err.print("Error: the end number can not be bigger than the length of the string");
            return null;
        }
        if (diff < 0) {
            System.err.print("Error: the end number can not be bigger than the start number");
            return null;

        }
        if ((startIndex == 0) && (endIndex == inputText.length())) {
            return inputText;
        }
        char [] buffer = new char[diff];
        for (int i = startIndex; i < endIndex; i++) {
            buffer[i-startIndex]= inputText.charAt(i);
        }

        return new String(buffer);
    }


    /**
     * Returns a copy of the string, with leading and trailing whitespace
     * omitted.
     * <p/>
     * If the specified inputText String object represents an empty character
     * sequence (empty string), or the first and last characters of character sequence
     * represented  this String object both have codes
     * greater than u0020' (the space character), then a
     * reference to the specified 'inputText' String object is returned.
     * <p/>
     * Otherwise, if there is no character with a code greater than
     * <code>'u0020'</code> in the given inputText string, then a new
     * String object representing an empty string is created and returned.
     * <p/>
     * Otherwise, let k be the index of the first character in the
     * string whose code is greater than 'u0020', and let m be the index of
     * the last character in the string whose code is greater than 'u0020'.
     * A new String object is created, representing the substring of this string that
     * begins with the character at index k and ends with the character at index m-that is,
     * the result of StringUtil.substring(inputText, k, m).
     * <p/>
     * This method may be used to trim whitespace (as defined above) from
     * the beginning and end of a string.
     *
     * @return A copy of this string with leading and trailing white
     * space removed, or this string if it has no leading or
     * trailing white space.
     */
    public static String trim(String inputText) {
        String[] split_result = new String[inputText.length() / 2];
        String result = "";
        return result;
    }

    /**
     * The same as parseInt method of Integer class
     *
     * @param str the string to be converted to int
     * @return the conversion result
     */
    public static int parseInt(String str) {

        int result = 0;
        for(int i=0; i< str.length(); i++){
            char strChar = str.charAt(i);
            result = result * 10 +(strChar - '0');
        }
        return result;
    }
}