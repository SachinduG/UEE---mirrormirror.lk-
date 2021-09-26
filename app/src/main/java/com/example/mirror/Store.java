package com.example.mirror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Store extends AppCompatActivity {
    private ImageView women, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        women = findViewById(R.id.imageView12);
        profile = findViewById(R.id.imageprofile);

        profile.setOnClickListener(view -> {
            Intent send = new Intent(Store.this, Profile.class);
            startActivity(send);
        });

        women.setOnClickListener(view -> {
            Intent send = new Intent(Store.this, WomenItemList.class);
            startActivity(send);
        });
    }
}