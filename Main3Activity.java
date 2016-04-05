package com.example.aseli_000.ftr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CheckBox Vegetarian = (CheckBox) findViewById(R.id.vegetarian);
        CheckBox diabetic = (CheckBox) findViewById(R.id.diabetic);
        CheckBox GF = (CheckBox) findViewById(R.id.GF);
        CheckBox Nut = (CheckBox) findViewById(R.id.NF);
        CheckBox Religion = (CheckBox) findViewById(R.id.religion);
        CheckBox LS = (CheckBox) findViewById(R.id.LS);
        CheckBox HF = (CheckBox) findViewById(R.id.HF);

        Button finish = (Button) findViewById(R.id.fin);

        /*finish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main3Activity.this, Ingredients.class));
            }

        });*/
    }

}
