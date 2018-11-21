package homework.oct16.levon_aloyan.bracechecker;

public class BraceChecker {
    private String text;
    private Stack stack;

    public BraceChecker(String text){
        this.text=text;
        this.stack=new Stack();
    }

    public void parse(){
        char lastOpenedItem;
        for (int i = 0; i <text.length() ; i++) {
            char ch=text.charAt(i);
            switch(ch){
                case'{':
                case'(':
                case'[':
                    stack.push(ch);
                    break;
                case'}':
                    lastOpenedItem=(char)stack.pop();
                    if(lastOpenedItem ==0 || lastOpenedItem!='{' ){
                        System.out.println("error "+ ch+"at"+i);
                    }
                case')':
                    lastOpenedItem=(char)stack.pop();
                    if(lastOpenedItem ==0 || lastOpenedItem!='(' ){
                        System.out.println("error "+ ch+"at"+i);
                    }
                case']':
                    lastOpenedItem=(char)stack.pop();
                    if(lastOpenedItem ==0 || lastOpenedItem!='[' ){
                        System.out.println("error "+ ch+"at"+i);
                    }
            }

        }

    }
}
