package com.example.sampleapplicationfordemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // --- STUDENT CODE STARTS HERE ---

        // 1. They instantiate the pure Java classes they wrote
        GradeCalculator calc = new GradeCalculator();

        // 2. They run their logic
        double finalGrade = calc.computeGrade(85, 90, 92);

        // 3. They print the result to the console
        System.out.println("System Output: The student's final grade is " + finalGrade);

        // --- STUDENT CODE ENDS HERE ---
















    }
}