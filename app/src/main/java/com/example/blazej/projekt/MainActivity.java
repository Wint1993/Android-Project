package com.example.blazej.projekt;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabAddRecipe;
    FloatingActionButton fabSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabAddRecipe = findViewById(R.id.floatingActionButton2);
        fabSearch = findViewById(R.id.floatingActionButton3);

        fabAddRecipe.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), AddRecipeActivity.class);
            startActivity(i);
        });

        fabSearch.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MenuSearch.class);
            startActivity(i);
        });



    }
}
