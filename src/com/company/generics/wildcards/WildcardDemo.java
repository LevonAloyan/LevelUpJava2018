package com.company.generics.wildcards;

import com.company.objectmethods.B;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {

        List<? extends Gift> myList1 = new ArrayList<Gift>();
        List<? extends Gift> myList2 = new ArrayList<Book>();
        List<? extends Gift> myList3 = new ArrayList<Phone>();


        List<? super Gift> myList4 = new ArrayList<Gift>();
//        List<? super Gift> myList5 = new ArrayList<Book>();
//        List<? super Gift> myList6 = new ArrayList<Phone>();
        List<? super Gift> myList7 = new ArrayList<Object>();

        myList4.add(new Gift());
        myList4.add(new Book(""));
        myList4.add(new Phone());
//        myList4.add(new Object());


    }
}
