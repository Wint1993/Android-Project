package com.example.blazej.projekt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Blazej on 15.01.2018.
 */

public class EditRecipe extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String currentCategory;
    private static final String[] items = Category.getCategory(Category.class);
    FloatingActionButton fab,fab4,fab6,fab7,fab8,fab9,fab10,fab11,fab12,fab13,fab14,fab15,fab16,fab17,fab18;
    EditText text,text2,text23,text24,text25,text26,text27,text28,text29,text31,text30,text32,text33,text34,text35,text36,text37,text38;
    String txt,txt2,txt23,txt24,txt25,txt26,txt27,txt28,txt29,txt31,txt30,txt32,txt33,txt34,txt35,txt36,txt37,txt38 = "";
    Button btn;
    int countComponents;
    int id;
    String component = "";

    public int findCategoryPosition(String name){
        int index=0;
        boolean flag = false;
        for(int i=0;i<items.length;i++){
            if(name.contains(items[i])){
                flag = true;
                index = i;
            }
        }
        return index;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_recipe);

        DatabaseHandler db = new DatabaseHandler(this);
        id = Integer.valueOf(getIntent().getStringExtra("EXTRA3"));

        Recipe rec = db.getRecipe(id);
        countComponents = countRecipeComponents(rec);

        final Spinner dropdown = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(EditRecipe.this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(this);
        dropdown.setSelection(findCategoryPosition(rec.getCategory()));

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



        text.setText(rec.getRecipeTitle());
        text2.setText(rec.getDescription());
        String tmp[] = rec.getComponents().split(",");


        if(countComponents == 1){
            txt23 = text23.getText().toString();
            text23.setText(tmp[0]);
        }
        if(countComponents == 2){
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);

        }
        if(countComponents == 3){
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();

            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt25 = text25.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);

        }
        if(countComponents == 4){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();

            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt25 = text25.getText().toString();

            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);

        }
        if(countComponents == 5){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);

            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();

            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();

            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
        }
        if(countComponents == 6){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);

            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
        }
        if(countComponents == 7){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
        }
        if(countComponents == 8){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
        }
        if(countComponents == 9){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
            txt30 = text30.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
            text30.setText(tmp[8]);
        }
        if(countComponents == 10){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
            txt30 = text30.getText().toString();
            fab13.setVisibility(View.VISIBLE);
            text32.setVisibility(View.VISIBLE);
            txt32 = text32.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
            text30.setText(tmp[8]);
            text32.setText(tmp[9]);
        }
        if(countComponents == 11){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
            txt30 = text30.getText().toString();
            fab13.setVisibility(View.VISIBLE);
            text32.setVisibility(View.VISIBLE);
            txt32 = text32.getText().toString();
            fab14.setVisibility(View.VISIBLE);
            text33.setVisibility(View.VISIBLE);
            txt33 = text33.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
            text30.setText(tmp[8]);
            text32.setText(tmp[9]);
            text33.setText(tmp[10]);

        }
        if(countComponents == 12){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
            txt30 = text30.getText().toString();
            fab13.setVisibility(View.VISIBLE);
            text32.setVisibility(View.VISIBLE);
            txt32 = text32.getText().toString();
            fab14.setVisibility(View.VISIBLE);
            text33.setVisibility(View.VISIBLE);
            txt33 = text33.getText().toString();
            fab15.setVisibility(View.VISIBLE);
            text34.setVisibility(View.VISIBLE);
            txt34 = text34.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
            text30.setText(tmp[8]);
            text32.setText(tmp[9]);
            text33.setText(tmp[10]);
            text34.setText(tmp[11]);
        }
        if(countComponents == 13){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
            txt30 = text30.getText().toString();
            fab13.setVisibility(View.VISIBLE);
            text32.setVisibility(View.VISIBLE);
            txt32 = text32.getText().toString();
            fab14.setVisibility(View.VISIBLE);
            text33.setVisibility(View.VISIBLE);
            txt33 = text33.getText().toString();
            fab15.setVisibility(View.VISIBLE);
            text34.setVisibility(View.VISIBLE);
            txt34 = text34.getText().toString();
            fab16.setVisibility(View.VISIBLE);
            text35.setVisibility(View.VISIBLE);
            txt35 = text35.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
            text30.setText(tmp[8]);
            text32.setText(tmp[9]);
            text33.setText(tmp[10]);
            text34.setText(tmp[11]);
            text35.setText(tmp[12]);
        }
        if(countComponents == 14){//
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
            txt30 = text30.getText().toString();
            fab13.setVisibility(View.VISIBLE);
            text32.setVisibility(View.VISIBLE);
            txt32 = text32.getText().toString();
            fab14.setVisibility(View.VISIBLE);
            text33.setVisibility(View.VISIBLE);
            txt33 = text33.getText().toString();
            fab15.setVisibility(View.VISIBLE);
            text34.setVisibility(View.VISIBLE);
            txt34 = text34.getText().toString();
            fab16.setVisibility(View.VISIBLE);
            text35.setVisibility(View.VISIBLE);
            txt35 = text35.getText().toString();
            fab17.setVisibility(View.VISIBLE);
            text36.setVisibility(View.VISIBLE);
            txt36 = text36.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
            text30.setText(tmp[8]);
            text32.setText(tmp[9]);
            text33.setText(tmp[10]);
            text34.setText(tmp[11]);
            text35.setText(tmp[12]);
            text36.setText(tmp[13]);
        }
        if(countComponents == 15){
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
            txt30 = text30.getText().toString();
            fab13.setVisibility(View.VISIBLE);
            text32.setVisibility(View.VISIBLE);
            txt32 = text32.getText().toString();
            fab14.setVisibility(View.VISIBLE);
            text33.setVisibility(View.VISIBLE);
            txt33 = text33.getText().toString();
            fab15.setVisibility(View.VISIBLE);
            text34.setVisibility(View.VISIBLE);
            txt34 = text34.getText().toString();
            fab16.setVisibility(View.VISIBLE);
            text35.setVisibility(View.VISIBLE);
            txt35 = text35.getText().toString();
            fab17.setVisibility(View.VISIBLE);
            text36.setVisibility(View.VISIBLE);
            txt36 = text36.getText().toString();
            fab18.setVisibility(View.VISIBLE);
            text37.setVisibility(View.VISIBLE);
            txt37 = text37.getText().toString();
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
            text30.setText(tmp[8]);
            text32.setText(tmp[9]);
            text33.setText(tmp[10]);
            text34.setText(tmp[11]);
            text35.setText(tmp[12]);
            text36.setText(tmp[13]);
            text37.setText(tmp[14]);
        }
        if(countComponents == 16){
            fab4.setVisibility(View.VISIBLE);
            text24.setVisibility(View.VISIBLE);
            fab6.setVisibility(View.VISIBLE);
            text25.setVisibility(View.VISIBLE);
            txt24 = text24.getText().toString();
            txt25 = text25.getText().toString();
            fab7.setVisibility(View.VISIBLE);
            text26.setVisibility(View.VISIBLE);
            txt26 = text26.getText().toString();
            fab8.setVisibility(View.VISIBLE);
            text27.setVisibility(View.VISIBLE);
            txt27 = text27.getText().toString();
            fab9.setVisibility(View.VISIBLE);
            text28.setVisibility(View.VISIBLE);
            txt28 = text28.getText().toString();
            fab10.setVisibility(View.VISIBLE);
            text29.setVisibility(View.VISIBLE);
            txt29 = text29.getText().toString();
            fab11.setVisibility(View.VISIBLE);
            text31.setVisibility(View.VISIBLE);
            txt31 = text31.getText().toString();
            fab12.setVisibility(View.VISIBLE);
            text30.setVisibility(View.VISIBLE);
            txt30 = text30.getText().toString();
            fab13.setVisibility(View.VISIBLE);
            text32.setVisibility(View.VISIBLE);
            txt32 = text32.getText().toString();
            fab14.setVisibility(View.VISIBLE);
            text33.setVisibility(View.VISIBLE);
            txt33 = text33.getText().toString();
            fab15.setVisibility(View.VISIBLE);
            text34.setVisibility(View.VISIBLE);
            txt34 = text34.getText().toString();
            fab16.setVisibility(View.VISIBLE);
            text35.setVisibility(View.VISIBLE);
            txt35 = text35.getText().toString();
            fab17.setVisibility(View.VISIBLE);
            text36.setVisibility(View.VISIBLE);
            txt36 = text36.getText().toString();
            fab18.setVisibility(View.VISIBLE);
            text37.setVisibility(View.VISIBLE);
            txt37 = text37.getText().toString();
            text38.setVisibility(View.VISIBLE);
            text23.setText(tmp[0]);
            text24.setText(tmp[1]);
            text25.setText(tmp[2]);
            text26.setText(tmp[3]);
            text27.setText(tmp[4]);
            text28.setText(tmp[5]);
            text29.setText(tmp[6]);
            text31.setText(tmp[7]);
            text30.setText(tmp[8]);
            text32.setText(tmp[9]);
            text33.setText(tmp[10]);
            text34.setText(tmp[11]);
            text35.setText(tmp[12]);
            text36.setText(tmp[13]);
            text37.setText(tmp[14]);
            text38.setText(tmp[15]);

        }


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

            Recipe rec1 = new Recipe(rec.getId(),txt,txt2,currentCategory,component);
            db.updateRecipe(rec1);

            Toast.makeText(this,"Edit complete", Toast.LENGTH_LONG).show();
            Intent i = new Intent(getApplicationContext(), ShowAllRecipes.class);
            startActivity(i);
        });
    }

    public int countRecipeComponents(Recipe recipe){
        String components = recipe.getComponents();
        String lengthComp[] = components.split(",");
        return lengthComp.length;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
      //  String valueSelected =
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
