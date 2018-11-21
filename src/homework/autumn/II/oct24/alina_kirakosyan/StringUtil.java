package homework.autumn.II.oct24.alina_kirakosyan;

public class StringUtil {

    public static void main(String[] args) {
      System.out.println(split("helloword,hfvhhgh,gytgjhdfg,dfg",','));
        System.out.println(subString("helloword", 2, 5));
        System.out.println(Trim(" Helloworld "));
        System.out.println(parseInt("2552"));

    }



    public static String[] split(String inputText, char delimiter) {
        String st;
        int j = 0;
        int start = 0;
        String array[] = new String[inputText.length() / 2];
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                array[i] = subString(inputText, start, i - 1);
                start = i + 1;
                j++;
            }
        }
        array[j] = subString(inputText, start, inputText.length() - 1);
        System.out.println(array[j]);

        return array;
    }






 static public String subString(String inputText, int startIndex, int endIndex) {
       String st="";

       if (startIndex < 0) {
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
               //  for (int j = 0; j < inputText.length(); j++) {
                st+=inputText.charAt(i);


                 }

             }



         return st;
    }










static String Trim(String str) {
        int j = 0;
        int count = 0;
        int lspaces = 0;
        char ch[] = str.toCharArray();
        int len = str.length();
        StringBuffer bchar = new StringBuffer();
        if (ch[0] == ' ') {
            while (ch[j] == ' ') {
                lspaces++;
                j++;
            }
        }
        for (int i = lspaces; i < len; i++) {
            if (ch[i] != ' ') {
                if (count > 1 || count == 1) {
                    bchar.append(' ');
                    count = 0;
                }
                bchar.append(ch[i]);
            } else if (ch[i] == ' ') {
                count++;
            }
        }
        return bchar.toString();
    }





public static int parseInt(String str) {
        int i = 0;
        int num = 0;
        boolean isNeg = false;
        if (str.charAt(0) == '-') {
        isNeg = true;
        i = 1;
        }
        while (i < str.length()) {
        num *= 10;
        num += str.charAt(i++) - '0';
        }
        if (isNeg)
        num = -num;
        return num;
        }
        }

