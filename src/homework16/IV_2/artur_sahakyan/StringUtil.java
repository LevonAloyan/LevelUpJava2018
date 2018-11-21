package homework16.IV_2.artur_sahakyan;


import java.security.InvalidParameterException;

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

        int start = 0;
        int a = 0;
        String[] array = new String[inputText.length() / 2];
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i + 1) == delimiter) {
                if (inputText.charAt(i + 1) != delimiter) {
                    array[a] = subString(inputText, start, i);
                    start = i + 1;
                    a++;
                }
            }
        }
        array[a++] = subString(inputText, start, inputText.length());
        String[] temp = new String[a];
        System.arraycopy(array, 0, temp, 0, a);

        //TODO implement
        return temp;
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
     * @param beginIndex the beginning index, inclusive.
     * @param endIndex   the ending index, exclusive.
     * @return the specified substring.
     * @throws IndexOutOfBoundsException if the
     *                                   beginIndex is negative, or
     *                                   endIndex is larger than the length of
     *                                   this String object, or
     *                                   beginIndex is larger than
     *                                   endIndex.
     */
    static public String subString(String inputText, int beginIndex, int endIndex) {

        char[] array = new char[endIndex];
        if (beginIndex > endIndex) {
            throw new InvalidParameterException("start index must be smaller than end index");
        } else if (beginIndex < 0 || endIndex > inputText.length()) {
            throw new StringIndexOutOfBoundsException();
        } else {
            int temp = endIndex - beginIndex;
            for (int i = 0; i < temp; i++) {
                array[i] = inputText.charAt(beginIndex + i);

            }
        }
        String str = new String(array);
        //TODO implement
        return str;
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

        int startIndex = 0;
        int endIndex = str.length() - 1;

        for (int i = startIndex; i <= str.length() - 1; i++) {
            if (str.charAt(startIndex) <= ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int i = endIndex; i > 0; i--) {
            if (str.charAt(i) <= ' ') {
                endIndex--;
            } else {
                break;
            }

        }
        str = subString(str, startIndex, endIndex + 1);
        //TODO: implement
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
        int length = s.length();
        int result = 0;
        boolean startWith = true;
        int a = 1;
        int curr;
        for (int i = 0; i < length; i++) {
            curr = s.charAt(i);
            if (curr >= '0' && curr <= '9') {
                if (startWith && (curr == '0')) {
                    System.out.println("in if");
                } else {
                    result += (curr - 48);
                    result *= 10;
                    startWith = false;
                }
            } else {
                throw new NumberFormatException();
            }
        }


        return result / 10;

        // TODO implement the method
    }

    public static String toLowerCase(String text) {
        return changeCase(text, 'A', 'Z');
        // TODO implement
    }

    public static String toUpperCase(String text) {
        // TODO implement
        return changeCase(text, 'a', 'z');
    }

    private static String changeCase(String text, char startOfRange, char endOfRange) {

        char curr;
        int length = text.length();
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            curr = text.charAt(i);
            if (curr >= startOfRange && curr <= endOfRange) {
                if (startOfRange == 'a') {
                    array[i] = (char) (curr - 32);
                } else {
                    array[i] = (char) (curr + 32);
                }
            } else {
                array[i] = curr;
            }

        }
        // TODO implement
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
        int length = prefix.length();
        for (int i = 0; i < length; i++) {
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
    public static boolean endsWith(String sourceText, String suffix) {

        int length = suffix.length();
        int temp = sourceText.length() - suffix.length();
        for (int i = 0; i < length; i++) {
            if (sourceText.charAt(temp + i) != suffix.charAt(i)) {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(subString("Barcelona", 2,5));

        System.out.println(trim("Barcelona vs Real Madrid"));

        System.out.println(toLowerCase("BARCELONA"));

        System.out.println(toUpperCase("barcelona"));


        String s = "  Barcelona      vs RealMadrid            ";
        System.out.println(trim(s) + s.length());


        int a = parseInt("1992");
        System.out.println(a);

        System.out.println(startsWith("Barcelona", "Barc"));

        System.out.println(endsWith("Barcelona", "ona"));


    }

}