package ATM_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
	private String accountNumber;
    private double balance;
    private String pin;

    public Account(String accountNumber, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean validatePin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } 
        else {
            System.out.println("Insufficient funds!..........");
        }
    }
}