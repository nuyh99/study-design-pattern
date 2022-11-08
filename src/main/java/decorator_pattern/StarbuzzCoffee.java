package decorator_pattern;

import decorator_pattern.beverage.Beverage;
import decorator_pattern.beverage.DarkRoast;
import decorator_pattern.beverage.Espresso;
import decorator_pattern.beverage.HouseBlend;
import decorator_pattern.condiment.Mocha;
import decorator_pattern.condiment.Soy;
import decorator_pattern.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("beverage.getDescription() = " + beverage.getDescription());
        System.out.println("beverage.cost() = " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("beverage2.getDescription() = " + beverage2.getDescription());
        System.out.println("beverage2.cost() = " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("beverage3.getDescription() = " + beverage3.getDescription());
        System.out.println("beverage3.cost() = " + beverage3.cost());
    }
}
