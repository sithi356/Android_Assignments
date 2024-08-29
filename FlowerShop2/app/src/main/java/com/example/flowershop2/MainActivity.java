package com.example.flowershop2;

import android.os.Bundle;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private FlowerExpert expert = new FlowerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindFlowers(View view) {
        // Get a reference to the Spinner
        Spinner color = findViewById(R.id.color);

        // Get the selected flower from the Spinner
        String flowerType = String.valueOf(color.getSelectedItem());

        // Get recommendations from the FlowerExpert class
        List<String> varietiesList = expert.getVarieties(flowerType);

        // Convert the list of varieties to an array
        String[] varietiesArray = varietiesList.toArray(new String[0]);

        // Start the new activity and pass the flower type and its varieties
        Intent intent = new Intent(MainActivity.this, VarietiesActivity.class);
        intent.putExtra("flower_type", flowerType);
        intent.putExtra("varieties", varietiesArray);
        startActivity(intent);
    }
}