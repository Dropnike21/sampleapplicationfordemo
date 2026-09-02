package com.example.sampleapplicationfordemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testGradeCalculator() {

        // 1. Instantiate the calculator
        GradeCalculator calc = new GradeCalculator();

        // 2. Run the logic with hardcoded test numbers
        double finalGrade = calc.computeGrade(85, 90, 92);

        // 3. Print the result
        System.out.println("System Output: The student's final grade is " + finalGrade);
    }
}