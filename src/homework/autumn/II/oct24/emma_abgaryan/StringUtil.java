package homework.autumn.II.oct24.emma_abgaryan;

public class StringUtil {
    public static void main(String[] args) {
        String names [] = StringUtil.split("Veni,Vidi,Vici", ',');

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }
        System.out.println(StringUtil.subString("Veni,Vidi,Vici",1,7));


        String str = "     Emma    Abgaryan      ";
        System.out.println(StringUtil.trim(str));


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

        int index = 0;
        int l = 0;
        String [] array = new String [3];
        for (int i = 0; i < inputText.length() ; i++) {
            if (inputText.charAt(i) == delimiter){
                array[l] = inputText.substring(index, i);
                index = i + 1;
                l++;
            } else if (i == inputText.length() - 1) {
                array[l] = inputText.substring(index,inputText.length());
            }
        }
        // TODO: implement the method
        return array;
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
    static public String subString(String inputText, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            String str = new String();

            for (int i = startIndex; i < endIndex; i++) {
                str += inputText.charAt(i);
            }
            return str;
        }
        return null;
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
        String str = inputText;
        int k = 0;
        int m = inputText.length() - 1;
        while (inputText.charAt(k) == ' ') {
            k++;
        }
        str = inputText.substring(k,inputText.length());

        while (inputText.charAt(m) == ' ') {
            m--;
        }
        str = str.substring(0,m - k + 1);

        return str;
    }

    /**
     * The same as parseInt method of Integer class
     * @param str the string to be converted to int
     * @return the conversion result
     */
    public static int parseInt(String str) {
        // TODO: implement the method
        return -1;
    }
}