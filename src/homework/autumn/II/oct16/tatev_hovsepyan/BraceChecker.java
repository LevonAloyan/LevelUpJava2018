package homework.autumn.II.oct16.tatev_hovsepyan;

public class BraceChecker {

    private Stack stack;
    private String resultMessage;

    public BraceChecker() {
        stack = new Stack();
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void parse(String inputText) {
        reset();
        int length = inputText.length();

        char stackLastElement = 0;
        char curr = 0;
        int i = 0;
        lab:
        for (; i < length; i++) {
            curr = inputText.charAt(i);
            switch (curr) {
                case '{':
                case '(':
                case '[':
                    stack.push(curr);
                    break;
                case '}':
                    stackLastElement = (char) stack.pop();
                    if (stackLastElement != '{') {
                        break lab;
                    }
                    break;
                case ']':
                    stackLastElement = (char) stack.pop();
                    if (stackLastElement != '[') {
                        break lab;
                    }
                    break;
                case ')':
                    stackLastElement = (char) stack.pop();
                    if (stackLastElement != '(') {
                        break lab;
                    }
                    break;
            }
        }

        if (i < length) {
            if (stackLastElement == 0) {
                resultMessage = "Error: Closed '" + curr
                        + "' but not opened ";
            } else {
                resultMessage = "Error: Opened '" + stackLastElement
                        + "' but closed '" + curr + "'";
            }
        } else if (stack.isEmpty()) {
            stackLastElement = (char) stack.pop();
            resultMessage = "Error: Opened '" + stackLastElement
                    + "' but not closed ";
        }
    }

    private void reset() {
        stack.reset();
        resultMessage = "No Error";
    }

    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker();
        String inputData = "[";
        braceChecker.parse(inputData);
        System.out.println(braceChecker.getResultMessage());
        inputData = " ([])";
        braceChecker.parse(inputData);
        System.out.println(braceChecker.getResultMessage());

    }
}