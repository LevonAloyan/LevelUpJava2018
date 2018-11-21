package auditorium.taskstodo.task_I.bracecheker;


public class BraceChecker {
    /** TO store the opened brackets in text to be parsed */
    private Stack<BracketItem> stack;

    /** TO store the parsing result */
    private String message = "No errors";

    public BraceChecker() {
       //TODO initialize the fields
    }

    /**
     * Getter method for message field
     * @return the value of the message
     */
    public String getMessage() {
        return message;
    }


    /**
     * Parses the text to check correctness of disposition of brackets in text ,
     * and in case of incorrectness initializes following errorIndex,
     * errorIndexInLine and errorLineNumber fields of a BracketItem instance, to indicate where
     * incorrectness occur, and generates corresponding error for message field.
     *
     * @return true if parsing passed without error, otherwise false
     */
    public boolean parse(String text) {
        //TODO  add reset method and call here
        return false;
    }

    public static class BracketItem {
        private char value;
        private int numberInLine;
        private int lineNumber;
        private int index;

        //TODO : Complete the program code of BracketItem class
    }

}
