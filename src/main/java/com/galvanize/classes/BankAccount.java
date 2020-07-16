package com.galvanize.classes;

class BankAccount {
    String name;
    double balance;

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }

    double balance() {
        return this.balance;
    }

    boolean isOverDrawn() {
        return this.balance < 0;
    }

}


/*
* deposit(long cents): Adds cents to the bank account
withdraw(long cents): Removes cents from the bank account
balance(): Returns the current balance on the bank account
isOverDrawn(): Returns true if the balance on the account is negative
* */