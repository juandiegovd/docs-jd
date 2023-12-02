package patterns.decorator.decorators.impl;

import patterns.decorator.components.Beverage;
import patterns.decorator.decorators.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
