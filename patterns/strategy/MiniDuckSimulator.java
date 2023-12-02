package patterns.strategy;

import patterns.strategy.entities.DecoyDuck;
import patterns.strategy.entities.Duck;
import patterns.strategy.entities.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new DecoyDuck();
        model.performFly();
        model.performQuack();
    }
}
