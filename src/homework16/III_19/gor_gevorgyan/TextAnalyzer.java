package homework16.III_19.gor_gevorgyan;

public class TextAnalyzer {

    public static String findLongestPalindrome(String text) {
        String odd = getLongestOddPalindrome(text);
        String even = getLongestEvenPalindrome(text);
        return (odd.length() > even.length() ? odd : even);

    }

    public static String getLongestOddPalindrome(String text) {

        int rightIndex = 0;
        int leftIndex = 0;
        String currentPalindrom = "";
        String longestPalindrome = "";
        for (int i = 1; i < text.length() - 1; i++) {
            leftIndex = i - 1;
            rightIndex = i + 1;
            while (leftIndex >= 0 && rightIndex < text.length()) {
                if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                    break;
                }
                currentPalindrom = text.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrom.length() > longestPalindrome.length() ? currentPalindrom : longestPalindrome;
                leftIndex--;
                rightIndex++;
            }
        }
        return longestPalindrome;
    }

    public static String getLongestEvenPalindrome(String text) {

        int rightIndex = 0, leftIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < text.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;
            rightIndex = centerIndex + 1;
            while (leftIndex >= 0 && rightIndex < text.length()) {
                if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = text.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome
                        .length() ? currentPalindrome : longestPalindrome;
                leftIndex--;
                rightIndex++;
            }
        }
        return longestPalindrome;
    }

    public static String getLongestEvenPalindrome(String text, int minLength) {
        return null; // TODO implement
    }

    public static void main(String[] args) {
        String str = "HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE tataallksaklddsjhja  ";
        String longestOddPali = getLongestOddPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Longest Odd Palindrome: " + longestOddPali);
        String longestEvenPali = getLongestEvenPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Longest Even Palindrome: " + longestEvenPali);
        String longestPali = findLongestPalindrome(str);
        System.out.println("findLongestPalindrome " + longestPali) ;
    }
}

