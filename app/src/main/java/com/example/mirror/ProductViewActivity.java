package com.example.mirror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class ProductViewActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
ImageView bk;
Button btn1,btn2,btn3;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_product_view);
         Button btn1 = (Button) findViewById(R.id.btn_shopping);
         Button btn2 = (Button) findViewById(R.id.btn_checkout);
         Button btn3 = (Button) findViewById(R.id.button);
         bk = findViewById(R.id.imageView21);


         btn3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 PopupMenu popup = new PopupMenu(ProductViewActivity.this, v);
                 popup.setOnMenuItemClickListener(ProductViewActivity.this);
                 popup.inflate(R.menu.size);
                 popup.show();
             }
         });


     }

}