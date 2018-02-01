package com.example.blazej.projekt;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.ads.mediation.customevent.CustomEventAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.Integer.valueOf;

public class VoiceResult extends AppCompatActivity {

    String[] results;
    int index = 1;
    HashMap<Integer,Integer> indexList = new HashMap<>();
    ListAdapter listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_result);
        ListView listView = findViewById(R.id.listView2);
        DatabaseHandler db = new DatabaseHandler(this);
        String result = getIntent().getStringExtra("EXTRA1");
        results = result.split(",");
        List<Integer> sortedIdsList = findMaches(results);
        ArrayList<String> theList = new ArrayList<>();

        for(Integer id: sortedIdsList){
              indexList.put(index,id);
              theList.add(db.getRecipeTitle(id));
              listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,theList);
              listView.setAdapter(listAdapter);
              index++;
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
    public List<Integer> findMaches(String[] results) {

        HashMap<Integer, Integer> outputList = new HashMap<>();
        HashMap<Integer, String> indexList = new HashMap<>();
        DatabaseHandler db = new DatabaseHandler(this);
        Cursor data = db.getRecipeList();
        while (data.moveToNext()) {
            indexList.put(valueOf(data.getString(0)), data.getString(4));
        }
        for (Map.Entry me : indexList.entrySet()) {
            int sameMatches = 0;
            for (int i = 0; i < results.length; i++) {

                Boolean found = Arrays.asList(me.getValue().toString().split(",")).contains(results[i]);
                if (found) {
                    sameMatches++;
                }
            }
            if(sameMatches!=0) {
                outputList.put(Integer.valueOf(me.getKey().toString()), sameMatches);
            }
        }
        HashMap<Integer, Integer> tmpMap = new HashMap<>();
        tmpMap = sortByValue(outputList);
        List<Integer> idsList = new ArrayList<>();
        for(Map.Entry tmp: tmpMap.entrySet()){
            idsList.add((Integer.valueOf(tmp.getKey().toString())));
        }
        return idsList;

    }

    private HashMap<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap) {
        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<>(unsortMap.entrySet());

        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        HashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}