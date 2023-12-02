package patterns.abstractfactory.creators;

import patterns.abstractfactory.factories.ChicagoPizzaIngredientFactory;
import patterns.abstractfactory.factories.PizzaIngredientFactory;
import patterns.abstractfactory.products.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if ("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if ("pepperoni".equals(type)){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        else if ("veggies".equals(type)){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        else if ("clams".equals(type)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clams Pizza");
        }
        return pizza;
    }
}
