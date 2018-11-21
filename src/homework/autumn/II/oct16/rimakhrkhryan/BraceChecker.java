package homework.autumn.II.oct16.rimakhrkhryan;


public class BraceChecker {
   //static StackImpl stack;
   static String stringfirst;
   static String stringsecond;
    static int open = 0;

   

 
static void splitstring(String str){

    int len = str.length();
    for(int i=0;i<=len-1;i++){
        stringfirst="";
        stringsecond="";
        System.out.println("loop starttttttt");
        char a = str.charAt(i);
    if(a=='{'||a=='['||a=='(')
    {
        open = open+1;
        continue;
    }
    if(a=='}'||a==']'||a==')'){
        if(open==0){
            System.out.println(open+"started with closing brace");
            return;
        }
        String stringfirst=str.substring(i-open, i);
        System.out.println("stringfirst"+stringfirst);
        String stringsecond=str.substring(i, i+open);
        System.out.println("stringsecond"+stringsecond);
        replace(stringfirst, stringsecond);

        }
    i=(i+open)-1;
    open=0;
    System.out.println(i);
    }
    }
    static void replace(String stringfirst, String stringsecond){
        stringfirst = stringfirst.replace('{', '}');
        stringfirst = stringfirst.replace('(', ')');
        stringfirst = stringfirst.replace('[', ']');
        StringBuilder stringfirst1 = new StringBuilder(stringfirst);
        stringfirst = stringfirst1.reverse().toString();
    System.out.println("stringfirst"+stringfirst);
    System.out.println("stringsecond"+stringsecond);
if(stringfirst.equals(stringsecond)){
    System.out.println("pass");
}
    else{
        System.out.println("fail");
        System.exit(0);
        }
    }
}


