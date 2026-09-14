package com.example.sampleapplicationfordemo;

import java.util.Scanner;
import java.util.ArrayList;

public class consoleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial Account Data
        String correctPin = "1234";
        double balance = 1500.00;
        ArrayList<String> history = new ArrayList<>();

        // Menus stored in arrays so we can print them using for-loops
        String[] mainMenu = {"Check Balance", "Deposit Funds", "Withdraw Funds", "View History", "Exit"};
        String[] withdrawMenu = {"$20", "$40", "$60", "$80", "$100", "Back to Main"};

        System.out.println("Welcome to Java Bank");
        System.out.println("--------------------");

        // 1. FOR LOOP: Limit PIN attempts to 3
        boolean authenticated = false;
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Attempt " + attempt + "/3 - Enter 4-digit PIN: ");
            String enteredPin = scanner.nextLine();

            if (enteredPin.equals(correctPin)) {
                System.out.println("\nAccess Granted.");
                authenticated = true;
                break; // Exits the PIN loop early
            } else {
                System.out.println("Incorrect PIN.");
            }
        }

        // If the loop finished and they never got it right, exit the program.
        if (!authenticated) {
            System.out.println("\nToo many incorrect attempts. Exiting program...");
            scanner.close();
            return; // Stops the program completely
        }

        // 2. MAIN MENU LOOP
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n--- MAIN MENU ---");

            // Print main menu using a for loop
            for (int i = 0; i < mainMenu.length; i++) {
                System.out.println((i + 1) + ". " + mainMenu[i]);
            }

            System.out.print("\nSelect an option (1-5): ");
            String input = scanner.nextLine(); // Read as a String first to prevent Scanner crashes

            // TRY-CATCH: Prevent crash if user types a letter instead of a number
            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.println("\n[Balance] Current Balance: $" + balance);
                        history.add("Checked Balance");
                        break;

                    case 2:
                        System.out.print("\n[Deposit] Enter amount to deposit: $");
                        String depositInput = scanner.nextLine();

                        // Nested try-catch for the deposit amount
                        try {
                            double depositAmount = Double.parseDouble(depositInput);
                            if (depositAmount > 0) {
                                balance += depositAmount;
                                System.out.println("Successfully deposited $" + depositAmount);
                                history.add("Deposited $" + depositAmount);
                            } else {
                                System.out.println("Amount must be greater than zero.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Invalid deposit amount.");
                        }
                        break;

                    case 3:
                        System.out.println("\n--- WITHDRAWAL MENU ---");
                        // Print withdrawal menu using a for loop
                        for (int i = 0; i < withdrawMenu.length; i++) {
                            System.out.println((i + 1) + ". " + withdrawMenu[i]);
                        }
                        System.out.println("Note: Please build the withdrawal logic here!");
                        break;

                    case 4:
                        System.out.println("\n--- TRANSACTION HISTORY ---");
                        if (history.isEmpty()) {
                            System.out.println("No transactions yet.");
                        } else {
                            // Print history using a for loop
                            for (int i = 0; i < history.size(); i++) {
                                System.out.println("  " + (i + 1) + ". " + history.get(i));
                            }
                        }
                        break;

                    case 5:
                        System.out.println("\nThank you for using Java Bank. Goodbye!");
                        isRunning = false; // Breaks the while loop
                        break;

                    default:
                        System.out.println("\nInvalid selection. Please choose a number between 1 and 5.");
                }

            } catch (NumberFormatException e) {
                // This catches the error if the user types "A" instead of "1" for the menu choice
                System.out.println("\nInput Error: Please enter a valid number, not text.");
            }
        }

        scanner.close(); // Clean up resource when program ends
    }
}