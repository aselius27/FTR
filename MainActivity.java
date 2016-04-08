package com.example.aseli_000.foodtorecipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         //calories
       // TextView textView6 = (TextView) findViewById(R.id.textView6);

//GlobalVars g = (GlobalVars) getApplication();





       // textView6.setText(meal);
       // String m = "";
       // m += meal;
        //Log.d("meal", m);
        // g.setCalories(Integer.parseInt(calories.getText().toString()));

        Button next = (Button) findViewById(R.id.NextButton);
      //  System.out.println(g.getCalories());
        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Globals g = Globals.getInstance();
                RadioGroup meals = (RadioGroup) findViewById(R.id.meals);
                RadioButton breakfast = (RadioButton) findViewById(R.id.bkfst);
                RadioButton lunch = (RadioButton) findViewById(R.id.lunch);
                RadioButton dinner = (RadioButton) findViewById(R.id.dnr);
                EditText calories = (EditText) findViewById(R.id.cals);
                CheckBox noCal = (CheckBox) findViewById(R.id.NoCal); //no calorie limit
                int meal = 0; //what meal is selected (breakfast by default)
                boolean nC = false;
                int Calories;
                if(noCal.isChecked()){
                    nC = true;
                     Calories = -1;
                }else {
                    Calories = Integer.parseInt(calories.getText().toString());
                }



                    g.setCalories(Calories);
                    System.out.println("Calories " + Calories);

                if (breakfast.isChecked()) {
                    meal = 1;
                }
                if (lunch.isChecked()) {
                    meal = 2;
                    //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + meal);
                }
                if (dinner.isChecked()) {
                    meal = 3;
                    //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + meal);
                }
                g.setMeals(meal);
                meal = g.getMeals();
                g.setNoCal(nC);
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + meal);

                System.out.println("noCal" + g.getNoCal());
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }

        });
    }

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
