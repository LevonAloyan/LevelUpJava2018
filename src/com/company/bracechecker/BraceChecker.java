package com.company.bracechecker;

public class BraceChecker {
    private BraceCheckerItem braceCheckerItem;
    private StackImpl stackImpl = new StackImpl();
    private String errorMessage;
    private boolean parsSuccess = true;


    public boolean isParseSuccessful(String inputText) {
        int lineNumber = 1;
        int numberInLine = 0;
        for (int i = 0; i < inputText.length(); i++) {
            switch (inputText.charAt(i)) {

                case '\n':
                case '\r':
                    lineNumber++;
                    numberInLine = 0;
                    break;
                case '(':
                    stackImpl.push(new BraceCheckerItem(i, lineNumber, numberInLine, '('));
                    break;
                case '{':
                    stackImpl.push(new BraceCheckerItem(i, lineNumber, numberInLine, '{'));
                    break;
                case '[':
                    stackImpl.push(new BraceCheckerItem(i, lineNumber, numberInLine, '['));
                    break;
                case ')':
                    BraceCheckerItem lastElement = null;
                    if (!stackImpl.isEmpty()) {
                        lastElement = (BraceCheckerItem) stackImpl.pop();
                    }
                    if (stackImpl.isEmpty()) {
                        errorMessage = "Closed " + new BraceCheckerItem(i, lineNumber, numberInLine, ')') + "but not opened";
                        parsSuccess = false;
                    } else if (lastElement.getValue() != '(') {
                        errorMessage = "Opened " + lastElement + " but closed " + new BraceCheckerItem(i, lineNumber, numberInLine, ')');
                        parsSuccess = false;
                    }
            }
        }

        if (!stackImpl.isEmpty()) {
            BraceCheckerItem element = (BraceCheckerItem) stackImpl.pop();
            errorMessage = "Opened " + element + " but not closed";
            parsSuccess = false;
        }
        return parsSuccess;
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isParsSuccess() {
        return parsSuccess;
    }

    public void setParsSuccess(boolean parsSuccess) {
        this.parsSuccess = parsSuccess;
    }
}
