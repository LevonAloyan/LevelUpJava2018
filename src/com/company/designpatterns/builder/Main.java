package com.company.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        BankAccount account = BankAccount.builderAccount().addInterestRate(2314L).addBranch("aaa").build();
        System.out.println(account);
    }
}
