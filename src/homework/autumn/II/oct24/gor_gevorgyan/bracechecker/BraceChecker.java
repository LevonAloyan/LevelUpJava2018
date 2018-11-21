package homework.autumn.II.oct24.gor_gevorgyan.bracechecker;

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
        //TODO: Ամեն անգամ փարս անելուց առաջ stack-ը պիտի դատարկվի ե resultMessage-ը պիտի դառանա "No Error", դրա համար էլ պիտի կանչել reset() մեթոդը
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
}