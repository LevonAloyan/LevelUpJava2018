package com.company.generics;

import com.company.objectmethods.User;

public class GenericMethodDemo {
    public static void main(String[] args) {
        String s ="";
        deliver(new User());
    }

    public static <T> T deliver(T t){
        System.out.println(t.getClass());
        return t;
    }
}
