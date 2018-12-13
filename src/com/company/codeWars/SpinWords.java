package com.company.codeWars;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] splitWords = sentence.split(" ");
        String reversedSentence = "";
        String reversedWord;
        for (String str : splitWords) {
            if (str.length() >= 5) {
                reversedWord = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversedWord += (str.charAt(i));
                }
                reversedSentence += " " + reversedWord;
            } else {
                reversedSentence += " " + str;
            }
        }
        return reversedSentence;
    }

    public static void main(String[] args) {
        String wordForReverse = "Welcome";
        String wordForReverse1 = "Hey fellow warriors";
        SpinWords spinWordsTest = new SpinWords();
        System.out.println(spinWordsTest.spinWords(wordForReverse));
        System.out.println(spinWordsTest.spinWords(wordForReverse1));

    }
}


