package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class vegBurger_MainActivity extends AppCompatActivity {

    TextView veg_burger_headlime_textView,veg_burger_igredientName_textView,veg_burger_ingredients_textView,veg_burger_instructions_textView;
    ImageView veg_burger_imageView;
    ScrollView veg_burger_ingredients_ScrollView,veg_burger_instructions_scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_burger_main);

        Bundle bn = getIntent().getExtras(); // Getting The whole Bundle of Extra items
        String headLine = bn.getString("headline"); // Storing Specific value to a specific Variable
        veg_burger_headlime_textView = findViewById(R.id.veg_burger_headlime_textView);
        veg_burger_headlime_textView.setText(String.valueOf(headLine));

        veg_burger_igredientName_textView = findViewById(R.id.veg_burger_igredientName_textView);
        veg_burger_imageView = findViewById(R.id.veg_burger_imageView);
        veg_burger_igredientName_textView = findViewById(R.id.veg_burger_igredientName_textView);
        veg_burger_ingredients_textView = findViewById(R.id.chocolate_ingredients_textView);
        veg_burger_instructions_textView = findViewById(R.id.chocolate_instructions_textView);
        veg_burger_ingredients_ScrollView = findViewById(R.id.chocolate_ingredients_ScrollView);
        veg_burger_instructions_scrollView = findViewById(R.id.chocolate_instructions_scrollView);
    }
}