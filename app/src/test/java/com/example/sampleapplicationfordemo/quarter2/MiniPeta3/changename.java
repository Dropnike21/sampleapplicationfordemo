package com.example.sampleapplicationfordemo.quarter2.MiniPeta3;

import java.util.Scanner;

public class changename {
    public int execute(Scanner scanner, int username) {
        System.out.print("Enter the new username: ");
        int Newname = scanner.nextInt();
        System.out.println(Newname);
        username = Newname;
        System.out.println("Success! New Username is:  "+ Newname + "\n");
        return username; // Return new balance
    }


}
