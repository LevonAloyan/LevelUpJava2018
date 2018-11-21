package com.company.homeworks;

import java.util.Arrays;

public class StringUtil1 {

  public static void main(String[] args) {

    String inputText = "new world";
//    String s = subString(inputText, 0, 0);
//    System.out.println(s);

    String substring = inputText.substring(0, 0);
    System.out.println(substring);

    String[] s = split(inputText, ' ');
    System.out.println(Arrays.toString(s));

  }

  public static String subString(String text, int start, int end) {

    char[] array = new char[end - start + 1];
    int j = 0;

    boolean isValid = isValidIndexes(text, start, end);
    boolean isFullString = isFullString(text, start, end);

    if (isValid) {
      if (isFullString) {
        return text;
      }
      for (int i = start; i <= end; i++) {
        array[j++] = text.charAt(i);
      }
    } else {
      return "Invalid";
    }

    return new String(array);

  }

  private static boolean isValidIndexes(String text, int start, int end) {
    return start >= 0 && start <= end && end < text.length();
  }

  private static boolean isFullString(String text, int start, int end) {

    return start == 0 && end == text.length() - 1;
  }

  public static String[] split(String inputText, char delimiter) {
    int j = 0;
    int temp = 0;
    String[] arr = new String[inputText.length()];
    for(int i = 0; i < inputText.length(); i++){
      if(inputText.charAt(i) == delimiter){
        arr[j] = inputText.substring(temp, inputText.charAt(i));
        temp = inputText.charAt(i + 1);
        j++;
      }
    }
    return arr;
  }
}
