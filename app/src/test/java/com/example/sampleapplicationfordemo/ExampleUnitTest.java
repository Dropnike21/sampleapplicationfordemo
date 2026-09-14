package com.example.sampleapplicationfordemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

// 1. Define the menu logic right here in the test file (notice it is NOT public)
class ConsoleMenu {
    public void start(Scanner scanner) {
        System.out.println("1. Add User");
        System.out.println("2. Exit");

        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("User " + name + " added successfully!");
        } else {
            System.out.println("Goodbye!");
        }
    }
}

// 2. The actual test class
public class ExampleUnitTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setupOutputCapture() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAddUserMenuFlow() {
        String simulatedInput = "1\nAlice\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(inputStream);

        // It will now find ConsoleMenu because it is defined right above
        ConsoleMenu menu = new ConsoleMenu();
        menu.start(scanner);

        String printedOutput = outputStream.toString();

        Assert.assertTrue(printedOutput.contains("User Alice added successfully!"));
        Assert.assertTrue(printedOutput.contains("Enter name:"));
    }

    @After
    public void restoreSystemOut() {
        System.setOut(originalOut);
    }
}