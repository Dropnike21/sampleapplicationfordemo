package com.example.sampleapplicationfordemo.quarter2;

import org.junit.Test;

public class sixsonfunction {
    // --- 1. THE LOGIC (What you are teaching in Quarter2) ---

    public int calculateReward(int score) {

    }

    // --- 2. THE TEST (How to run it in Android Studio) ---
    @Test
    public void testRewardSystem() {
        // We will test a score of 85
        int myScore = 85;
        int myReward = calculateReward(myScore);

        // Print the result to the Run window
        System.out.println("System Output: For a score of " + myScore + ", the reward is " + myReward);
    }
}
