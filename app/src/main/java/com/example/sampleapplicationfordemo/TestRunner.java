package com.example.sampleapplicationfordemo;

public class TestRunner {
    // This makes the file executable as a standard Java program!
    public static void main(String[] args) {

        // 1. Instantiate the calculator
        GradeCalculator calc = new GradeCalculator();

        // 2. Run the logic
        double finalGrade = calc.computeGrade(85, 90, 92);

        // 3. Print the result
        System.out.println("System Output: The student's final grade is " + finalGrade);
    }
}
