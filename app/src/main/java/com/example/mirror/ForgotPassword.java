package com.example.mirror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    TextView MoveLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        MoveLogin = findViewById(R.id.log3);

        MoveLogin.setOnClickListener(view -> {
            Intent send = new Intent(ForgotPassword.this, Login.class);
            startActivity(send);
        });
    }
}