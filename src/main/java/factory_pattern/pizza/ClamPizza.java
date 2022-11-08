package factory_pattern.pizza;

import factory_pattern.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중: "+getName());
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setClam(pizzaIngredientFactory.createClam());
    }
}
