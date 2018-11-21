package homework.oct24.babken_tovmasyan.StringUtil;
import java.lang.String;
public class StringUtil {
   
    public static void main(String[] args) {
     
        String s="babbaabg";
        String[] array = StringUtil.split(s,'b');
        for(String e:array){
            System.out.println(e);
        }
        String k = "124abc";
        System.out.println(StringUtil.parseIntt(k));
       
    }
  
  
    
    public static String[] split(String inputText, char delimiter) {
        String [] subStringArray=new String[inputText.length()];
          int i=0;
            for(int j=0;j<inputText.length();j++){
               if(inputText.charAt(j)==delimiter) {
            subStringArray[i]=inputText.substring(0,j);
           
            inputText=inputText.substring(j+1,inputText.length()-1);  
            i++;
               }
                
            }
        return subStringArray;
    }


    
    static public String subString(String inputText, int startIndex, int endIndex) {
        
        return inputText.substring(startIndex, endIndex);
    }


   
    public static String trim(String inputText) {
        
        int i=inputText.length();
        String s = "";
        if(inputText!=null){
            
        if(inputText.charAt(0) == ' ' && inputText.charAt(i-1) == ' ') {
           
        s=inputText.substring(1,i-2);   
        }else 
            if(inputText.charAt(0)==' '){
            s=inputText.substring(1,i);       
    }
        else 
            if(inputText.charAt(i-1)==' '){
            s=inputText.substring(0,i-2);
            }
        }else{
            System.out.println("this is a Empty text");
        }
        return s;
    }

   
    
    public static int parseIntt(String str) {
        
        return Integer.parseInt(str);
    }
}

//I finished a task, but it have some bugs
