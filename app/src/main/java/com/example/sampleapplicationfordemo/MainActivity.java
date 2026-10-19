package com.example.sampleapplicationfordemo;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

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

        // 1. Set up the RecyclerView for Recent Activity
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create dummy data
        List<ActivityItem> activityItems = new ArrayList<>();
        activityItems.add(new ActivityItem("Coffee Shop", "Payment - $4.50", "Today"));
        activityItems.add(new ActivityItem("Freelance Payout", "Deposit + $1,200.00", "Yesterday"));
        activityItems.add(new ActivityItem("Grocery Store", "Payment - $65.20", "Oct 16"));
        activityItems.add(new ActivityItem("Subscription", "Payment - $12.99", "Oct 15"));

        // Attach the adapter
        ActivityAdapter adapter = new ActivityAdapter(activityItems);
        recyclerView.setAdapter(adapter);

        // 2. Set up Bottom Navigation (Optional: disable default tooltips or handle clicks)
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        // Note: You will need a menu resource (res/menu/bottom_nav_menu.xml) for the items to show up
    }
}