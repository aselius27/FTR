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

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
FTRapp ftr = new FTRapp();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<String> restrictions = new ArrayList<String>();

        CheckBox Vegetarian = (CheckBox) findViewById(R.id.vegetarian); if(Vegetarian.isChecked()) restrictions.add("vegetarian");
        CheckBox diabetic = (CheckBox) findViewById(R.id.diabetic); if(diabetic.isChecked()) restrictions.add("diabetic");
        CheckBox GF = (CheckBox) findViewById(R.id.GF); if(GF.isChecked()) restrictions.add("gluten free");
        CheckBox Nut = (CheckBox) findViewById(R.id.NF); if(Nut.isChecked()) restrictions.add("nut free");
        CheckBox Religion = (CheckBox) findViewById(R.id.religion); if(Religion.isChecked()) restrictions.add("religion");
        CheckBox LS = (CheckBox) findViewById(R.id.LS); if(LS.isChecked()) restrictions.add("Low Salt");
        CheckBox HF = (CheckBox) findViewById(R.id.HF); if(HF.isChecked()) restrictions.add("High Fiber");
ftr.setRestrictions(restrictions);

        Button finish = (Button) findViewById(R.id.fin);

        /*finish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main3Activity.this, Ingredients.class));
            }

        });*/
    }

}
