package homework16.IV_2.tsolak_harutyunyan;



public class BraceChecker {

    public static final int OPENED_BUT_NOT_CLOSED = 0;
    public static final int CLOSED_BUT_NOT_OPENED = 1;
    public static final int OPENED_BUT_CLOSED_ANOTHER = 3;

    /**
     * TO store the opened brackets in text to be parsed
     */
    private StackImpl<BracketItem> stack;    //  pay attention please, we decide to the generic type: <BracketItem>

    /**
     * TO store the parsing result
     */
    private String message = "No Error";

    /**
     * Error symbol index in parsing text
     */
    private int errorIndex = -1;

    /**
     * Getter method for message field
     *
     * @return the value of the message
     */
    public String getMessage() {
        return message;
    }

    public int getErrorIndex() {
        return errorIndex;
    }

    public BraceChecker() {
        stack = new StackImpl();
    }

    /**
     * Parses the text to check correctness of disposition of brackets in text ,
     * and in case of incorrectness initializes following errorIndex,
     * errorIndexInLine and errorLineNumber fields, to indicate where
     * incorrectness occur.
     *
     * @param text
     * @return true if parsing passed without error, otherwise false
     */
    public boolean parse(String text) {
        boolean isPassed = true;
        int numberInLine = 0;
        int lineNumber = 0;
        BracketItem stackLastElement = null;
        char ch = 0;
        lab:
        for (int i = 0; i < text.length(); i++) {
            errorIndex++;
            ch = text.charAt(i);
            numberInLine++;
            switch (ch) {
                case '\n':
                case '\r':
                    numberInLine = 0;
                    lineNumber++;
                    break;
                case '(':
                case '{':
                case '[':
                    BracketItem item = new BracketItem(ch, numberInLine, lineNumber, i);
                    stack.push(item);
                    break;
                case ')':
                    stackLastElement = stack.pop();

                    // Must be checked whether the stackLastElement == null in order to avoid NullPointerException
                    if (stackLastElement == null || stackLastElement.getValue() != '(') {
                        isPassed = false;
                        break lab;
                    }
                    break;
                case ']':
                    stackLastElement = stack.pop();
                    if (stackLastElement == null || stackLastElement.getValue() != '[') {
                        isPassed = false;
                        break lab;
                    }
                    break;
                case '}':
                    stackLastElement = stack.pop();
                    if (stackLastElement == null || stackLastElement.getValue() != '{') {
                        isPassed = false;
                        break lab;
                    }
                    break;
            }
        }
        if (!isPassed) {
            if (stackLastElement == null) {
                message = "closed '" + ch + "' but not opened ";
            } else {
                message = "opened '" + stackLastElement.getValue() + "' but closed '" + ch + "'";
            }
        } else if ((stackLastElement = stack.pop()) != null) {
            message = "opened '" + stackLastElement.getValue() + "' but not closed";
            isPassed = false;
        }
        return isPassed;
    }

    public static void main(String[] args) {
        String s = "{[()] }";
        BraceChecker b = new BraceChecker();
        b.parse(s);
        System.out.println(b.getMessage());
    }

    public static class BracketItem {

        private char value;
        private int numberInLine;
        private int lineNumber;
        private int index;

        public BracketItem(char value, int numberInLine, int lineNumber, int index) {
            this.value = value;
            this.numberInLine = numberInLine;
            this.lineNumber = lineNumber;
            this.index = index;
        }

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }

        public int getNumberInLine() {
            return numberInLine;
        }

        public void setNumberInLine(int numberInLine) {
            this.numberInLine = numberInLine;
        }

        public int getLineNumber() {
            return lineNumber;
        }

        public void setLineNumber(int lineNumber) {
            this.lineNumber = lineNumber;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}
