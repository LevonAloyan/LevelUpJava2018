package homework.oct24.ruben_sharyan;

public class StringUtil {

    public static void main(String[] args) {

        print(split("java:c++:c#", ':'));
       
        System.out.println(subString("Armenia", 0, 4));
        System.out.println(trim("hello world java"));
        System.out.println(parseInt("2015"));
    }

    public static void print(String str[]) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]
            );
        }
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
    public static String[] split(String inputText, char delimiter) {
        int st = 0;
        String str = "";
        String[] array = new String[inputText.length()];

        for (int i = 0; i < inputText.length(); i++) {

            if (inputText.charAt(i) == delimiter) {
                array[st] = str;

            } else {
                str += inputText.charAt(i);
            }
            if (str != "") {
                array[st] = str;
            }
        }

        return array;

    }
    // TODO: implement the method

    /**
     * Returns a new string that is a substring of this string. The substring
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
    static public String subString(String inputText, int startIndex, int endIndex) {
        // TODO: implement the method
         String v = ""; 
        if (startIndex < 0) {
            System.err.println("error start number ");
        }
        int var = endIndex - startIndex;
        if (endIndex > inputText.length()) {
            System.err.println("Error end number ");
        }
if(startIndex==endIndex){
    System.out.println("startIndex == endIndex,, place enter startIndex < endIndex");
}
        if (var < 0) {
            System.err.println("error end < start");
        }
        if ((startIndex == 0) && (endIndex == inputText.length())) {
            System.out.println(inputText);
        } else {
      //  String var = "";
        for (int i = startIndex; i < endIndex; i++) {
            v += inputText.charAt(i);
        }

       
    }
        return v; 
    }

    /**
     * Returns a copy of the string, with leading and trailing whitespace
     * omitted. If the specified inputText String object represents an empty
     * character sequence (empty string), or the first and last characters of
     * character sequence represented this String object both have codes greater
     * than u0020' (the space character), then a reference to the specified
     * 'inputText' String object is returned. Otherwise, if there is no
     * character with a code greater than +in the given inputText string, then a
     * new String object representing an empty string is created and returned.
     * Otherwise, let k be the index of the first character in the string whose
     * code is greater than 'u0020', and let m be the index of the last
     * character in the string whose code is greater than 'u0020'. A new String
     * object is created, representing the substring of this string that begins
     * with the character at index k and ends with the character at index m-that
     * is, the result of StringUtil.substring(inputText, k, m). This method may
     * be used to trim whitespace (as defined above) from the beginning and end
     * of a string.
     *
     * @return A copy of this string with leading and trailing white space
     * removed, or this string if it has no leading or trailing white space.
     */
    public static String trim(String inputText) {
        // TODO: implement the method
        String ob = "";
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) > '\u0020') {
                ob += inputText.charAt(i);
            }
        }

        return ob;
    }

    /**
     * The same as parseInt method of Integer class
     *
     * @param str the string to be converted to int
     * @return the conversion result
     */
    public static int parseInt(String str) {
        int num = 0;
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                switch (str.charAt(i)) {
                    case '0':
                        n = 0;
                        break;
                    case '1':
                        n = 1;
                        break;
                    case '2':
                        n = 2;
                        break;
                    case '3':
                        n = 3;
                        break;
                    case '4':
                        n = 4;
                        break;
                    case '5':
                        n = 5;
                        break;
                    case '6':
                        n = 6;
                        break;
                    case '7':
                        n = 7;
                        break;
                    case '8':
                        n = 8;
                        break;
                    case '9':
                        n = 9;
                        break;

                }
                num *= 10;
                num += n;
            }

        }
        if (str.charAt(0) == '-') {
            num *= -1;
        }

        return num;
    }

}
