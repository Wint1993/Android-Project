package com.example.blazej.projekt;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SelectedRecipeInfo extends AppCompatActivity {

     TextView txtTitle,txtDescription,txtCategory,txtComponents;
     Button delete, edit;
     Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_recipe_info);
        String idString = getIntent().getStringExtra("EXTRA");
        int id = Integer.valueOf(idString);

        DatabaseHandler db = new DatabaseHandler(this);

        txtTitle = findViewById(R.id.textView8);
        txtDescription = findViewById(R.id.textView10);
        txtCategory = findViewById(R.id.textView11);
        txtComponents = findViewById(R.id.textView12);
        delete = findViewById(R.id.button);
        edit = findViewById(R.id.button4);

        Recipe rc = new Recipe();
        rc = db.getRecipe(id);
        txtTitle.setText(rc.getRecipeTitle());
        txtDescription.setText(rc.getDescription());
        txtCategory.setText(rc.getCategory());
        txtComponents.setText(rc.getComponents());

        Recipe finalRc = rc;
        delete.setOnClickListener(v -> {
            db.deleteContact(finalRc);
            Intent k = new Intent(getBaseContext(), ShowAllRecipes.class);
            startActivity(k);
        });
        edit.setOnClickListener(v -> {
            Intent k = new Intent(getBaseContext(), EditRecipe.class);
            k.putExtra("EXTRA3",String.valueOf(finalRc.getId()));
            startActivity(k);
        });






    }
}
