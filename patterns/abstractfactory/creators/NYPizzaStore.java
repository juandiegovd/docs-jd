package patterns.abstractfactory.creators;

import patterns.abstractfactory.factories.NYPizzaIngredientFactory;
import patterns.abstractfactory.factories.PizzaIngredientFactory;
import patterns.abstractfactory.products.CheesePizza;
import patterns.abstractfactory.products.PepperoniPizza;
import patterns.abstractfactory.products.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if ("pepperoni".equals(type)){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
