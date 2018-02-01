package com.example.blazej.projekt;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.blazej.projekt.Category.DESSERT;

public class AddRecipeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private String currentCategory;
    private static final String[] items = Category.getCategory(Category.class);
    FloatingActionButton fab,fab4,fab6,fab7,fab8,fab9,fab10,fab11,fab12,fab13,fab14,fab15,fab16,fab17,fab18;
    EditText text,text2,text23,text24,text25,text26,text27,text28,text29,text31,text30,text32,text33,text34,text35,text36,text37,text38;
    String txt,txt2,txt23,txt24,txt25,txt26,txt27,txt28,txt29,txt31,txt30,txt32,txt33,txt34,txt35,txt36,txt37,txt38 = "";
    Button btn;
    String component = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        DatabaseHandler db = new DatabaseHandler(this);

        final Spinner dropdown = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(AddRecipeActivity.this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(this);


        fab = findViewById(R.id.floatingActionButton);
        fab4 = findViewById(R.id.floatingActionButton4);
        fab6 = findViewById(R.id.floatingActionButton6);
        fab7 = findViewById(R.id.floatingActionButton7);
        fab8 = findViewById(R.id.floatingActionButton8);
        fab9 = findViewById(R.id.floatingActionButton9);
        fab10 = findViewById(R.id.floatingActionButton10);
        fab11 = findViewById(R.id.floatingActionButton11);
        fab12 = findViewById(R.id.floatingActionButton12);
        fab13 = findViewById(R.id.floatingActionButton13);
        fab14 = findViewById(R.id.floatingActionButton14);
        fab15 = findViewById(R.id.floatingActionButton15);
        fab16 = findViewById(R.id.floatingActionButton16);
        fab17 = findViewById(R.id.floatingActionButton17);
        fab18 = findViewById(R.id.floatingActionButton18);
        text =  findViewById(R.id.editText);
        text2 =  findViewById(R.id.editText2);
        text23 =  findViewById(R.id.editText23);
        text24 =  findViewById(R.id.editText24);
        text25 =  findViewById(R.id.editText25);
        text26 =  findViewById(R.id.editText26);
        text27 =  findViewById(R.id.editText27);
        text28 =  findViewById(R.id.editText28);
        text29 =  findViewById(R.id.editText29);
        text31 =  findViewById(R.id.editText31);
        text30 =  findViewById(R.id.editText30);
        text32 =  findViewById(R.id.editText32);
        text33 =  findViewById(R.id.editText33);
        text34 =  findViewById(R.id.editText34);
        text35 =  findViewById(R.id.editText35);
        text36 =  findViewById(R.id.editText36);
        text37 =  findViewById(R.id.editText37);
        text38 =  findViewById(R.id.editText38);
        btn = findViewById(R.id.button2);

       // Log.d("Insert: ", "Inserting ..");
       // db.addRecipe(new Recipe("Cos","raz","dwa","marchewka,maslo"));
        //db.addRecipe(new Recipe("Cos1","raz","dwa","marchewka,banan,wafel"));
        //db.addRecipe(new Recipe("Cos2","raz","dwa","marchewka,banan"));

        Log.d("Reading: ", "Reading all recipes..");
        List<Recipe> recipeList = db.getAllRecipe();
        for(Recipe rc: recipeList){
            String log = "Id: " + rc.getId()+" ,Title: " + rc.getRecipeTitle() + " ,Description: " + rc.getDescription()
                    +" ,Category: " + rc.getCategory() + " ,Components: " + rc.getComponents();
            Log.d("Name: ", log);
        }

        fab.setOnClickListener(view -> {
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
        });

        fab4.setOnClickListener(view -> {
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);

        });

        fab6.setOnClickListener(view -> {
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
        });

        fab7.setOnClickListener(view -> {
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
        });

        fab8.setOnClickListener(view -> {
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
        });

        fab9.setOnClickListener(view -> {
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
        });

        fab10.setOnClickListener(view -> {
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
        });

        fab11.setOnClickListener(view -> {
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
        });

        fab12.setOnClickListener(view -> {
            fab13.setVisibility(View.VISIBLE);
            text32.setVisibility(View.VISIBLE);
        });

        fab13.setOnClickListener(view -> {
            fab14.setVisibility(View.VISIBLE);
            text33.setVisibility(View.VISIBLE);
        });

        fab14.setOnClickListener(view -> {
            fab15.setVisibility(View.VISIBLE);
            text34.setVisibility(View.VISIBLE);
        });

        fab15.setOnClickListener(view -> {
            fab16.setVisibility(View.VISIBLE);
            text35.setVisibility(View.VISIBLE);
        });

        fab16.setOnClickListener(view -> {
            fab17.setVisibility(View.VISIBLE);
            text36.setVisibility(View.VISIBLE);
        });

        fab17.setOnClickListener(view -> {
            fab18.setVisibility(View.VISIBLE);
            text37.setVisibility(View.VISIBLE);
        });

        fab18.setOnClickListener(view -> {
            text38.setVisibility(View.VISIBLE);
            txt38 = text38.getText().toString();

        });

        btn.setOnClickListener(view -> {
            txt23 = text23.getText().toString();
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            txt26 = text26.getText().toString();
            txt27 = text27.getText().toString();
            txt28 = text28.getText().toString();
            txt29 = text29.getText().toString();
            txt30 = text30.getText().toString();
            txt31 = text31.getText().toString();
            txt32 = text32.getText().toString();
            txt33 = text33.getText().toString();
            txt34 = text34.getText().toString();
            txt35 = text35.getText().toString();
            txt36 = text36.getText().toString();
            txt37 = text37.getText().toString();
            txt38 = text38.getText().toString();
            txt25 = text25.getText().toString();


            if(text.getText().toString().equals("")){
                Toast.makeText(this,"Recipe name cant be empty!",Toast.LENGTH_LONG).show();
                return;
            }else{
                txt = text.getText().toString();
            }
            if(text2.getText().toString().equals("")){
                Toast.makeText(this,"Description cant be empty!",Toast.LENGTH_LONG).show();
                return;
            }else{
                txt2 = text2.getText().toString();
            }
            if(!txt23.equals("")){
                component+=txt23;
                component+=",";
            }
            if(!txt24.equals("")){
                component+=txt24;
                component+=",";
            }
            if(!txt25.equals("")){
                component+=txt25;
                component+=",";
            }
            if(!txt26.equals("")){
                component+=txt26;
                component+=",";
            }
            if(!txt27.equals("")){
                component+=txt27;
                component+=",";
            }
            if(!txt28.equals("")){
                component+=txt28;
                component+=",";
            }
            if(!txt29.equals("")){
                component+=txt29;
                component+=",";
            }
            if(!txt30.equals("")){
                component+=txt30;
                component+=",";
            }
            if(!txt31.equals("")){
                component+=txt31;
                component+=",";
            }
            if(!txt32.equals("")){
                component+=txt32;
                component+=",";
            }
            if(!txt33.equals("")){
                component+=txt33;
                component+=",";
            }
            if(!txt34.equals("")){
                component+=txt34;
                component+=",";
            }
            if(!txt35.equals("")){
                component+=txt35;
                component+=",";
            }
            if(!txt36.equals("")){
                component+=txt36;
                component+=",";
            }
            if(!txt37.equals("")){
                component+=txt37;
                component+=",";
            }
            if(!txt38.equals("")){
                component+=txt38;
                component+=",";
            }
            component = component.substring(0,component.length()-1);

            db.addRecipe(new Recipe(txt,txt2,currentCategory,component));
            Toast.makeText(this, "Add new recipe: "+txt +" ,description: "+txt2
                    + " ,category:  " + currentCategory + " ,components: " + component, Toast.LENGTH_LONG).show();
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            case 0:
                currentCategory = Category.DESSERT.toString();
                break;
            case 1:
                currentCategory = Category.COURSE.toString();
                break;
            case 2:
                currentCategory = Category.BREAKFAST.toString();
                break;
            case 3:
                currentCategory = Category.DINNER.toString();
                break;
            case 4:
                currentCategory = Category.LUNCH.toString();
                break;
            case 5:
                currentCategory = Category.SUPPER.toString();
                break;
            case 6:
                currentCategory = Category.SIDEDISH.toString();
                break;
            case 7:
                currentCategory = Category.SOUP.toString();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}


