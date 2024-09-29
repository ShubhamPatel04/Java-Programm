package com.coreJava;
import java.util.Scanner;

public class Bank {
    private double amount;

    // Parameterized constructor to initialize 'amount'
    public Bank(double initialAmount) 
 {
        this.amount = initialAmount;
    }

    // Method to withdraw an amount
    public void withdraw(double withdrawalAmount) {
        // Check if the amount is sufficient for withdrawal
        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to deposit an amount
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance:" + amount);
    }

    
    public static void main(String[] args) {
       
        Bank myBank = new Bank(20000);

        // Withdraw an amount 
        myBank.withdraw(5000);

        // Deposit 5000
        myBank.deposit(3000);

        // Display the total balance
        myBank.displayBalance();
    }
}