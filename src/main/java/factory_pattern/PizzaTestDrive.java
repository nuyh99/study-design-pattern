package factory_pattern;

import factory_pattern.pizza.Pizza;
import factory_pattern.store.NYPizzaStore;
import factory_pattern.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("pizza = " + pizza.getName());

        System.out.println("------------------------");
    }
}
