package homework.autumn.II.oct16.artur_sahakyan.Breacechaker;


public class BraceChecker {
    public static Stack stack = new Stack();

    //Create I_12 constructor in which must be initialised the stack

    /**
     * Pareses and checks the order of brackets in specified "text" parameter.
     *
     * @param text specified String to be parsed
     */
    public static void parse(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '[' || text.charAt(i) == '(' || text.charAt(i) == '{') {
                stack.push(text.charAt(i));
            } else if (text.charAt(i) == '}' || text.charAt(i) == ')' || text.charAt(i) == ']') {
                if ((stack.pop() == '(' && text.charAt(i) == ')') || (stack.pop() == '{' && text.charAt(i) == '}') || (stack.pop() == '[' && text.charAt(i) == ']')) {
                } else {
                    System.out.println("Sxal en");
                }
            }
        }
    }

    public static void main(String[] args) {
        parse("{}}}}");
    }
}

