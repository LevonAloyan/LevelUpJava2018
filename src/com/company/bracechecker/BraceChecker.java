package com.company.bracechecker;

public class BraceChecker {

    public final String noErrors = "There are no errors";

    private BraceCheckerItem braceCheckerItem;
    private StackImplement stack = new StackImplement();
    private boolean parsSuccess = true;
    private String errorMessage;

    public BraceChecker(BraceCheckerItem braceCheckerItem) {
        this.braceCheckerItem = braceCheckerItem;
    }

    public BraceChecker() {

    }

    public boolean parser(String inputText) {
        int lineNumber = 1;
        int numberInLine = 0;
        int i = 0;
        BraceCheckerItem lastElement = null;
        BraceCheckerItem currentItem = null;
        char currentBracket;

        backToThis:
        for (; i < inputText.length(); i++) {
            currentBracket = inputText.charAt(i);

            switch (currentBracket) {
                case '\n':
                case '\r':
                    lineNumber++;
                    numberInLine = 0;
                    break;
                case '(':
                case '{':
                case '[':
                    stack.push(new BraceCheckerItem(i, lineNumber, numberInLine, currentBracket));
                    break;
                case ')':
                    lastElement = (BraceCheckerItem) stack.pop();
                    if (lastElement == null || lastElement.getValue() != '(') {
                        currentItem = new BraceCheckerItem(i, lineNumber, numberInLine, currentBracket);
                        break backToThis;
                    }
                case '}':
                    lastElement = (BraceCheckerItem) stack.pop();
                    if (lastElement == null || lastElement.getValue() != '{') {
                        currentItem = new BraceCheckerItem(i, lineNumber, numberInLine, currentBracket);
                        break backToThis;
                    }
                case ']':
                    lastElement = (BraceCheckerItem) stack.pop();
                    if (lastElement == null || lastElement.getValue() != '[') {
                        currentItem = new BraceCheckerItem(i, lineNumber, numberInLine, currentBracket);
                        break backToThis;
                    }


            }
        }

        if (lastElement == null) {
            errorMessage = "Closed with " + currentItem + "but not opened";
            parsSuccess = false;
        } else {
            errorMessage = "Opened with " + lastElement + " but closed with " + currentItem + "'";
            parsSuccess = false;
        }
        if (!stack.isEmpty()) {
            BraceCheckerItem element = (BraceCheckerItem) stack.pop();
            errorMessage = "Opened with " + element + " but not closed";
            parsSuccess = false;
        }
        return parsSuccess;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isParsSuccess() {
        return parsSuccess;
    }


}

