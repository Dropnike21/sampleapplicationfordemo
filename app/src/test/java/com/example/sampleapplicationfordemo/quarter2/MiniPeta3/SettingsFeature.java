package com.example.sampleapplicationfordemo.quarter2.MiniPeta3;
import java.util.Scanner;

public class SettingsFeature {
    public void execute(Scanner scanner) {
        boolean inSettings = true;

        // Sub-menu loop
        while (inSettings) {
            System.out.println("--- Settings Sub-MenuTestingfile ---");
            System.out.println("1. Change PIN");
            System.out.println("2. Change Language");
            System.out.println("3. Back to Main MenuTestingfile");
            System.out.println("-------------------------");

            System.out.print("settings choice: ");
            int choice = scanner.nextInt();
            System.out.println(choice); // Echo the test input

            if (choice == 1) {
                System.out.print("Enter new 4-digit PIN: ");
                int newPin = scanner.nextInt();
                System.out.println(newPin); // Echo the test input
                System.out.println("Success! PIN changed to " + newPin + "\n");

            } else if (choice == 2) {
                System.out.println("Language updated successfully!\n");

            } else if (choice == 3) {
                System.out.println("Returning to Main MenuTestingfile...\n");
                inSettings = false; // Breaks the sub-menu loop, returning control to MainMenu

            } else {
                System.out.println("Invalid settings option.\n");
            }
        }
    }
}