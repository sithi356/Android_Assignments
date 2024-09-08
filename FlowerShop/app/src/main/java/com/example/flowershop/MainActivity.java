package com.example.flowershop;

import android.os.Bundle;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClickFindFlowers(View view) {
//Get a reference to the TextView
        TextView varieties = (TextView) findViewById(R.id.varieties);
//Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
//Get the selected item in the Spinner
        String flowerType = String.valueOf(color.getSelectedItem());
//Get recommendations from the FlowerExpert class
        List<String> varietiesList = expert.getVarieties(flowerType);
        StringBuilder varietiesFormatted = new StringBuilder();
        for (String brand : varietiesList) {
            varietiesFormatted.append(brand).append('\n');
        }
//Display the varieties
        varieties.setText(varietiesFormatted);
    }
}