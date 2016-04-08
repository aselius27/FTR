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

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button next = (Button) findViewById(R.id.nxt);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Globals g = Globals.getInstance();
boolean isEggs = false;
                boolean isChicken = false;
                boolean isBeef = false;
                boolean isVeggies = false;
                ArrayList<String> ingredients = new ArrayList<String>();
                //CheckBox Bread = (CheckBox) findViewById(R.id.bread); if(Bread.isChecked()) ingredients.add("bread");
                CheckBox Eggs = (CheckBox) findViewById(R.id.eggs);
                if (Eggs.isChecked()) isEggs = true;
               // CheckBox milk = (CheckBox) findViewById(R.id.milk); if(milk.isChecked()) ingredients.add("milk");
                //CheckBox cheese = (CheckBox) findViewById(R.id.cheese); if(cheese.isChecked()) ingredients.add("cheese");
                CheckBox chicken = (CheckBox) findViewById(R.id.chicken); if(chicken.isChecked()) isChicken = true;
                CheckBox beef = (CheckBox) findViewById(R.id.beef); if(beef.isChecked()) isBeef = true;
                //CheckBox pork = (CheckBox) findViewById(R.id.pork); if(pork.isChecked()) ingredients.add("pork");
               // CheckBox salad = (CheckBox) findViewById(R.id.salad); if(salad.isChecked()) ingredients.add("salad");
               // CheckBox fruit = (CheckBox) findViewById(R.id.fruit); if(fruit.isChecked()) ingredients.add("fruit");
                CheckBox vegetables = (CheckBox) findViewById(R.id.vegetables); if(vegetables.isChecked()) isVeggies = true;

                g.setRecipes(isEggs, isVeggies, isBeef, isChicken);
                System.out.println("IIIIIIIIIIIII " + g.getRecipes());

                startActivity(new Intent(Main2Activity.this, Main22Activity.class));
            }

        });

    }

}
