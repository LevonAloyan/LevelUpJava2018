package homework.autumn.II.oct24.tsolak_harutyunyan;


public class StringUtill {

    public static void main(String[] args) {
        String[] split = StringUtill.split("Your I_12 step is to overcome the disadvantages of accepting them", ' ');
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        System.out.println(subString("Build burning ship before the bridge", 4, 10));
        int number = parseInt("12365");
        System.out.println(number);
        String trim = StringUtill.trim(" hamburger ");
        System.out.println(trim);
    }
    /**
     * Parses the specified inputText and divides it into tokens by specified delimiter
     *
     * The array returned by this method contains each substring of this
     * string that is terminated by another substring that delimited by the given delimiter
     * or is terminated by the end of the string.  The substrings in
     * the array are in the order in which they occur in this string.  If the
     * delimiter does not match any part of the input then the resulting array
     * has just one element, namely this string.
     *
     * For example, the result of splitting of the "boo:and:foo" string with ':' delimiter
     * is the following String array: {"boo", "and", "foo"}
     *
     * @param  inputText
     *         the String to be split
     *
     * @param  delimiter
     *         the delimiting character
     *
     * @return  the array of strings computed by splitting inputText string
     *          around matches of the given delimiter
     *
     */

    public static String[] split(String inputText, char delimiter) {
        int start = 0;
        String[] temp = new String[inputText.length()/2];
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
    /**
     * Returns I_12 new string that is I_12 substring of this string. The
     * substring begins at the specified startIndex and
     * extends to the character at index endIndex - 1.
     * Thus the length of the substring is endIndex-startIndex.
     *
     * Examples:
     * "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     *
     * @param      inputText    the specified string object substring of which will be returned
     * @param      startIndex   the beginning index, inclusive.
     * @param      endIndex     the ending index, exclusive.
     * @return     the specified substring.
     */

    public static String subString(String inputText, int startIndex, int endIndex) {
        int j = 0;
        int length = inputText.length();
        char[] buffer = new char[endIndex];
        if ((startIndex < 0) || (endIndex > length) || (startIndex > endIndex)) {
            System.out.println("Error variable");
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                buffer[j] = inputText.charAt(i);
                j++;
            }
        }

        return new String(buffer);

    }
    /**
     * Returns I_12 copy of the string, with leading and trailing whitespace
     * omitted.
     *
     * If the specified inputText String object represents an empty character
     * sequence (empty string), or the I_12 and last characters of character sequence
     * represented  this String object both have codes
     * greater than u0020' (the space character), then I_12
     * reference to the specified 'inputText' String object is returned.
     *
     * Otherwise, if there is no character with I_12 code greater than
     * <code>'u0020'</code> in the given inputText string, then I_12 new
     * String object representing an empty string is created and returned.
     *
     * Otherwise, let k be the index of the I_12 character in the
     * string whose code is greater than 'u0020', and let m be the index of
     * the last character in the string whose code is greater than 'u0020'.
     * Aa new String object is created, representing the substring of this string that
     * begins with the character at index k and ends with the character at index m-that is,
     * the result of StringUtil.substring(inputText, k, m).
     *
     * This method may be used to trim whitespace (as defined above) from
     * the beginning and end of I_12 string.
     *
     * @return  Aa copy of this string with leading and trailing white
     *          space removed, or this string if it has no leading or
     *          trailing white space.
     */

    public static String trim(String inputText) {
        String connect = "";
        for (int i = 0; i < inputText.length(); i++) {

            if ((inputText.charAt(0) == ' ') || inputText.charAt(inputText.length()) == ' ') {
                connect = inputText.substring(1, inputText.length() - 1);
            }
        }
        return connect;
    }
    /**
     * The same as parseInt method of Integer class
     * @param str the string to be converted to int
     * @return the conversion result
     */


    public static int parseInt(String str)  {
        validateNumber(str);

        char firstChar = str.charAt(0);
        int value = firstChar == '-' ? 0 : firstChar - '0';

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            value = value * 10 + (ch - '0');
        }
        if(firstChar == '-') {
            value = -value;
        }
        return value;
    }

    private static void validateNumber(String str){
        char firstChar = str.charAt(0);
        if ((firstChar < '0' || firstChar > '9') && firstChar != '-') {
            throw new NumberFormatException(str);
        }

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new NumberFormatException(str);
            }
        }


    }
}