package com.example.sampleapplicationfordemo;

public class GradeCalculator {

    // This is the method MainActivity was trying to find!
    public double computeGrade(int prelim, int midterm, int finals) {
        double average = (prelim + midterm + finals) / 3.0;
        return average;
    }
}
