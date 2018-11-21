package homework16.IV_2.andranik_khachatryan;


import java.security.InvalidParameterException;
import java.util.Arrays;

public class StringUtil {
    public static void main(String[] args) {
       System.out.println(subString("Word", 1, 3));
        System.out.println(contain("String","buffer"));

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
        String[] arr = new String[inputText.length() / 2];
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                if (inputText.charAt(i + 1) != delimiter) {
                    arr[j] = subString(inputText, startIndex, i);
                    startIndex = i + 1;
                    j++;
                }
            }
        }
        arr[j++] = subString(inputText, startIndex, inputText.length());
        String[] result = new String[j];
        System.arraycopy(arr, 0, result, 0, j);
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
     * @param inputText the string substring of wich must be returned
     * @param
     * @throws IndexOutOfBoundsException if the
     *                                   beginIndex is negative, or
     *                                   endIndex is larger than the length of
     *                                   this String object, or
     *                                   beginIndex is larger than
     *                                   endIndex.
     * @para @return     the specified substring.
     */
    static public String subString(String inputText, int startIndex, int endIndex) {

        char[] arr = new char[endIndex];
        if (startIndex > endIndex) {
            throw new InvalidParameterException("start index must be smaller than end index");
        } else if (startIndex < 0 || endIndex > inputText.length()) {
            throw new StringIndexOutOfBoundsException();
        } else {
            int diff = endIndex - startIndex;
            for (int i = 0; i < diff; i++) {
                arr[i] = inputText.charAt(startIndex + i);
            }
        }
        String str = new String(arr);
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
    public static int parseInt(String s) {//TODO
        int length = s.length();
        int result = 0;
        boolean startWith0 = true;
        int n = 1;
        int curr;
        for (int i = 0; i < length; i++) {
            curr = s.charAt(i);
            if (curr >= '0' && curr <= '9') {
                if (startWith0 && (curr == '0')) {
                    System.out.println("in if");
                } else {
                    result += (curr - 48);
                    result *= 10;
                    startWith0 = false;
                }
            } else {
                throw new NumberFormatException();
            }
        }
        return result / 10;
    }

    public static String toLowerCase(String text) {
        return changeCase(text, 'A', 'Z');
    }

    public static String toUpperCase(String text) {
        // TODO implement
        return changeCase(text, 'a', 'z');
    }

    private static String changeCase(String text, char startOfRange, char endOfRange) {
        char curr;
        int length = text.length();
        char[] arr = new char[length];
        String result;
        for (int i = 0; i < length; i++) {
            curr = text.charAt(i);
            arr[i] = curr >= startOfRange && curr <= endOfRange? (char) (curr ^ 32) : curr;

        }
        return new String(arr);
    }

    public static boolean startWith(String text, String prefix) {
        int length = prefix.length();
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean endsWidth(String text, String endText) {

        int length = endText.length();
        int diff = text.length() - endText.length();
        for (int i = 0; i < length; i++) {
            if (text.charAt(diff + i) != endText.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean contain(String text,String containText){
        int length = text.length();
        int containLength = containText.length();
        for (int i = 0; i < length; i++) {
            int n = 0;
            if (text.charAt(i) == containText.charAt(0)){
                for (int j = 0; j < containLength; j++) {
                    if (text.charAt(i + j) == containText.charAt(j)){
                        n++;
                    }
                }
                if (n == containLength){
                    return true;
                }else {
                    n = 0;
                }
            }
        }
        return false;
    }
}

class Draft {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'z'; i++) {
            System.out.println("" + i + " : " + (int)i);
        }
    }
}