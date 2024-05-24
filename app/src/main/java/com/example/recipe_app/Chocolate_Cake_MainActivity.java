package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Chocolate_Cake_MainActivity extends AppCompatActivity {

    TextView chocolate_headlie_textView,chocolate_igredientName_textView,chocolate_igredientName_textView7,chocolate_instructions_textView,chocolate_ingredients_textView;
    ImageView chocolate_imageView;
    ScrollView chocolate_instructions_scrollView,chocolate_ingredients_ScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_cake_main);

        Bundle bn = getIntent().getExtras(); // Getting The whole Bundle of Extra items
        String headLine = bn.getString("headline"); // Storing Specific value to a specific Variable
        chocolate_headlie_textView = findViewById(R.id.chocolate_headlie_textView);
        chocolate_headlie_textView.setText(String.valueOf(headLine));

        chocolate_igredientName_textView = findViewById(R.id.chocolate_igredientName_textView);
        chocolate_igredientName_textView7 = findViewById(R.id.chocolate_igredientName_textView7);
        chocolate_instructions_textView = findViewById(R.id.chocolate_instructions_textView);
        chocolate_ingredients_textView = findViewById(R.id.chocolate_ingredients_textView);
        chocolate_imageView = findViewById(R.id.chocolate_imageView);
        chocolate_instructions_scrollView = findViewById(R.id.chocolate_instructions_scrollView);
        chocolate_ingredients_ScrollView = findViewById(R.id.chocolate_ingredients_ScrollView);
    }
}