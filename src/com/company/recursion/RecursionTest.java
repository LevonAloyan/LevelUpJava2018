package com.company.recursion;

public class RecursionTest {

    public int factorial(int n) {
        if (n < 1){
            return 1;
        }
        n = n* factorial(n-1);
        return n;
    }

    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
        int factorial = recursionTest.factorial(13);
        System.out.println(factorial);
    }
}
