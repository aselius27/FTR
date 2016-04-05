package com.example.aseli_000.ftr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CheckBox Bread = (CheckBox) findViewById(R.id.bread);
        CheckBox Eggs = (CheckBox) findViewById(R.id.eggs);
        CheckBox milk = (CheckBox) findViewById(R.id.milk);
        CheckBox cheese = (CheckBox) findViewById(R.id.cheese);
        CheckBox chicken = (CheckBox) findViewById(R.id.chicken);
        CheckBox beef = (CheckBox) findViewById(R.id.beef);
        CheckBox pork = (CheckBox) findViewById(R.id.pork);
        CheckBox salad = (CheckBox) findViewById(R.id.salad);
        CheckBox fruit = (CheckBox) findViewById(R.id.fruit);
        CheckBox vegetables = (CheckBox) findViewById(R.id.vegetables);
        Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
            }

        });

    }

}
