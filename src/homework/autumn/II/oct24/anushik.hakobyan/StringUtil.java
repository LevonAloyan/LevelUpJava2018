package homework.autumn.II.oct24.anushik.hakobyan;
public class StringUtil {
    public static void main(String[] args) {
        System.out.println(subString("helloworld", 2, 5));
       // System.out.println(split("helloworld,hfv"));
        System.out.println(parseInt("78"));
        System.out.println(trim(" hello world "));
    }

    public static String[] split(String inputText, char delimiter) {
        // TODO: implement the method
        String st;
        int j = 0;
        int start = 0;
        String array[] = new String[inputText.length() / 2];
        for(int i = 0; i < inputText.length(); i++){
            if(inputText.charAt(i) == delimiter){
                array[i] = subString(inputText,start,i-1);
                start = i + 1;
                j ++;
            }
        }
        array[j] = subString(inputText,start,inputText.length()-1);
        System.out.println(array[j]);

        return null;
    }

    static public String subString(String inputText, int startIndex, int endIndex) {
        String st="";

        if (startIndex < 0) {
            System.err.print("error:write coret number");
        }
        if (endIndex > inputText.length()) {
            System.err.print("error,please");

        }
        int diff = endIndex - startIndex;
        if (diff < 0) {
            System.err.print("err,end <start");
        }
        if ((startIndex == 0) && (endIndex == inputText.length())) {
            System.out.println(inputText);

        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                st+=inputText.charAt(i);
            }
        }
        return st;
    }

    public static String trim(String inputText) {
         int j = 0;
        int count = 0;
        int lspaces = 0;
        char ch[] = inputText.toCharArray();
        int len = inputText.length();
        StringBuffer bchar = new StringBuffer();
        if(ch[0] == ' ')
        {
            while(ch[j] == ' ')
            {
                lspaces++;
                j++;
            }
        }
        for(int i = lspaces; i < len; i++)
        {
            if(ch[i] != ' ')
            {
                if(count > 1 || count == 1)
                {
                    bchar.append(' ');
                    count = 0;
                }
                bchar.append(ch[i]);
            }
            else if(ch[i] == ' ')
            {
                count++;
            }
        }
        return bchar.toString();
    }

    public static int parseInt( String str ){
        int i = 0;
        int number = 0;
        boolean negative = false;
        if (str.charAt(0) == '-') {
            negative = true;
            i = 1;
        }
        while( i < str.length()) {
            number *= 10;
            number += str.charAt(i++) - '0';
        }
        if (negative)
            number = -number;
        return number;
    }
}


