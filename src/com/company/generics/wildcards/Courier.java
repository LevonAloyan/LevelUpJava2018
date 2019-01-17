package com.company.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

class Courier {
    public static void wrapGift(List<? extends Gift> list) {
        for (Object item : list) {
            System.out.println("GiftWrap - " + item);
        }
//        list.add(new Book(""));
//        list.add(new Object());
//        list.add(new Phone());

    }

    public static void main(String args[]) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Oracle"));
        bookList.add(new Book("Java"));
        wrapGift(bookList);
        List<String> stringList = new ArrayList<String>();
        stringList.add("Paul");
        stringList.add("Shreya");
//        wrapGift(stringList);
    }
}