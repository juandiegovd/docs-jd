package patterns.strategy.entities;

import patterns.strategy.behaviors.FlyWithWings;
import patterns.strategy.behaviors.Quack;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a redhead duck");
    }
}
