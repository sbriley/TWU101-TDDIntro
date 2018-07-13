package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public void deposit(int depositAmount) {
        balance = depositAmount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int withdrawalAmount) {
        if(balance-withdrawalAmount >= 0) {
            balance -= withdrawalAmount;
        }
    }
}
