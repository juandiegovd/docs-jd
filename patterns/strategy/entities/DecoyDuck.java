package patterns.strategy.entities;

import patterns.strategy.behaviors.FlyNoWay;
import patterns.strategy.behaviors.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
