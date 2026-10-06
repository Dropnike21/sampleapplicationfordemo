package com.example.sampleapplicationfordemo.quarter2;

import java.util.Scanner;

public class WithdrawFeature {
    // Accepts the scanner and current balance, returns the updated balance
    public int execute(Scanner scanner, int balance) {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        // Echo the input for the test console
        System.out.println(amount);

        if (amount > balance) {
            System.out.println("Error: Insufficient funds!\n");
            return balance; // Return unchanged balance
        } else {
            balance -= amount;
            System.out.println("Success! Remaining Balance: $" + balance + "\n");
            return balance; // Return new balance
        }
    }
}