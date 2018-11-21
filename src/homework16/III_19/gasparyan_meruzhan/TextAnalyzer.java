package homework16.III_19.gasparyan_meruzhan;

public class TextAnalyzer {

    public static String findLongestPalindrome(String text) {

       String val1;
        String val2;
       val1=getLongestOddPalindrome(text);
        val2=getLongestEvenPalindrome(text);
        return val1.length()>val2.length()?val1:val2;
    }

    public static String getLongestOddPalindrome(String text) {
        int length = text.length();
        int goRigth;
        int goLeft;
        String value = "";
        String polidrom = "";
        for (int i = 2; i < length; i++) {
            goLeft = i - 2;
            goRigth = i;
            while (text.charAt(i - 2) == text.charAt(i)) {
                polidrom = text.substring(goLeft, goRigth + 1);//todo performans
                if (value.length() < polidrom.length())
                    value = polidrom;
                goLeft--;
                goRigth++;
                if (goLeft < 0 || goRigth > length - 1 || text.charAt(goLeft) != text.charAt(goRigth))
                    break;

            }
        }
        return value;
    }

    public static String getLongestEvenPalindrome(String text) {
        int length = text.length();
        int goRigth;
        int goLeft;
        String value = "";
        String polidrom = "";
        for (int i = 1; i < length; i++) {
            goLeft = i - 1;
            goRigth = i;
            while (text.charAt(i - 1) == text.charAt(i)) {
                polidrom = text.substring(goLeft, goRigth + 1);
                if (value.length() < polidrom.length())
                    value = polidrom;
                goLeft--;
                goRigth++;
                if (goLeft < 0 || goRigth > length - 1 || text.charAt(goLeft) != text.charAt(goRigth))
                    break;

            }
        }
        return value;
    }

    public static String getLongestEvenPalindrome(String text, int minLength) {
        return null; // TODO implement
    }

    public static void main(String[] args) {
        System.out.println(getLongestOddPalindrome("mam"));
        System.out.println(getLongestEvenPalindrome("maa44m"));
        System.out.println(findLongestPalindrome("maa444m"));
    }

}
