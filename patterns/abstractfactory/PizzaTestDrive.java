package patterns.abstractfactory;

import patterns.abstractfactory.creators.ChicagoPizzaStore;
import patterns.abstractfactory.creators.NYPizzaStore;
import patterns.abstractfactory.creators.PizzaStore;
import patterns.abstractfactory.products.Pizza;

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
