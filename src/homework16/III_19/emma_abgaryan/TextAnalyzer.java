package homework16.III_19.emma_abgaryan;

public class TextAnalyzer {

    public static String findLongestPalindrome(String text){
        char [] pal = text.toCharArray();
        int longestStart = 0;
        int longestEnd = 0;
        for (int middle = 0; middle < pal.length ; middle++) {
            int left = middle;
            int right = middle;
            while (left >= 0 && right < pal.length ){
                if (pal[left] == pal[right]){
                    if (right - left > longestEnd - longestStart){
                        longestEnd = right;
                        longestStart = left;
                    }
                }
                left --;
                right ++;
            }

            left = middle;
            right = middle+1;
            while (left >= 0 && right < pal.length ){
                if (pal[left] == pal[right]){
                    if (right - left > longestEnd - longestStart){
                        longestEnd = right;
                        longestStart = left;
                    }
                }
                left --;
                right ++;
            }

        }
        return text.substring(longestStart, longestEnd+1);
    }


    public static String getLongestOddPalindrome(String text) {
        char [] pal = text.toCharArray();
        int longestStart = 0;
        int longestEnd = 0;
        for (int middle = 0; middle < pal.length ; middle++) {
            int left = middle;
            int right = middle;
            while (left >= 0 && right < pal.length) {
                if (pal[left] == pal[right]) {
                    if (right - left > longestEnd - longestStart) {
                        longestEnd = right;
                        longestStart = left;
                    }
                }
                left--;
                right++;
            }
        }

        return text.substring(longestStart,longestEnd); // TODO implement
    }

    public static String getLongestEvenPalindrome(String text) {
        char [] pal = text.toCharArray();
        int longestStart = 0;
        int longestEnd = 0;
        for (int middle = 0; middle < pal.length ; middle++) {
            int left = middle;
            int right = middle+1;
            while (left >= 0 && right < pal.length) {
                if (pal[left] == pal[right]) {
                    if (right - left > longestEnd - longestStart) {
                        longestEnd = right;
                        longestStart = left;
                    }
                }
                left--;
                right++;
            }
        }
        return text.substring(longestStart,longestEnd+1); // TODO implement
    }

    public static String getLongestEvenPalindrome(String text, int minLength) {
        return null; // TODO implement
    }

    public static void main(String[] args) {
        String text = "asdffdso";
        System.out.println("The longest palindrome is " + findLongestPalindrome(text));
        System.out.println("The longest odd palindrome is " + getLongestOddPalindrome(text));
        System.out.println("The longest even palindrome is " + getLongestEvenPalindrome(text));


    }
}
