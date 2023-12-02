package patterns.factory.creators;

import patterns.factory.products.ChicagoStyleCheesePizza;
import patterns.factory.products.ChicagoStylePepperoniPizza;
import patterns.factory.products.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }
        else if ("pepperoni".equals(type)){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
