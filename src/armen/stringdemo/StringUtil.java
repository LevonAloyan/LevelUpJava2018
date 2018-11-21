package armen.stringdemo;

public class StringUtil {


  public static String subString(String text, int start, int end){

    return "";
  }

  public static String[] split(String inputText, char delimiter) {
    String [] result = new String[inputText.length()/2];

    return result;
  }

  public static int parseInt(String s){
  int result= 0;
    for (int i = 0; i < s.length(); i++) {
       if(s.charAt(i)<'0' || s.charAt(i)>'9'){
         System.out.println("invalid input");
         break;
       }
       result = result *10 + (s.charAt(i) - '0');
    }
    return result;
  }

  public static String trim(String str) {
    int i = 0;
    int j = str.length();

    while (str.charAt(i) == ' '){
      i++;
    }
    while (str.charAt(j) == ' '){
      j++;
    }

    return str.substring(i, j+1);
  }



}
