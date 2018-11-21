package homework.autumn.II.oct16.astghik_sargsyan.bracechecker;

public class BraceChecker {

    Stack stack;

    //Create I_12 constructor in which must be initialised the stack
    /**
     * Pareses and checks the order of brackets in specified "text" parameter.
     *
     * @param text specified String to be parsed
     */
    public boolean parse(String text) {
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            } else if (symbol == ']') {
                if (stack.pop() != '[') {
                    return false;
                }
            } else if (symbol == '}') {
                if (stack.pop() != '{') {
                    return false;
                }
            } else if (symbol == ')') {
                if (stack.pop() != '(') {
                    return false;
                }
            }
        }
        return false;

    }
}
