package com.company.bracechecker;

public class BraceChecker {
    private BraceCheckerItem braceCheckerItem;
    private Stack stack = new Stack();
    private String errorMessage;

    public BraceChecker(BraceCheckerItem braceCheckerItem) {
        this.braceCheckerItem = braceCheckerItem;
    }


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
                    stack.push(new BraceCheckerItem(i, lineNumber, numberInLine, '('));
                    break;
                case '{':
                    stack.push(new BraceCheckerItem(i, lineNumber, numberInLine, '{'));
                    break;
                case '[':
                    stack.push(new BraceCheckerItem(i, lineNumber, numberInLine, '['));
                    break;
                case ')':
                    BraceCheckerItem lastElement = (BraceCheckerItem) stack.pop();
                    if (stack.isEmpty()) {
                        errorMessage = "Closed " + new BraceCheckerItem(i, lineNumber, numberInLine, ')') + "but not opened";
                    } else if (lastElement.getValue() != '(') {
                        errorMessage = "Opened " + lastElement + " but closed " + new BraceCheckerItem(i, lineNumber, numberInLine, ')');
                    }


            }
        }

        return false;
    }


}
