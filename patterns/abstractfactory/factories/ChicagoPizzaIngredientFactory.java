package patterns.abstractfactory.factories;

import patterns.abstractfactory.ingredients.Pepperoni;
import patterns.abstractfactory.ingredients.cheese.Cheese;
import patterns.abstractfactory.ingredients.cheese.MozzarellaCheese;
import patterns.abstractfactory.ingredients.clams.Clams;
import patterns.abstractfactory.ingredients.clams.FrozenClams;
import patterns.abstractfactory.ingredients.dough.Dough;
import patterns.abstractfactory.ingredients.dough.ThickCrustDough;
import patterns.abstractfactory.ingredients.sauce.PlumTomatoSauce;
import patterns.abstractfactory.ingredients.sauce.Sauce;
import patterns.abstractfactory.ingredients.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Oregano(), new EggPlant(), new Spinach(), new BlackOlives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
