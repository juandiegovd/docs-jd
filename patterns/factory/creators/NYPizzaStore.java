package patterns.factory.creators;

import patterns.factory.products.NYStyleCheesePizza;
import patterns.factory.products.NYStylePepperoniPizza;
import patterns.factory.products.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }
        else if ("pepperoni".equals(type)){
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
