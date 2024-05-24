package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Bread_Pakora_MainActivity extends AppCompatActivity {

    TextView bread_pakora_headlime_textView,bread_pakora_igredientName_textView,bread_pakora_igredientName_textView6,bread_pakora_ingredients_textView,bread_pakora_instructions_textView;
    ImageView bread_pakora_imageView;
    ScrollView bread_pakora_ingredients_ScrollView,bread_pakora_instructions_scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bread_pakora_main);

        Bundle bn = getIntent().getExtras(); // Getting The whole Bundle of Extra items
        String headLine = bn.getString("headline"); // Storing Specific value to a specific Variable
        bread_pakora_headlime_textView = findViewById(R.id.bread_pakora_headlime_textView);
        bread_pakora_headlime_textView.setText(String.valueOf(headLine));

        bread_pakora_igredientName_textView = findViewById(R.id.bread_pakora_igredientName_textView);
        bread_pakora_igredientName_textView6 = findViewById(R.id.bread_pakora_igredientName_textView6);
        bread_pakora_ingredients_textView = findViewById(R.id.chocolate_ingredients_textView);
        bread_pakora_instructions_textView = findViewById(R.id.chocolate_instructions_textView);
        bread_pakora_imageView = findViewById(R.id.bread_pakora_imageView);
        bread_pakora_ingredients_ScrollView = findViewById(R.id.chocolate_ingredients_ScrollView);
        bread_pakora_instructions_scrollView = findViewById(R.id.chocolate_instructions_scrollView);


    }
}