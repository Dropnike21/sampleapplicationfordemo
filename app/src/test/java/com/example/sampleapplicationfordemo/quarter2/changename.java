package com.example.sampleapplicationfordemo.quarter2;

import java.util.Scanner;

public class changename {
    public String execute(Scanner scanner, String username) {
        System.out.print("Enter the new username: ");
        String Newname = scanner.nextLine();
        Newname = scanner.nextLine();
        System.out.println(Newname);
        username = Newname;
        System.out.println("Success! New Username is:  "+ Newname + "\n");
        return username; // Return new balance
    }


}
