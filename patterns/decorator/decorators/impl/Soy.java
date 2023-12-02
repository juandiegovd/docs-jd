package patterns.decorator.decorators.impl;

import patterns.decorator.components.Beverage;
import patterns.decorator.decorators.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
