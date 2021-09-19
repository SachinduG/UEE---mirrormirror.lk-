package com.example.mirror;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Objects;

public class Addresses extends AppCompatActivity {

    private ImageButton edit1, edit2;
    private FloatingActionButton add;
    private CardView cd1, cd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);
        setTitle("Shipping Address(s)");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        add = findViewById(R.id.btn_add_address);
        edit1 = findViewById(R.id.btn_edit1);
        edit2 = findViewById(R.id.btn_edit2);
        cd1 = findViewById(R.id.cd_Address1);
        cd2 = findViewById(R.id.cd_Address2);

        add.setOnClickListener(view -> {
            Intent send = new Intent(Addresses.this, MainActivity.class);
            startActivity(send);
        });

        edit1.setOnClickListener(view -> {
            Intent send = new Intent(Addresses.this, UpdateAddress.class);
            startActivity(send);
        });

        edit2.setOnClickListener(view -> {
            Intent send = new Intent(Addresses.this, UpdateAddress.class);
            startActivity(send);
        });

        cd1.setOnClickListener(view -> {
            Intent send = new Intent(Addresses.this, Review.class);
            startActivity(send);
        });

        cd2.setOnClickListener(view -> {
            Intent send = new Intent(Addresses.this, Review.class);
            startActivity(send);
        });
    }
}