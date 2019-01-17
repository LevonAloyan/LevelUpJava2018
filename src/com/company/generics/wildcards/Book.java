package com.company.generics.wildcards;

class Book extends Gift {
    String title;

    Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }


}