package homework16.III_19.zaven_chilingaryan;

public class TextAnalyzer {

    public static void main (String[]args){
        String str = "55544522666866225   katak kaaazaaaaannaaaaazaaak anna ";
        String longestOddPali = getLongestOddPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Longest Odd Palindrome: " + longestOddPali);
        String longestEvenPali = getLongestEvenPalindrome(str);
        System.out.println("Longest Even Palindrome: " + longestEvenPali);
        String longestPolindrom = findLongestPalindrome(str);
        System.out.println("Longest Polindrom:  " + longestPolindrom);
    }

    public static String findLongestPalindrome(String text) {
        String longestPolindrom;
        String longestOddPolindrom = getLongestOddPalindrome(text);
        String longestEvenPolindrom = getLongestEvenPalindrome(text);
        longestPolindrom = longestEvenPolindrom.length() > longestOddPolindrom.length() ? longestEvenPolindrom : longestOddPolindrom;

        return longestPolindrom;
    }

    public static String getLongestOddPalindrome(String text) {
        int rightIndex = 0, leftIndex = 0;
        String currentOddPalindrome = "", longestOddPalindrome = "";
        for (int centerIndex = 1; centerIndex < text.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;
            rightIndex = centerIndex + 1;
            while (leftIndex >= 0 && rightIndex < text.length()) {
                if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                    break;
                }
                currentOddPalindrome = text.substring(leftIndex, rightIndex + 1);
                longestOddPalindrome = currentOddPalindrome.length() > longestOddPalindrome.length() ? currentOddPalindrome : longestOddPalindrome;
                leftIndex--;
                rightIndex++;
            }
        }
        return longestOddPalindrome;

    }


    public static String getLongestEvenPalindrome(String text) {
        int rightIndex = 0, leftIndex = 0;
        String currentEvenPalindrome = "", longestEvenPalindrome = "";
        for (int centerIndex = 1; centerIndex < text.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;
            rightIndex = centerIndex ;
            while (leftIndex >= 0 && rightIndex < text.length()) {
                if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                    break;
                }
                currentEvenPalindrome = text.substring(leftIndex, rightIndex + 1);
                longestEvenPalindrome = currentEvenPalindrome.length() > longestEvenPalindrome.length() ? currentEvenPalindrome : longestEvenPalindrome;
                leftIndex--;
                rightIndex++;
            }
        }
        return longestEvenPalindrome;

    }

    public static String getLongestEvenPalindrome(String text, int minLength) {
        return null; // TODO implement
    }

}
