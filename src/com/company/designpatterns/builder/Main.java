package com.company.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        BankAccount account = BankAccount.builderAccount()
            .addBalance(231.2)
            .addBranch("new Branch")
            .addAccountNumber(123456L)
            .addInterestRate(12.25)
            .addOwner("me")
            .build();

        System.out.println(account);
    }
}
