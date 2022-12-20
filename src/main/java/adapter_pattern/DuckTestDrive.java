package adapter_pattern;

import adapter_pattern.adapter.TurkeyAdapter;
import adapter_pattern.client.Duck;
import adapter_pattern.client.MallardDuck;
import adapter_pattern.client.Turkey;
import adapter_pattern.client.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조");
        turkey.gobble();
        turkey.fly();

        System.out.println("오리");
        duck.quack();
        duck.fly();

        System.out.println("칠면조 오리");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
