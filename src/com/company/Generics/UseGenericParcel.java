package com.company.Generics;

class Book{}
public class UseGenericParcel {
    public static void main(String args[]) {
        Parcel<Book> parcel = new Parcel<Book>();
        parcel.set(new Book());
        Book myBook = parcel.get();
        System.out.println(myBook);
    }
}
