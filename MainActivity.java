package com.example.aseli_000.ftr;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
FTRapp ftr = new FTRapp();
   // TextView totalTextView;
    EditText calories; //calories
int meal = 1;
    boolean nC = false;
    int Calories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        //variables and buttons
        //int meal = 1; //what meal is selected (breakfast by default)
        RadioGroup meals = (RadioGroup) findViewById(R.id.meals);
        RadioButton breakfast = (RadioButton) findViewById(R.id.bkfst);
        RadioButton lunch = (RadioButton) findViewById(R.id.lunch);
        RadioButton dinner = (RadioButton) findViewById(R.id.dnr);

        if(breakfast.isChecked()){
            meal = 1;
        }
        if(lunch.isChecked()){
            meal = 2;
        }
        if(dinner.isChecked()){
            meal = 3;
        }
        calories = (EditText) findViewById(R.id.cals);
        Calories = Integer.parseInt(calories.toString());
        CheckBox noCal = (CheckBox) findViewById(R.id.NoCal); //no calorie limit

        if(noCal.isChecked()) nC = true;
        Button next = (Button) findViewById(R.id.NextButton);
        ftr.setCalories(Calories);
        ftr.setNoCal(nC);
        ftr.setMeal(meal);

        next.setOnClickListener(new View.OnClickListener(){

            @Override
                    public void onClick(View view) {
                /*Intent dataPass = new Intent(MainActivity.this, Main2Activity.class);
                dataPass.putExtra("meal", meal);
                dataPass.putExtra("calories", Calories);
                dataPass.putExtra("noCal", nC);*/
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }

            });
        }



    @Nullable
    //@Override


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
