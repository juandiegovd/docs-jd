package patterns.decorator.decorators.impl;

import patterns.decorator.components.Beverage;
import patterns.decorator.decorators.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
