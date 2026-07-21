package com.school.access;
import com.school.access.BankAccount;

public class TestBankAccount {
    public static void main(String[] args){
        BankAccount yourBank = new BankAccount();
        System.out.println("Account: " + yourBank.getAccountNumber());
        System.out.println("Balance: " + yourBank.getBalance());
        yourBank.deposit(10000.00);
        System.out.println("New Balance: " + yourBank.getBalance());
    }
}