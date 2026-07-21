package com.school.other;
import com.school.access.BankAccount;

public class TestBankFromOutside {
    public static void main(String[] args){
        BankAccount yourBank = new BankAccount();
        //System.out.println(yourBank.accountNumber);
        // results to: java: accountNumber has private access in com.school.access.BankAccount
        //System.out.println("Balance: " + yourBank.getBalance());
        //yourBank.deposit(10000.00);
        //System.out.println("New Balance: " + yourBank.getBalance());

        //banking-outside
        System.out.println("--- Accessing BankAccount from a different package ---");
        System.out.println("Account (via getter): " + yourBank.getAccountNumber());
        System.out.println("Balance (via getter): " + yourBank.getBalance());
    }
}
