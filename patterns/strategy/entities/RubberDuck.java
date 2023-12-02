package patterns.strategy.entities;

import patterns.strategy.behaviors.FlyNoWay;
import patterns.strategy.behaviors.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
