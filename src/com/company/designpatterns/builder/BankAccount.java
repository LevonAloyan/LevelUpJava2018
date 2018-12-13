package com.company.designpatterns.builder;

public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public class AccountBuilder {


        public AccountBuilder addAccountNumber(long accountNumber) {
            BankAccount.this.accountNumber = accountNumber;
            return this;
        }

        public AccountBuilder addOwner(String owner) {
            BankAccount.this.owner = owner;
            return this;
        }

        public AccountBuilder addBranch(String branch) {
            BankAccount.this.branch = branch;
            return this;
        }

        public AccountBuilder addBalance(double balance) {
            BankAccount.this.balance = balance;
            return this;
        }

        public AccountBuilder addInterestRate(double interestRate) {
            BankAccount.this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            return BankAccount.this;
        }


    }

    private BankAccount() {
    }

    public static AccountBuilder builderAccount(){
        return new BankAccount().new AccountBuilder();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }


    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }


    public double getInterestRate() {
        return interestRate;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
