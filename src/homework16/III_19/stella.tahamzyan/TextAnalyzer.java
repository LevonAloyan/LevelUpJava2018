package homework16.III_19.stella.tahamzyan;


public class TextAnalyzer {
    public static void main(String[] args) {
        String str = "abbaqaxaqlevvel";
        System.out.println(getLongestOddPalindrome(str));
        findLongestPalindrome(str);

    }
    public static String findLongestPalindrome(String text) {
int result=getLongestOddPalindrome(text).length();
getLongestEvenPalindrome(text,result);
        return null; 
    }

    public static String getLongestOddPalindrome(String text) {
        int rightIndex = 0;
        int leftIndex = 0;
        String smallString = "";
        String bigString = "";
        for (int i = 1; i < text.length(); i++) {
            rightIndex = i+1;
            leftIndex = i-1;
            while(leftIndex >= 0 && rightIndex <= text.length() - 1 ){
               if(text.charAt(leftIndex) != text.charAt(rightIndex)){
                   break;
               }
                smallString = text.substring(leftIndex,rightIndex + 1);
                bigString = smallString.length() > bigString.length() ? smallString : bigString;
                rightIndex ++; leftIndex--;
            }
        }


        return bigString;
    }

    public static String getLongestEvenPalindrome(String text) {
        int rightIndex = 0;
        int leftIndex = 0;
        String smallString = "";
        String bigString = "";
        for (int i = 1; i < text.length(); i++) {
            rightIndex = i;
            leftIndex = i-1;
            while(leftIndex >= 0 && rightIndex <= text.length() - 1 ){
                if(text.charAt(leftIndex) != text.charAt(rightIndex)){
                    break;
                }
                smallString = text.substring(leftIndex,rightIndex + 1);
                bigString = smallString.length() > bigString.length() ? smallString : bigString;
                rightIndex ++; leftIndex--;
            }
        }
        return bigString;
    }

    public static String getLongestEvenPalindrome(String text, int minLength)
    {

        getLongestEvenPalindrome(text);

        int minEvLength = getLongestEvenPalindrome(text).length();
        if (minEvLength > minLength){
            System.out.println(getLongestEvenPalindrome(text));
        }else{
            System.out.println(getLongestOddPalindrome(text));
        }
        return text; 
    }
}
