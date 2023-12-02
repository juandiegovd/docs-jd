package patterns.decorator.components.impl;

import patterns.decorator.components.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        this.description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
