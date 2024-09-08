package com.example.myid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button by its ID
        Button viewIDCardButton = findViewById(R.id.view_id_card_button);

        // Set an OnClickListener to handle the button click
        viewIDCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start StudentIDActivity
                Intent intent = new Intent(MainActivity.this, StudentIDActivity.class);
                startActivity(intent);
            }
        });
    }
}


