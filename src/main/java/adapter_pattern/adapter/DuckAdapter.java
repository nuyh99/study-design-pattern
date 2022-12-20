package adapter_pattern.adapter;

import adapter_pattern.client.Duck;
import adapter_pattern.client.Turkey;

public class DuckAdapter implements Turkey {
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
