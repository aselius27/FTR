package com.example.aseli_000.ftr;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by Aseli_000 on 4/5/2016.
 */
public class FTRapp extends Application {
    private static FTRapp singleton;
    private boolean noCal;
    private int meal;
    private ArrayList<String> ingredients;
    private ArrayList<String> restrictions;
private int calories;
    public FTRapp getInstance(){
        return singleton;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
public void setCalories(int calories){
    this.calories = calories;
}
    public void setNoCal(boolean noCal){
        this.noCal = noCal;
    }
    public void setMeal(int meal){
        this.meal = meal;
    }
    public void setIngredients(ArrayList<String> ingredients){
        this.ingredients = ingredients;
    }
    public void setRestrictions(ArrayList<String> restrictions){
        this.restrictions = restrictions;
    }

}
