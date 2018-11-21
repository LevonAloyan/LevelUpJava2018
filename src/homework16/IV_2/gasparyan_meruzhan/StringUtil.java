package homework16.IV_2.gasparyan_meruzhan;

import java.security.InvalidParameterException;

public class StringUtil {


    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param inputText  the string to be splitted by the specified delimiter
     * @param delimiter  the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     *          around matches of the given regular expression.
     */
    public static String[] split(String inputText, char delimiter) {
        int length= inputText.length();
        int startindex = 0;
        int indexArray=0;
        String [] value = new String[length/2];
        for (int i = 0; i < length; i++) {
            if(inputText.charAt(i)==delimiter){
               value[indexArray]= subString(inputText,startindex,i);
                indexArray++;
                startindex=i+1;
            }
        }
        return value;
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
    * @param      inputText    the string substring of wich must be returned
    * @param      startIndex   the beginning index, inclusive.
    * @param      length     the ending index, exclusive.
    * @return     the specified substring.
    * @exception IndexOutOfBoundsException  if the
    *             beginIndex is negative, or
    *             endIndex is larger than the length of
    *             this String object, or
    *             beginIndex is larger than
    *             endIndex.
    */
    static public String subString(String inputText, int startIndex, int length) {
        if(inputText.length()==0||startIndex<0||startIndex>=length||length<=0){
            throw new InvalidParameterException();
        }
     return subStringPriv(inputText,startIndex,length);
    }

    private static String subStringPriv(String inputText, int startIndex,int length){
        StringBuilder value = new StringBuilder();

        for (int i = startIndex; i < length; i++) {
            value.append(inputText.charAt(i));
        }
        return value.toString();
    }
    /**
     * Returns a copy of the specified str, with leading and trailing whitespace
     * omitted.
     * @param str the String will be trimmed.
     * @return  A copy of the string with leading and trailing white
     *          space removed, or this string if it has no leading or
     *          trailing white space.
     */
    public static String trim(String str) {
       StringBuffer value= new StringBuffer();
        int length = str.length();
        for (int i = 0; i <length ; i++) {
            if(str.charAt(i)!=' '){
                value.append(str.charAt(i));
            }
        }
        return value.toString();
    }

    /**
     * Parses the string argument as a signed decimal integer. The
     * characters in the string must all be decimal digits, except
     * that the first character may be an ASCII minus sign.
     *
     * @param s a String containing the int representation to be parsed
     * @return     the integer value represented by the argument in decimal.
     * @exception NumberFormatException  if the string does not contain a
     *               parsable integer.
     */
    public static int parseInt(String s) {
        int value =0;
        int currentIndex;
        int length = s.length();
        for (int i = 0; i <length ; i++) {
            if(s.charAt(i)<48||s.charAt(i)>58){
                throw new IndexOutOfBoundsException();
            }
            currentIndex = s.charAt(i)-'0';
            value *=10;
            value+=currentIndex;
        }

        return value;
    }

    public static String toLowerCase(String text){
        int length =text.length();
        StringBuffer str = new StringBuffer(length);
        for (int i = 0; i < length ; i++) {

            if(text.charAt(i)>64&&text.charAt(i)<91){
                str.append( (char) (text.charAt(i)+32));
            }else if(text.charAt(i)>1039&&text.charAt(i)<1072) {
                str.append( (char) (text.charAt(i)+32));
            } else if(text.charAt(i)>1328&&text.charAt(i)<1366){
                str.append( (char) (text.charAt(i)+48));
            }else{
                str.append(text.charAt(i));
            }
        }

        return str.toString();
    }

    public static String toUpperCase(String text){
        int length =text.length();
        StringBuffer str = new StringBuffer(length);
        char a = 'a';
        char b='z';
        System.out.println((a-0)+":"+(b-0));
        System.out.println();
        for (int i = 0; i < length ; i++) {

            if(text.charAt(i)>96&&text.charAt(i)<122){
                str.append( (char) (text.charAt(i)-32));
            }else if(text.charAt(i)>1071&&text.charAt(i)<1104) {
                str.append( (char) (text.charAt(i)-32));
            } else if(text.charAt(i)>1376&&text.charAt(i)<1415){
                str.append( (char) (text.charAt(i)-48));
            }else{
                str.append(text.charAt(i));
            }
        }

        return str.toString();
    }

    private static int indexOf(String text,char index){
        int length = text.length();
        for (int i = 0; i <length ; i++) {
            if(text.charAt(i)==index){
                return i;
            }
        }
        return -1;
    }
    private static int indexOfEnd(String text, char index){
        int length = text.length()-1;
        for (int i =length; i >=0 ; i++) {
            if(text.charAt(i)==index){
                return i;
            }
        }
        return -1;
    }

    private static String changeCase(String text, char startOfRange, char endOfRange) {
        int start = indexOf(text,startOfRange);
        int end = indexOfEnd(text,endOfRange);
        if(start==-1||end==-1||text.length()<=0||end>=start){
            throw new InvalidParameterException();
        }
        String value = subString(text,start,end);
        return toUpperCase(value);
    }


    /**
     * Tests if this string starts with the specified prefix.
     *
     * @param   sourceText the String to check if it is ended with the specified prefix
     * @param   prefix   the prefix.
     * @return  true if the character sequence represented by the
     *          argument is a prefix of the character sequence represented by
     *          this string; false otherwise.
     *          Note also that true will be returned if the
     *          argument is an empty string or is equal to this
     *          String object as determined by the
     *          equals(Object) method
     */
    public boolean startsWith(String sourceText, String prefix) {

        int length =prefix.length();
        for (int i = 0; i <length ; i++) {
            if(sourceText.charAt(i)!=prefix.charAt(i)){
                return false;
            }
        }

        return true;
    }

    /**
     * Tests if this string ends with the specified suffix.
     *
     * @param   sourceText the String to check if it is started with the specified suffix.
     * @param   suffix     the suffix.
     * @return  true if the character sequence represented by the
     *          argument is a suffix of the character sequence represented by
     *          this object;  false otherwise. Note that the
     *          result will be true if the argument is the
     *          empty string or is equal to this String object
     *          as determined by the equals(Object) method.
     */
    public boolean endsWith(String sourceText, String suffix) {
        int length = suffix.length()-1;
        for (int i =length ; i >=0 ; i++) {
            if(sourceText.charAt(i)!=suffix.charAt(i)){
                return false;
            }
        }
        return true;
    }


}