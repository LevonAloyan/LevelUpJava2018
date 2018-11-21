package homework.oct16.mara_sekhpeyan.brackets;


public class BraceChecker {
    public static Stack stack = new Stack();

    //Create a constructor in which must be initialised the stack

    /**
     * Pareses and checks the order of brackets in specified "text" parameter.
     *
     * @param text specified String to be parsed
     */
    public static void parse(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[') {
                stack.push(text.charAt(i));
            } else {
                if (text.charAt(i) == ')') {
                    if (stack.pop() == '(') {

                    } else {
                        System.err.println("don't closed '(' " );
                    }
                } else if (text.charAt(i) == '}') {
                    if (stack.pop() == '{') {

                    } else {
                        System.err.println("don't closed '{' ");
                    }

                } else if (text.charAt(i) == ']') {
                    if (stack.pop() == '[') {

                    } else {
                        System.err.println("don't closed '[' ");
                    }
                }
            }
        }
        if (stack.tos > -1) {
            System.err.println("brackets don't closed");

        }

    }

    public static void main(String[] args) {
        parse("(){}[{");
    }
}
