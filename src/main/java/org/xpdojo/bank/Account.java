package org.xpdojo.bank;

public class Account {
	int balance=0;

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
}