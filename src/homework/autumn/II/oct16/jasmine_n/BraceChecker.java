package homework.autumn.II.oct16.jasmine_n;


public class BraceChecker {
    Stack stack;
    private String input;

    //Create I_12 constructor in which must be initialised the stack

    /**
     * Pareses and checks the order of brackets in specified "text" parameter.
     *
     * @param text  specified String to be parsed
     */
    public void parse (String text) {
        input = text;
    }

    public void check(){
        int stackSize = input.length();
        Stack checkStack = new Stack(16); //TODO : You could use default constructor of StackImpl class


        for (int i=0; i<input.length(); i++)
        {
            char ch = input.charAt(i);

            switch (ch){
                case '{':
                case '[':
                case '(':
                    checkStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!checkStack.empty()) {
                        int chx = checkStack.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
                                || (ch == ')' && chx != '('))
                            System.out.println("Error: " + ch + " at " + i);
                    }else
                        System.out.println("Error: " + ch + " at " + i);



            }
        }
        if (!checkStack.empty())
            System.out.println("Error: missing right delimiter");
    }

    public static void main(String[] args) {
        String input = "{Lorem Ipsum is simply dummy[ text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard (dummy text ever since the 1500s,) when an unknown printer took I_12 galley of type and scrambled] it to make I_12 type specimen book}";
        BraceChecker theChecker = new BraceChecker();
        theChecker.parse(input);
        theChecker.check();
    }
}
