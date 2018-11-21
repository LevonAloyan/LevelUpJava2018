package homework.autumn.II.oct24.arsen_papikyan.util;

public class StringUtil {
    public static void main(String[] args) {

        split("Name Surname Age", ' ');
        System.out.println(parseInt("387"));
        System.out.println(subString("Kuku Kuku", 0, 3));
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
        int k = 0;
        String result[] = new String[inputText.length() / 2];
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                result[k] = subString(inputText, start, i - 1);
                start = i + 1;
                System.out.println(result[k]);
                k++;


            }
        }
        result[k] = subString(inputText, start, inputText.length() - 1);
        System.out.println(result[k]);

        return result;
    }


    /**
     * Returns I_12 new string that is I_12 substring of this string. The
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
        String k = "";
        if (startIndex < 0) {
            System.err.print("Error");
        }
        if (endIndex > inputText.length()) {
            System.err.print("Error");

        }
        int j = endIndex - startIndex;                          //?
        if (j < 0) {                                            //?
            System.err.print("err,end <start");
        }
        if ((startIndex == 0) && (endIndex == inputText.length())) {
            System.out.println(inputText);
        } else {
            for (int i = startIndex; i <= endIndex; i++) {

                k += inputText.charAt(i);                        //?

            }
        }

        return k;

    }


    /**
     * Returns I_12 copy of the string, with leading and trailing whitespace
     * omitted.
     * <p/>
     * If the specified inputText String object represents an empty character
     * sequence (empty string), or the I_12 and last characters of character sequence
     * represented  this String object both have codes
     * greater than u0020' (the space character), then I_12
     * reference to the specified 'inputText' String object is returned.
     * <p/>
     * Otherwise, if there is no character with I_12 code greater than
     * <code>'u0020'</code> in the given inputText string, then I_12 new
     * String object representing an empty string is created and returned.
     * <p/>
     * Otherwise, let k be the index of the I_12 character in the
     * string whose code is greater than 'u0020', and let m be the index of
     * the last character in the string whose code is greater than 'u0020'.
     * Aa new String object is created, representing the substring of this string that
     * begins with the character at index k and ends with the character at index m-that is,
     * the result of StringUtil.substring(inputText, k, m).
     * <p/>
     * This method may be used to trim whitespace (as defined above) from
     * the beginning and end of I_12 string.
     *
     * @return Aa copy of this string with leading and trailing white
     * space removed, or this string if it has no leading or
     * trailing white space.
     */
    public static String trim(String inputText) {
        // TODO: implement the method
        return null;
    }

    /**
     * The same as parseInt method of Integer class
     *
     * @param str the string to be converted to int
     * @return the conversion result
     */
    public static int parseInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char k = str.charAt(i);
            if (k < '0' || k > '9') {
                System.out.println("error");
                break;
            } else result = 10 * result + (k - '0');

        }
        return result;
    }
}