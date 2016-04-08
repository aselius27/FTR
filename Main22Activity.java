package com.example.aseli_000.foodtorecipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Button finish = (Button) findViewById(R.id.fin);
        finish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                boolean isGF = false;
                boolean isLS = false;
                boolean isRel = false;
               // ArrayList<String> restrictions = new ArrayList<String>();
               // CheckBox Vegetarian = (CheckBox) findViewById(R.id.vegetarian); if(Vegetarian.isChecked()) restrictions.add("vegetarian");
                //CheckBox diabetic = (CheckBox) findViewById(R.id.diabetic); if(GF.isChecked()) restrictions.add("gluten free");
                CheckBox GF = (CheckBox) findViewById(R.id.GF); if(GF.isChecked()) isGF = true;
               // CheckBox Nut = (CheckBox) findViewById(R.id.NF); if(Nut.isChecked()) restrictions.add("nut free");
                CheckBox Religion = (CheckBox) findViewById(R.id.religion); if(Religion.isChecked()) isRel = true;
               // CheckBox Vegan = (CheckBox) findViewById(R.id.Vegan); if(Vegan.isChecked()) restrictions.add("Vegan");
                CheckBox LS = (CheckBox) findViewById(R.id.HF); if(LS.isChecked()) isLS = true;

                Globals g = Globals.getInstance();
               g.setRestrictions(isGF, isLS, isRel);
                System.out.println("RRRRRRRRRR" + g.getRecipes());
//g.setRecipes(g.getIngredients(), restrictions);
               // System.out.println("Recipes " + g.getRecipes());
                //g.setRec();
                //create the ArrayList of recipes that can be used
                startActivity(new Intent(Main22Activity.this, Main23Activity.class));
            }

        });
    }

}
