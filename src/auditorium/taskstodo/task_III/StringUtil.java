package auditorium.taskstodo.task_III;

public class StringUtil {

  /**
   * Parses the specified inputText and divides it into tokens by the specified delimiter.
   *
   * @param inputText the string to be splitted by the specified delimiter
   * @param delimiter the delimiter by which the specified inputText  will splitted.
   * @return the array of strings computed by splitting this string around matches of the given regular expression.
   */
  public static String[] split(String inputText, char delimiter) {
    //TODO implement
    return null;
  }

  /**
   * Returns a new string that is a substring of the spcified inputText. The substring begins at the specified
   * <code>beginIndex and extends to the character at index <code>endIndex - 1. Thus the length of the substring is
   * <code>endIndex-beginIndex. Examples:
   * <blockquote><pre>
   * "hamburger".substring(4, 8) returns "urge"
   * "smiles".substring(1, 5) returns "mile"
   *
   * @param      inputText    the string substring of wich must be returned
   * @param      startIndex   the beginning index, inclusive.
   * @param      endIndex     the ending index, exclusive.
   * @return the specified substring.
   * @exception IndexOutOfBoundsException  if the
   *             beginIndex is negative, or
   *             endIndex is larger than the length of
   *             this String object, or
   *             beginIndex is larger than
   *             endIndex.
   */
  static public String subString(String inputText, int startIndex, int endIndex) {
    //TODO implement
    return null;
  }

  /**
   * Returns a copy of the specified str, with leading and trailing whitespace omitted.
   *
   * @param str the String will be trimmed.
   * @return A copy of the string with leading and trailing white space removed, or this string if it has no leading or
   * trailing white space.
   */
  public static String trim(String str) {
    //TODO: implement
    return null;
  }

  /**
   * Parses the string argument as a signed decimal integer. The characters in the string must all be decimal digits,
   * except that the first character may be an ASCII minus sign.
   *
   * @param str a String containing the int representation to be parsed
   * @return the integer value represented by the argument in decimal.
   * @throws NumberFormatException if the string does not contain a parsable integer.
   */
  public static int parseInt(String str) {
    return 0;
  }

  /**
   * Tests if this string starts with the specified prefix.
   *
   * @param sourceText the String to check if it is ended with the specified prefix
   * @param prefix the prefix.
   * @return true if the character sequence represented by the argument is a prefix of the character sequence
   * represented by this string; false otherwise. Note also that true will be returned if the argument is an empty
   * string or is equal to this String object as determined by the equals(Object) method
   */
  public boolean startsWith(String sourceText, String prefix) {

    return false;
  }

  /**
   * Tests if this string ends with the specified suffix.
   *
   * @param sourceText the String to check if it is started with the specified suffix.
   * @param suffix the suffix.
   * @return true if the character sequence represented by the argument is a suffix of the character sequence
   * represented by this object;  false otherwise. Note that the result will be true if the argument is the empty string
   * or is equal to this String object as determined by the equals(Object) method.
   */
  public boolean endsWith(String sourceText, String suffix) {
    return false;
  }

}