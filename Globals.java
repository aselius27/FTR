package com.example.aseli_000.foodtorecipe;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Aseli_000 on 4/6/2016.
 */
public class Globals {
    private static Globals ourInstance = new Globals();

    public static Globals getInstance() {
        return ourInstance;
    }

    private Globals() {
    }

  private int meals;

    public void setMeals(int meals){
        this.meals = meals;
    }
    public int getMeals(){
        return this.meals;
    }
    private int calories;
    public void setCalories(int calories){
        this.calories = calories;
    }
    public int getCalories(){
        return calories;
    }

    private boolean noCal;
    public void setNoCal(boolean noCal){
        this.noCal = noCal;
    }
    public boolean getNoCal(){
        return noCal;
    }

    private boolean isEggs;
    public void setIsEggs(boolean isEggs){
        this.isEggs = isEggs;
    }
    public boolean getIsEggs(){
        return isEggs;
    }

    private boolean isChicken;
    public void setIsChicken(boolean isEChicken){
        this.isChicken = isChicken;
    }
    public boolean getIsChicken(){
        return isChicken;
    }

    private boolean isBeef;
    public void setIsBeef(boolean isBeef){
        this.isBeef = isBeef;
    }
    public boolean getIsBeef(){
        return isBeef;
    }

    private boolean isVeggies;
    public void setIsVeggies(boolean isVeggies){
        this.isVeggies = isVeggies;
    }
    public boolean getIsVeggies(){
        return isVeggies;
    }
    String burger = "Beef Burger:\n Calories: 500" + "\nIngredients:\n\n" + "1 egg, 1/2 teaspoon of salt, 1/2lb ground beef.\nSteps\n\n" + "1. Preheat grill.\n" + "2. Whisk egg and salt in bowl. Mix in beef.\n" + "3. Place patties on grill and cover for 6-8 minutes.";
    String stew = "Beef Stew:\n Calories: 450" + "\nIngredients:\n\n" + "1 potato, 4 teaspoons of salt, 1/2lb ground beef." + "\nSteps\n\n" + "\n" + "1. Preheat grill.\n" + "2. Chop potato and salt in bowl. Mix in beef.\n" + "3. Place patties on grill and cover for 6-8 minutes.";
    String tender = "Pork Tenderloin:\n Calories: 700" + "\nIngredients:\n" + "\n" + "1 egg, 1/2 teaspoon of salt, 1/2lb pork.\nSteps\n" + "\n" + "1. Preheat grill.\n" + "2. Whisk egg and salt in bowl. Mix in pork.\n" + "3. Place tenderloin on grill and cover for 15-20 minutes.";

    String om = "Egg and cheese omelette:\n Calories: 400" + "\nIngredients:\n" + "\n" + "3 eggs, 1/2 teaspoon of salt, 2ts cheddar cheese.\nSteps\n" + "\n" + "1. Preheat pan.\n" + "2. Whisk eggs and salt in bowl. Mix in cheese.\n" + "3. Place mixture in pan and cook for 2-3 minutes.";
    String scrambled = "Scrambled Eggs:\n Calories: 350" + "\nIngredients:\n" + "\n" + "3 eggs, 1/2 teaspoon of salt, 2ts cheddar cheese.\nSteps\n" + "\n" + "1. Preheat pan.\n" + "2. Whisk eggs and salt in bowl. Mix in cheese.\n" + "3. Place mixture in pan and cook for 2-3 minutes.";
    String fri = "Egg Frittata:\n Calories: 600" + "\nIngredients:\n" + "\n" + "3 eggs, 1/2 teaspoon of salt, 2ts cheddar cheese.\nSteps\n" + "\n" + "1. Preheat pan.\n" + "2. Whisk eggs and salt in bowl. Mix in cheese.\n" + "3. Place mixture in pan and cook for 10-15 minutes.";

    String cutlet = "Chicken cutlet:\n Calories: 500" + "\nIngredients:\n" + "\n" + "3 breasts of chicken, 1 egg, 1/2 teaspoon of salt, 3/4tsp of pepper, Breadcrumbs.\nSteps\n" + "\n" + "1. Preheat pan.\n" + "2. Whisk eggs and salt in bowl. Cover chicken w/ mixture and add breadcrumbs.\n" + "3. Place chicken in pan and cook for 5-7 minutes.";
    String bst = "Grilled chicken breast:\n Calories: 400" + "\nIngredients:\n" + "\n" + "3 chicken breasts, 2 teaspoon of salt, 3/4tsp of pepper, lemon.\nSteps\n" + "\n" + "1. Preheat pan.\n" + "2. Season chicken w/ salt/pepper and add lemon juice.\n" + "3. Place chicken on grill and cook for 5-7 minutes.";
    String roast = "Rotisserie:\n Calories: 800" + "\nIngredients:\n" + "\n" + "Whole chicken, 1 egg, 1/2 teaspoon of salt, 3/4tsp of pepper, Breadcrumbs.\nSteps\n" + "\n" + "1. Preheat pan.\n" + "2. Whisk eggs and salt in bowl. Cover chicken w/ mixture and add breadcrumbs.\n" + "3. Place chicken in pan and cook for 5-7 minutes.";

    String cucsld = "Cucumber salad:\n Calories: 200" + "\nIngredients:\n" + "\n" + "2 cucumbers, 1/2lb salad.\nSteps\n" + "\n" + "1. Chop up cucumber.\n" + "2. Mix cucumber and salad.\n" + "3. Add dressing as desired.";
    String Chksld = "Chicken salad:\n Calories: 250" + "\nIngredients:\n" + "\n" + "2 cucumbers, 1/2lb salad, 1 chicken breast\nSteps\n" + "\n" + "1. Chop up cucumber, grill chicken.\n" + "2. Mix cucumber, chicken, and salad.\n" + "3. Add dressing as desired.";
    String veg = "Vegetable medley:\n Calories: 200" + "\nIngredients:\n" + "\n" + "Carrots, asparagus, peas, bell peppers.\nSteps\n" + "\n" + "1. Chop up vegetables.\n" + "2. Mix vegetables in dish.\n" + "3. Cook for 20 minutes";


    ArrayList<String> beef= new ArrayList<String>(Arrays.asList(burger, stew, tender));
    ArrayList<String> eggs = new ArrayList<String>(Arrays.asList(om, scrambled, fri));
    ArrayList<String> veggies = new ArrayList<String>(Arrays.asList(cucsld, Chksld, veg));
    ArrayList<String> chicken = new ArrayList<String>(Arrays.asList(cutlet, bst, roast));
    public ArrayList<String> recipes = new ArrayList<String>();
    public void setRecipes(boolean isEggs, boolean isVeggies, boolean isBeef, boolean isChicken){
        if(isBeef) recipes = beef;
        if(isEggs) recipes = eggs;
        if(isChicken) recipes = chicken;
                if(isVeggies) recipes = veggies;
    }
    public void setRestrictions(boolean isGF, boolean isLS, boolean isRel) {
if(isGF) {
    recipes.remove(0);
    recipes.remove(0);
}
        if(isLS) {
            recipes.remove(1);
            recipes.remove(1);
        }
        if(isRel) {
            recipes.remove(0);
recipes.remove(1);
        }
        if(calories <= 500 && isBeef){ recipes.remove(2);
        }


}


    public ArrayList<String> getRecipes(){
        return recipes;
    }



    /*private ArrayList<String> ingredients;
    public void setIngredients(ArrayList<String> ingredients){
        this.ingredients = ingredients;
    }
    public ArrayList<String> getIngredients(){
        return ingredients;
    }

    private ArrayList<String> restrictions;
    public void setRestrictions(ArrayList<String> restrictions){
        this.restrictions = restrictions;
    }
    public ArrayList<String> getRestrictions(){
        return restrictions;
    }
    public ArrayList<String> recipes = new ArrayList<String>();
public void setRecipes(ArrayList<String> ingredients, ArrayList<String> restrictions){
   ArrayList<String> eggs = new ArrayList<String> (Arrays.asList("Egg and Cheese Omelette", "Egg Frittata", "Hollandaise Sauce", "Fried Eggs",  "Scrambled Eggs", "Egg in a Frame"));
    ArrayList<String> chickenVeggies = new ArrayList<String>(Arrays.asList("Chicken Cutlet", "Vegetarian Cucumber Salad"));
    if(ingredients.contains("eggs")){
        recipes.equals(eggs);
    }
    if(ingredients.contains("chicken")) {
        recipes.equals(chickenVeggies);
        if(restrictions.contains("Vegetarian")){
            recipes.remove(0);
        }
    }

}
    public ArrayList<String> getRecipes(){
        return recipes;
    }*/
    //public String rec;


}
