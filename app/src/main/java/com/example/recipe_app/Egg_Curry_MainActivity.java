package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Egg_Curry_MainActivity extends AppCompatActivity {

    TextView egg_curry_headlime_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_curry_main);

        Bundle bn = getIntent().getExtras(); // Getting The whole Bundle of Extra items
        String headLine = bn.getString("headline"); // Storing Specific value to a specific Variable
        egg_curry_headlime_textView = findViewById(R.id.egg_curry_headlime_textView);
        egg_curry_headlime_textView.setText(String.valueOf(headLine));


    }
}