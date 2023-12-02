package patterns.factory.products;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Sauce and Pepperoni Pizza";
        dough = "Thick Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Pepperoni");
    }
}
