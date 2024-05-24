package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Egg_Roll_MainActivity extends AppCompatActivity {

    TextView egg_roll_headline_textView,egg_roll_igredientName_textView,igredientName_textView10,egg_roll_ingredients_textView,egg_roll_instructions_textView;
    ScrollView egg_roll_ingredients_ScrollView,egg_roll_instructions_scrollView;
    ImageView rgg_roll_imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_roll_main);

        Bundle bn = getIntent().getExtras(); // Getting The whole Bundle of Extra items
        String headLine = bn.getString("headline"); // Storing Specific value to a specific Variable
        egg_roll_headline_textView = findViewById(R.id.egg_roll_headline_textView);
        egg_roll_headline_textView.setText(headLine);

        egg_roll_igredientName_textView = findViewById(R.id.egg_roll_igredientName_textView);
        igredientName_textView10 = findViewById(R.id.igredientName_textView10);
        egg_roll_ingredients_textView = findViewById(R.id.chocolate_ingredients_textView);
        egg_roll_instructions_textView = findViewById(R.id.chocolate_instructions_textView);
        egg_roll_ingredients_ScrollView = findViewById(R.id.chocolate_ingredients_ScrollView);
        egg_roll_instructions_scrollView = findViewById(R.id.chocolate_instructions_scrollView);
        rgg_roll_imageView = findViewById(R.id.rgg_roll_imageView);


    }
}