package homework.oct24.gasparyan_meruzhan.util;

public class StringUtil {
    public static void main(String[] args) {
        split("error:no error",':');
        System.out.println((subString("Error",2,5)));
        System.out.println(trim(" error no error "));
        System.out.println(parseInt("1598"));

    }

    /**
     * Parses the specified inputText and divides it into tokens by specified delimiter
     * <p>
     * The array returned by this method contains each substring of this
     * string that is terminated by another substring that delimited by the given delimiter
     * or is terminated by the end of the string.  The substrings in
     * the array are in the order in which they occur in this string.  If the
     * delimiter does not match any part of the input then the resulting array
     * has just one element, namely this string.
     * <p>
     * For example, the result of splitting of the "boo:and:foo" string with ':' delimiter
     * is the following String array: {"boo", "and", "foo"}
     *
     * @param inputText the String to be split
     * @param delimiter the delimiting character
     * @return the array of strings computed by splitting inputText string
     * around matches of the given delimiter
     */

    public static String[] split(String inputText, char delimiter) {
        String a = "";
        String array[] = new String[inputText.length()];
        int b = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                array[b] = a;
                b++;
                a = "";
            } else {
                a += inputText.charAt(i);
            }
        }
        if (a != "") {
            array[b] = a;
        }
        return array;
    }


    /**
     * Returns a new string that is a substring of this string. The
     * substring begins at the specified startIndex and
     * extends to the character at index endIndex - 1.
     * Thus the length of the substring is endIndex-startIndex.
     * <p>
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
        String a = "";
        for (int i = startIndex; i < endIndex; i++) {
            a += inputText.charAt(i);
        }
        return a;
    }


    /**
     * Returns a copy of the string, with leading and trailing whitespace
     * omitted.
     * <p>
     * If the specified inputText String object represents an empty character
     * sequence (empty string), or the first and last characters of character sequence
     * represented  this String object both have codes
     * greater than u0020' (the space character), then a
     * reference to the specified 'inputText' String object is returned.
     * <p>
     * Otherwise, if there is no character with a code greater than
     * <code>'u0020'</code> in the given inputText string, then a new
     * String object representing an empty string is created and returned.
     * <p>
     * Otherwise, let k be the index of the first character in the
     * string whose code is greater than 'u0020', and let m be the index of
     * the last character in the string whose code is greater than 'u0020'.
     * A new String object is created, representing the substring of this string that
     * begins with the character at index k and ends with the character at index m-that is,
     * the result of StringUtil.substring(inputText, k, m).
     * <p>
     * This method may be used to trim whitespace (as defined above) from
     * the beginning and end of a string.
     *
     * @return A copy of this string with leading and trailing white
     * space removed, or this string if it has no leading or
     * trailing white space.
     */
    public static String trim(String inputText) {
        String a = "";
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) > '\u0020') {
                a += inputText.charAt(i);
            }
        }
        return a;
    }

    /**
     * The same as parseInt method of Integer class
     *
     * @param str the string to be converted to int
     * @return the conversion result
     */
    public static int parseInt(String str) {

        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                switch (str.charAt(i)) {
                    case '0':
                        b = 0;
                        break;
                    case '1':
                        b = 1;
                        break;
                    case '2':
                        b = 2;
                        break;
                    case '3':
                        b = 3;
                        break;
                    case '4':
                        b = 4;
                        break;
                    case '5':
                        b = 5;
                        break;
                    case '6':
                        b = 6;
                        break;
                    case '7':
                        b = 7;
                        break;
                    case '8':
                        b = 8;
                        break;
                    case '9':
                        b = 9;
                        break;
                }
                a = a * 10;
                a += b;
            }
        }
        if (str.charAt(0) == '-') {
            a = -a;
        }
        return a;
    }
}