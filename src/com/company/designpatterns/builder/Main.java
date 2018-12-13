package com.company.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        BankAccount account = BankAccount.builderAccount()
                .addAccountNumber(123456L)
                .addOwner("levon")
                .addBranch("Branch")
                .addBalance(5000)
                .addInterestRate(10)
                .build();

        System.out.println(account);
    }
}
