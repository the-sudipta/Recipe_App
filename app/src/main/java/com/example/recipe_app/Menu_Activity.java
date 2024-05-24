package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Menu_Activity extends AppCompatActivity {


    TextView menu_textView;
    Button veg_burger_button,egg_roll_button,bread_pakora_button,egg_curry_button,chocolate_cake_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu_textView = findViewById(R.id.menu_textView);
        veg_burger_button = findViewById(R.id.veg_burger_button);
        egg_roll_button = findViewById(R.id.egg_roll_button);
        bread_pakora_button = findViewById(R.id.bread_pakora_button);
        egg_curry_button = findViewById(R.id.egg_curry_button);
        chocolate_cake_button = findViewById(R.id.chocolate_cake_button);
    }

    public void onClick(View v){
        if(v.getId() == R.id.veg_burger_button){
            Toast.makeText(getApplicationContext(), "Vegetable Burger", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),vegBurger_MainActivity.class);
            intent.putExtra("headline","Vegetable Burger");// passing value to another activity
            startActivity(intent);
            finish();
        }else if(v.getId() == R.id.egg_roll_button){
            Toast.makeText(getApplicationContext(), "Egg Roll", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),Egg_Roll_MainActivity.class);
            intent.putExtra("headline","Egg Roll");// passing value to another activity
            startActivity(intent);
            finish();
        }else if(v.getId() == R.id.bread_pakora_button){
            Toast.makeText(getApplicationContext(), "Bread Pakora", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),Bread_Pakora_MainActivity.class);
            intent.putExtra("headline","Bread Pakora");// passing value to another activity
            startActivity(intent);
            finish();
        }else if(v.getId() == R.id.egg_curry_button){
            Toast.makeText(getApplicationContext(), "Egg Curry", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),Egg_Curry_MainActivity.class);
            intent.putExtra("headline","Egg Curry");// passing value to another activity
            startActivity(intent);
            finish();
        }else if(v.getId() == R.id.chocolate_cake_button){
            Toast.makeText(getApplicationContext(), "Chocolate Cake", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),Chocolate_Cake_MainActivity.class);
            intent.putExtra("headline","Chocolate Cake");// passing value to another activity
            startActivity(intent);
            finish();
        }
    }


}