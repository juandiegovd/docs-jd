package patterns.decorator.decorators.impl;

import patterns.decorator.components.Beverage;
import patterns.decorator.decorators.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }
}
