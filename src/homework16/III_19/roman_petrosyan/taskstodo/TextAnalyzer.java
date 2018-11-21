package homework16.III_19.roman_petrosyan.taskstodo;

public class TextAnalyzer {
    public static void main(String[] args) {
        String str="levelannnna";
        System.out.println(findLongestPalindrome(str));
    }

    public static String findLongestPalindrome(String text) {
       int result= getLongestOddPalindrome(text).length();
       return getLongestEvenPalindrome(text,result);

    }

    public static String getLongestOddPalindrome(String text) {
        int rightIndex = 0, leftIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < text.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;  rightIndex = centerIndex + 1;
            while (leftIndex >= 0 && rightIndex < text.length()) {
                if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = text.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ?
                        currentPalindrome : longestPalindrome;
                leftIndex--;  rightIndex++;
            }
        }
        return longestPalindrome;
    }

    public static String getLongestEvenPalindrome(String text) {
        int rightIndex = 0, leftIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < text.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;  rightIndex = centerIndex;
            while (leftIndex >= 0 && rightIndex < text.length()) {
                if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = text.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ?
                        currentPalindrome : longestPalindrome;
                leftIndex--;  rightIndex++;
            }
        }
        return longestPalindrome;
    }

    public static String getLongestEvenPalindrome(String text, int minLength) {
        int resultEven=getLongestEvenPalindrome(text).length();
        minLength= getLongestOddPalindrome(text).length();
        return resultEven>minLength? getLongestEvenPalindrome(text):getLongestOddPalindrome(text);

    }

}
