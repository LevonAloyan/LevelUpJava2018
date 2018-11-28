package com.company.stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 1; i < 34 ; i++) {
           stack.push(i);
        }


        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
        }
//        System.out.println("out of for");
//        System.out.println(stack.pop());
    }
}
