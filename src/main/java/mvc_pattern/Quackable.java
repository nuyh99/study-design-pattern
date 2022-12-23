package mvc_pattern;

import strategy_pattern.quack.Quack;

public interface Quackable extends QuackObservable {
    void quack();
}
