package com.example.flowershop2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_varieties);

        // Get the data from the Intent
        String flowerType = getIntent().getStringExtra("flower_type");
        String[] varieties = getIntent().getStringArrayExtra("varieties");

        // Find the TextView for displaying the flower type and varieties
        TextView varietiesTextView = findViewById(R.id.varieties_text_view);

        // Format and display the data
        StringBuilder varietiesFormatted = new StringBuilder("Varieties of " + flowerType + ":\n\n");
        for (String variety : varieties) {
            varietiesFormatted.append(variety).append("\n");
        }

        varietiesTextView.setText(varietiesFormatted.toString());
        findViewById(R.id.back_button).setOnClickListener(v -> finish());
    }
}