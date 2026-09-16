package com.example.sampleapplicationfordemo.quarter2.MiniPeta3;

import java.util.Scanner;

public class MainMenu {
    public void start(Scanner scanner) {
        int balance = 1000;
        boolean isRunning = true;
        String username = "8888888";

        while (isRunning) {
            System.out.println("========================================");
            System.out.println("=========");
            System.out.println("ATM Menu");
            System.out.println("=========");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Settings");
            System.out.println("4. Exit");
            System.out.println("=========");

            System.out.print("user choice: ");
            int choice = scanner.nextInt();
            System.out.println(choice); // Echo the test input
            System.out.println("========================================");
            if (choice == 1) {
                // Link to Check Balance feature
                CheckBalanceFeature checkBalance = new CheckBalanceFeature();
                checkBalance.execute(scanner, balance);

            } else if (choice == 2) {
                // Link to Withdraw feature and update the balance
                WithdrawFeature withdraw = new WithdrawFeature();
                balance = withdraw.execute(scanner, balance);

            } else if (choice == 3) {
                // Link to the sub-menu
                SettingsFeature settings = new SettingsFeature();
                settings.execute(scanner);

            }else if (choice == 4) {
                // Link to the sub-menu
                changename changename = new changename();
                changename.execute(scanner,username);

            } else if (choice == 5) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                isRunning = false;
            } else {
                System.out.println("Invalid option. Try again.\n");
            }
        }
    }
}