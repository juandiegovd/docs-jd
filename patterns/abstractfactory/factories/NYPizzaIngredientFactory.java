package patterns.abstractfactory.factories;

import patterns.abstractfactory.ingredients.*;
import patterns.abstractfactory.ingredients.cheese.Cheese;
import patterns.abstractfactory.ingredients.cheese.ReggianoCheese;
import patterns.abstractfactory.ingredients.clams.Clams;
import patterns.abstractfactory.ingredients.clams.FreshClams;
import patterns.abstractfactory.ingredients.dough.Dough;
import patterns.abstractfactory.ingredients.dough.ThinCrustDough;
import patterns.abstractfactory.ingredients.sauce.MarinaraSauce;
import patterns.abstractfactory.ingredients.sauce.Sauce;
import patterns.abstractfactory.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Mushroom(), new Onion(), new RedPeppers()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
