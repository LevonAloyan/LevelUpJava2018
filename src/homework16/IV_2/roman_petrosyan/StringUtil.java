package homework16.IV_2.roman_petrosyan;


public class StringUtil {

    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param inputText the string to be splitted by the specified delimiter
     * @param delimiter the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     * around matches of the given regular expression.
     */
    public static String[] split(String inputText, char delimiter) {
        String[] array = new String[inputText.length() / 2];
        int startIndex = 0;
        int j = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                array[j++] = subString(inputText, startIndex, i);
                startIndex = ++i;
            }

        }
        array[j] = subString(inputText, startIndex, inputText.length());
        String[] result = new String[++j];
        System.arraycopy(array, 0, result, 0, result.length);
        return result;
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
     *
     * @param inputText  the string substring of wich must be returned
     * @param startIndex the beginning index, inclusive.
     * @param endIndex   the ending index, exclusive.
     * @return the specified substring.
     * @throws IndexOutOfBoundsException if the
     *                                   beginIndex is negative, or
     *                                   endIndex is larger than the length of
     *                                   this String object, or
     *                                   beginIndex is larger than
     *                                   endIndex.
     */
    static public String subString(String inputText, int startIndex, int endIndex) {
        int diff = endIndex - startIndex;
        char[] array = new char[diff];
        int j = 0;
        if (endIndex < startIndex) throw new IllegalArgumentException();
        if (startIndex <= -1) throw new StringIndexOutOfBoundsException();
        if (endIndex <= -1) throw new StringIndexOutOfBoundsException();
        if (startIndex == 0 && endIndex == inputText.length()) return inputText;
        for (int i = startIndex; i < endIndex; i++) {
            array[j++] = inputText.charAt(i);
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
        int right = str.length() - 1;
        int left = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(left) == ' ') {
                left++;
            }

            if (str.charAt(right) == ' ') {
                right--;
            }


        }
        str = subString(str, left, right + 1);
        return str;
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
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            i = 1;
            isNegative = true;
        }

        while (i < s.length()) {
            number = number * 10;
            number = number + s.charAt(i++) - '0';
        }

        if (isNegative) {
            number = -number;

        }

        return number;
    }

    public static String toLowerCase(String text) { //TODO
        char[] array = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < 'a' && text.charAt(i) > 'A') {
                array[i] = (char) (text.charAt(i) + 32);
            }else {
                array[i]=text.charAt(i);
            }

        }

        return new String(array);
    }

    public static String toUpperCase(String text) {

        char[] array = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 'Z') {
                array[i] = (char) (text.charAt(i) - 32);
            }else {
               array[i]= text.charAt(i);
            }

        }

        return new String(array);
    }

    private static String changeCase(String text, char startOfRange, char endOfRange) {
        // TODO implement
        return null;
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
    public boolean startsWith(String sourceText, String prefix) {

        return false;
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
    public boolean endsWith(String sourceText, String suffix) {
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(subString("abcdef", 1, 2));
//       print(split("jhgf jhgjh jhfj hjfjh", ' '));
//        System.out.println(trim("   sdfvdfvs               "));
//        System.out.println(parseInt("123"));
//        System.out.println(toLowerCase("GFDJHFKLadsdasfJGJHFjhf"));
        System.out.println(toUpperCase("hekoMYfjru"));
    }

    private static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }


}