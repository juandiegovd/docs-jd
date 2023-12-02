package patterns.factory;

import patterns.factory.creators.ChicagoPizzaStore;
import patterns.factory.creators.NYPizzaStore;
import patterns.factory.creators.PizzaStore;
import patterns.factory.products.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName());
    }
}
