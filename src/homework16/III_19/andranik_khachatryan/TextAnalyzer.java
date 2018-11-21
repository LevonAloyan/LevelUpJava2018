package homework16.III_19.andranik_khachatryan;

public class TextAnalyzer {
    public static void main(String[] args) {
        String str = "ataanababgaghohkuku";
        System.out.println(getLongestOddPalindrome(str));
        //findLongestPalindrome(str);
    }

    public static String findLongestPalindrome(String text) {
        int result=getLongestOddPalindrome(text).length();
        getLongestEvenPalindrome(text,result);
        return null;
    }

    public static String getLongestOddPalindrome(String text) {
        int right = 0;
        int left = 0;
        String shortString = "";
        String longString = "";
        for (int i = 1; i < text.length(); i++) {
            right = i + 1;
            left = i - 1;
            while (left >= 0 && right <= text.length() - 1) {
                if (text.charAt(left) != text.charAt(right)) {
                    break;
                }
                shortString = text.substring(left, right + 1);
                longString = shortString.length() > longString.length() ? shortString : longString;
                right++;
                left--;
            }

        }
        return longString;
    }

    public static String getLongestEvenPalindrome(String text) {
        int right = 0;int left = 0;
        String shortString = "";
        String longString = "";
        for (int i = 1; i < text.length(); i++) {
            right = i;left = i-1;
            while(left >= 0 && right <= text.length() - 1 ){
                if(text.charAt(left) != text.charAt(right)){
                    break;
                }
                shortString = text.substring(left,right + 1);
                longString = shortString.length() > longString.length() ? shortString : longString;
                right++; left--;
            }
        }


        return longString;
    }

    public static String getLongestEvenPalindrome(String text, int minLength) {
        getLongestEvenPalindrome(text);

        int minEvenLength = getLongestEvenPalindrome(text).length();
        if (minEvenLength > minLength){
            System.out.println(getLongestEvenPalindrome(text));
        }else{
            System.out.println(getLongestOddPalindrome(text));
        }
        return text;
    }


}
