package com.company.bracechecker;

public class BraceCheckerItem {

    private int index;
    private int lineNumber;
    private int numberInLine;
    private char value;

    public BraceCheckerItem(int index, int lineNumber, int numberInLine, char value) {
        this.index = index;
        this.lineNumber = lineNumber;
        this.numberInLine = numberInLine;
        this.value = value;

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getNumberInLine() {
        return numberInLine;
    }

    public void setNumberInLine(int numberInLine) {
        this.numberInLine = numberInLine;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "value=" + '\''+value +'\''+
                ", index=" + index +
                ", lineNumber=" + lineNumber +
                ", numberInLine=" + numberInLine;
    }
}
