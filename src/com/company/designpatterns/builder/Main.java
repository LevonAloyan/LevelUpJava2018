package com.company.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        BankAccount account = BankAccount.builderAccount()
            .addBalance(231.2)
            .addInterestRate(23.5)
            .addOwner("me")
            .build();

        System.out.println(account);
    }
}
