package patterns.abstractfactory.products;

import patterns.abstractfactory.ingredients.Pepperoni;
import patterns.abstractfactory.ingredients.cheese.Cheese;
import patterns.abstractfactory.ingredients.clams.Clams;
import patterns.abstractfactory.ingredients.dough.Dough;
import patterns.abstractfactory.ingredients.sauce.Sauce;
import patterns.abstractfactory.ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
