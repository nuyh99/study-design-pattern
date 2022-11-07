package strategy_pattern.duck;

import strategy_pattern.fly.FlyNoWay;
import strategy_pattern.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니당");
    }
}
