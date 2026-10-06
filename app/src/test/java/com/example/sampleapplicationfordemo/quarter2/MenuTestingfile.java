package com.example.sampleapplicationfordemo.quarter2;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MenuTestingfile {

    @Test
    public void testCompleteAtmFlow() {
        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING COMPLETE TEST DATA ---");

        // PART 1: The Transaction Loop
        int transactionCount = 1;
        while (transactionCount <= 4) {
            System.out.println("Generating inputs for Transaction #" + transactionCount);

            if (transactionCount == 1) {
                automatedInput.append("1\n"); // Check Balance
            } else if (transactionCount == 2) {
                automatedInput.append("2\n");
                automatedInput.append("300\n"); // Withdraw 300
            } else {
                automatedInput.append("2\n");
                automatedInput.append("5000\n"); // Attempt overdraw
            }
            transactionCount++;
        }

        // PART 2: Navigate to Sub-MenuTestingfile (No exit command sent yet)
        System.out.println("Generating inputs for Settings Sub-MenuTestingfile");
        automatedInput.append("3\n");    // 1. Enter Settings
        automatedInput.append("1\n");    // 2. Select Change PIN
        automatedInput.append("9999\n"); // 3. Enter new PIN
        automatedInput.append("3\n");    // 4. Go back to Main MenuTestingfile

        automatedInput.append("4\n");
        automatedInput.append("123123123\n");


        // PART 3: Finally Exit the ATM
        System.out.println("Generating inputs to Exit");
        automatedInput.append("5\n");

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        // Convert the continuous string into the Scanner input
        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);

        // Run the ATM System once
        MainMenu atm = new MainMenu();
        atm.start(scanner);
    }
}