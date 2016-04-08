package com.example.aseli_000.foodtorecipe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main23Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Globals g = Globals.getInstance();
        ArrayList<String> recipes = g.getRecipes();
        String[] r = new String[recipes.size()];
        for(int i = 0; i< recipes.size(); i++){
            r[i] = recipes.get(i);
        }
        ListAdapter adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, r);

        ListView Recipes = (ListView) findViewById(R.id.recipes);
//String rec = g.getRec();
        Recipes.setAdapter(adapt);
        Recipes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Globals g = Globals.getInstance();
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//if(g.getIsBeef()){

//}
            }
        });

    }

}
