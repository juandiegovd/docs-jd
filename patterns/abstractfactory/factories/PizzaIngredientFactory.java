package patterns.abstractfactory.factories;

import patterns.abstractfactory.ingredients.*;
import patterns.abstractfactory.ingredients.cheese.Cheese;
import patterns.abstractfactory.ingredients.clams.Clams;
import patterns.abstractfactory.ingredients.dough.Dough;
import patterns.abstractfactory.ingredients.sauce.Sauce;
import patterns.abstractfactory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
}
