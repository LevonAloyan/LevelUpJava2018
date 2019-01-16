package com.company.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        BankAccount account = BankAccount.builderAccount().build();

        System.out.println(account);
    }
}
