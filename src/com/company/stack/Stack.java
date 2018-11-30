package com.company.stack;

public class Stack {

    private static final int DEFAULT_CAPACITY = 16;
    private int[] array;
    private int tos = -1;

    public Stack() {
        array = new int[DEFAULT_CAPACITY];
    }


    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        return array[tos--];
    }

    public void push(int element) {
        if (tos >= array.length - 1) {
            extend();
        }
        array[++tos] = element;
    }


    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    private void extend() {
        int[] temp = new int[array.length * 2];
//        for (int i = 0; i < array.length; i++) {
//            temp[i] = array[i];
//        }
        System.arraycopy(array,0,temp,0,array.length);
        array = temp;
    }

}
