package strategy_pattern;

import strategy_pattern.duck.Duck;
import strategy_pattern.duck.MallardDuck;
import strategy_pattern.duck.ModelDuck;
import strategy_pattern.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.perfromQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
