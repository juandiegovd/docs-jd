package patterns.abstractfactory.products;

import patterns.abstractfactory.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.pizzaIngredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
