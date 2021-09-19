package com.example.mirror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button cancel, save;
    private EditText name, address, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Add New Shipping Address");

        spinner = findViewById(R.id.spArea);
        String[] districts = {"Colombo", "Gampaha", "Kalutara", "Galle", "Matara", "Kurunagale", "Kandy", "Nuwara Eliya", "Hambanthota", "Rathnapura"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, districts);
        spinner.setAdapter(arrayAdapter);

        name = findViewById(R.id.etName);
        address = findViewById(R.id.etAddress);
        phone = findViewById(R.id.etPhone);
        save = findViewById(R.id.btn_save);
        cancel = findViewById(R.id.btn_cancel);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = name.getText().toString().trim();
                String fullAddress = address.getText().toString().trim();
                String Phone = phone.getText().toString().trim();

                if(fullName.isEmpty()){
                    name.setError("Full Name is required!");
                }else if (fullAddress.isEmpty()){
                    address.setError("Full Address is required!");
                }else if (Phone.isEmpty()){
                    phone.setError("Phone number is required!");
                }else if (Phone.length() < 10){
                    phone.setError("Please enter valid phone number!");
                }else{
                    Toast.makeText(getApplicationContext(), "Your Address successfully saved", Toast.LENGTH_SHORT).show();
                    Intent send = new Intent(MainActivity.this, Addresses.class);
                    startActivity(send);
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, Addresses.class);
                startActivity(send);
            }
        });

    }
}