package patterns.abstractfactory.products;

import patterns.abstractfactory.factories.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.pizzaIngredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
