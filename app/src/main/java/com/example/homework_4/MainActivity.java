package com.example.homework_4;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private CardView cardCountries, cardLeaders, cardMuseums, cardWonders;
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
        cardCountries = findViewById(R.id.cardCountries);
        cardLeaders = findViewById(R.id.cardLeaders);
        cardMuseums = findViewById(R.id.cardMuseums);
        cardWonders = findViewById(R.id.cardWonders);

        // Gắn sự kiện click cho từng thẻ
        cardCountries.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, activity_countries.class);
            startActivity(intent);
        });

        cardLeaders.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, activity_leaders.class);
            startActivity(intent);
        });

        cardMuseums.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, activity_museums.class);
            startActivity(intent);
        });

        cardWonders.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, activity_wonders.class);
            startActivity(intent);
        });
    }
}