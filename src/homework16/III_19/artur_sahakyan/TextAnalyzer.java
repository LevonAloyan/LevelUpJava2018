package homework16.III_19.artur_sahakyan;

public class TextAnalyzer {
    public static void main(String[] args) {
        String string = "annaqaxaqghjdasa";
        System.out.println(getLongestOddPalindrome(string));
        findLongestPalindrome(string);
    }

    public static String findLongestPalindrome(String text) {

        int resuult = getLongestOddPalindrome(text).length();
        getLongestEvenPalindrome(text, resuult);

        return null; // TODO implement
    }

    public static String getLongestOddPalindrome(String text) {

        int rightIndex = 0;
        int leftIndex = 0;
        String shortIndex = "";
        String longIndex = "";

        for (int i = 1; i < text.length(); i++) {
            rightIndex = i + 1;
            leftIndex = i - 1;

            while (leftIndex >= 0 && rightIndex <= text.length() - 1) {
                if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                    break;
                }
                shortIndex = text.substring(leftIndex, rightIndex + 1);
                longIndex = shortIndex.length() > longIndex.length() ?
                        shortIndex : longIndex;

                rightIndex++;
                leftIndex--;
            }
        }
        return longIndex; // TODO implement
    }

    public static String getLongestEvenPalindrome(String text) {

        int rightIndex = 0;
        int leftIndex = 0;
        String shortIndex = "";
        String longIndex = "";

        for (int i = 1; i < text.length(); i++) {
            rightIndex = i;
            leftIndex = i - 1;

            while (leftIndex >= 0 && rightIndex <= text.length() - 1) {
                if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                    break;
                }
                shortIndex = text.substring(leftIndex, rightIndex + 1);
                longIndex = shortIndex.length() > longIndex.length() ?
                        shortIndex : longIndex;


                rightIndex++;
                leftIndex--;


            }
        }
        return longIndex; // TODO implement
    }

    public static String getLongestEvenPalindrome(String text, int minLength) {

        getLongestEvenPalindrome(text);

        int minEvLength = getLongestEvenPalindrome(text).length();

        if (minEvLength > minLength){
            System.out.println(getLongestEvenPalindrome(text));

        }
        else {
            System.out.println(getLongestOddPalindrome(text));
        }
        return text; // TODO implement
    }

}
