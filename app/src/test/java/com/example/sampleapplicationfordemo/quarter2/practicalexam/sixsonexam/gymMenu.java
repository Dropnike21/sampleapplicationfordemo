package com.example.sampleapplicationfordemo.quarter2.practicalexam.sixsonexam;
import java.util.Scanner;
public class gymMenu {
    public void start(Scanner scanner) {
        System.out.println("1. Enter Gym");
        System.out.println("2. Hire Trainer");
        System.out.println("3. Exit");
        System.out.print("user choice: ");
        int choice = scanner.nextInt();
        System.out.println(choice); // Echo the test input
        if (choice == 1) {
            System.out.println("You have entered the gym!");
        } else if (choice == 2) {
            System.out.println("1. Level 1");
            System.out.println("2. Level 2");
            System.out.print("trainer choice: ");
            int trainerChoice = scanner.nextInt();
            System.out.println(trainerChoice); // Echo the test input
            if (trainerChoice == 1) {
                System.out.println("Trainer Assigned");
            } else if (trainerChoice == 2) {
                System.out.println("Upgrade Required");
            } else {
                System.out.println("Invalid trainer choice");
            }
        } else if (choice == 3) {
            System.out.println("Thank you for using the ATM. Goodbye!");
            } else {
            System.out.println("Invalid option. Try again.");
        }
    }
}
