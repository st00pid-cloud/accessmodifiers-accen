package com.school.access;

public class BankAccount {
    private String accountNumber = "1234-5678-9012";
    private double balance = 50000.00;

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositing: $" + amount + "...");
        }
    }
}