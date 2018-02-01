package com.example.blazej.projekt;

import android.app.Application;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static android.widget.Toast.LENGTH_LONG;
import static java.lang.Integer.*;

public class ShowAllRecipes extends AppCompatActivity {

    HashMap<Integer, Integer> indexList = new HashMap<>();
    int index = 1;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_recipes);

        DatabaseHandler db = new DatabaseHandler(this);

        ListView listView = findViewById(R.id.list);
        Cursor data = db.getRecipeList();
        ArrayList<String> theList = new ArrayList<>();
        ArrayList<Integer> theList1 = new ArrayList<>();
        if (data.getCount() == 0) {
            Toast.makeText(this, "There are no recipes in this list!", LENGTH_LONG).show();
        } else{
            while(data.moveToNext()){
                theList1.add(valueOf(data.getString(0)));
                indexList.put(index,valueOf(data.getString(0)));
                theList.add(data.getString(1));
                listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,theList);
                listView.setAdapter(listAdapter);
                index++;
            }
        }

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            view.setSelected(true);

            int selectedID = findIdByIndex(i+1);
            String id = String.valueOf(selectedID);
            Intent k = new Intent(getBaseContext(), SelectedRecipeInfo.class);
            k.putExtra("EXTRA",id);
            startActivity(k);

        });
    }
    public int findIdByIndex(int index){
        return indexList.get(index);
    }

}
