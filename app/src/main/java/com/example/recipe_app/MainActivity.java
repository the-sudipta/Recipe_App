package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
        Developer Name : Sudipta Kumar Das
        Ordered By : Soily Ghosh Sneha
        Build Date : 11-9-2021
     */


    /*
        New Features and Learning :
        1. How to pass value from one activity to another
        2. How to turn dark/night mode off for my apps
     */


    /*
        APK Building for future
        Location : app
        pass : sudipta
     */



    ImageView background_Image_View,doll_imageView;
    TextView headline_textView;
    Button start_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


        background_Image_View = findViewById(R.id.background_Image_View);
        headline_textView = findViewById(R.id.headline_textView);
        start_button = findViewById(R.id.start_button);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Menu_Activity.class);
                startActivity(intent);
            }
        });


    }
}