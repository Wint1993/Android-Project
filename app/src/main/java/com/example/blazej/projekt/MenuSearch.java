package com.example.blazej.projekt;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuSearch extends AppCompatActivity {


    FloatingActionButton fab,fab1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_search);

        fab = findViewById(R.id.floatingActionButton5);
        fab1 = findViewById(R.id.floatingActionButton19);

        fab.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), ShowAllRecipes.class);
            startActivity(i);
        });

        fab1.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), VoiceSearch.class);
            startActivity(i);
        });

    }
}
