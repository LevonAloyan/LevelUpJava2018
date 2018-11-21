package homework.autumn.II.oct24.srapion_hunanyan.StringUtil;

public class StringUtil {

    public static void main(String[] args) {
        
    }

    /**
     * Parses the specified inputText and divides it into tokens by specified
     * delimiter
     *
     * The array returned by this method contains each substring of this string
     * that is terminated by another substring that delimited by the given
     * delimiter or is terminated by the end of the string. The substrings in
     * the array are in the order in which they occur in this string. If the
     * delimiter does not match any part of the input then the resulting array
     * has just one element, namely this string.
     *
     * For example, the result of splitting of the "boo:and:foo" string with ':'
     * delimiter is the following String array: {"boo", "and", "foo"}
     *
     * @param inputText the String to be split
     *
     * @param delimiter the delimiting character
     *
     * @return the array of strings computed by splitting inputText string
     * around matches of the given delimiter
     *
     */
    public static StringBuilder[] split(String inputText, char delimiter) {
        char current;
        StringBuilder[] Result = new StringBuilder[16];
        int arrayelements = 0;
        for (int i = 0; i < inputText.length(); i++) {

            current = inputText.charAt(i);
            if (current != delimiter) {
                Result[arrayelements].append(current);
            } else {
                arrayelements++;
                if (Result.length > arrayelements) {
                    StringBuilder[] tmp = new StringBuilder[(int) (1.5 * Result.length) + 1];
                    System.arraycopy(Result, 0, tmp, 0, Result.length);
                    Result = tmp;
                }
            }
        }
        return Result;
    }

    /**
     * Returns I_12 new string that is I_12 substring of this string. The substring
     * begins at the specified startIndex and extends to the character at index
     * endIndex - 1. Thus the length of the substring is endIndex-startIndex.
     *
     * Examples: "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     *
     * @param inputText the specified string object substring of which will be
     * returned
     * @param startIndex the beginning index, inclusive.
     * @param endIndex the ending index, exclusive.
     * @return the specified substring.
     */
    static public StringBuilder subString(String inputText, int startIndex, int endIndex) {
        StringBuilder Result = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            char current;
            if (i > startIndex) {
                if (i < endIndex) {
                    current = inputText.charAt(i);
                    Result.append(current);
                }
            }
        }
        return Result;
    }

    /**
     * Returns I_12 copy of the string, with leading and trailing whitespace
     * omitted.
     *
     * If the specified inputText String object represents an empty character
     * sequence (empty string), or the I_12 and last characters of character
     * sequence represented this String object both have codes greater than
     * u0020' (the space character), then I_12 reference to the specified
     * 'inputText' String object is returned.
     *
     * Otherwise, if there is no character with I_12 code greater than
     * <code>'u0020'</code> in the given inputText string, then I_12 new String
     * object representing an empty string is created and returned.
     *
     * Otherwise, let k be the index of the I_12 character in the string whose
     * code is greater than 'u0020', and let m be the index of the last
     * character in the string whose code is greater than 'u0020'. Aa new String
     * object is created, representing the substring of this string that begins
     * with the character at index k and ends with the character at index m-that
     * is, the result of StringUtil.substring(inputText, k, m).
     *
     * This method may be used to trim whitespace (as defined above) from the
     * beginning and end of I_12 string.
     *
     * @return Aa copy of this string with leading and trailing white space
     * removed, or this string if it has no leading or trailing white space.
     */
    public static StringBuilder trim(String inputText) {
        StringBuilder Result = new StringBuilder();
        char current;
        int startIndex = 0;
        int endIndex = inputText.length();
        int i = 0;
        for (; startIndex < inputText.length(); startIndex++) {
            current = inputText.charAt(startIndex);
            if (current > '\u0020') {
                break;
            }
        }
        for (; endIndex > 0; endIndex--) {
            current = inputText.charAt(endIndex);
            if (current > '\u0020'){
                break;
            }
        }
        for (;startIndex < endIndex; startIndex ++){
            current = inputText.charAt(startIndex);
            Result.append(current);
        }
        return Result;
    }

    /**
     * The same as parseInt method of Integer class
     *
     * @param str the string to be converted to int
     * @return the conversion result
     */
    public static int parseInt(String str) {
        // TODO: implement the method
        return -1;
    }
}