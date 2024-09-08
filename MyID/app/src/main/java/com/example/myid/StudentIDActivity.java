package com.example.myid;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class StudentIDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_id);

        ImageButton emailButton = findViewById(R.id.email_button);
        ImageButton whatsappButton = findViewById(R.id.whatsapp_button);
        ImageButton instagramButton = findViewById(R.id.instagram_button);
        ImageButton linkedinButton = findViewById(R.id.linkedin_button);
        ImageButton githubButton = findViewById(R.id.github_button);
        ImageButton callButton = findViewById(R.id.call_button);
        ImageButton facebookButton = findViewById(R.id.facebook_button);
        ImageButton telegramButton = findViewById(R.id.telegram_button);

        emailButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:sithi.stu2019@juniv.edu"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
            startActivity(intent);
        });

        whatsappButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://wa.me/8801314073919"));
            startActivity(intent);
        });

        instagramButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.instagram.com/flora_021_0"));
            startActivity(intent);
        });

        linkedinButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.linkedin.com/in/fariasithi"));
            startActivity(intent);
        });

        githubButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/sithi356"));
            startActivity(intent);
        });
        facebookButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.facebook.com/syeda.sithi?mibextid=ZbWKwLp"));
            startActivity(intent);
        });

        telegramButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("tg://resolve?domain=@FariaSithi"));
            startActivity(intent);
        });

        callButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+01314073919"));
            startActivity(intent);
        });

    }
}
