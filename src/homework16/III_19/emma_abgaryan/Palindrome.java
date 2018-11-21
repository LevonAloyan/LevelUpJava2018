package homework16.III_19.emma_abgaryan;

/**
 * Created by Emma on 3/18/2016.
 */
public class Palindrome {
    public static void main(String[] args) {
        String text = "katak";
        int startind = 0;
        int lastind = text.length()-1;
        boolean isPalindrom = true;
        while (startind < lastind){
            String startchar = text.substring(startind, startind+1);
            String lastchar = text.substring(lastind, lastind+1);

            if (startchar.equals(lastchar)== false){
                isPalindrom = false;
                break;
            }
            startind++;
            lastind--;
        }
        if(isPalindrom == true ){
            System.out.println(text + " is polindrom");
        }

    }
}
