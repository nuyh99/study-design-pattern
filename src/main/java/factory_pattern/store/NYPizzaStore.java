package factory_pattern.store;

import factory_pattern.ingredient.NYPizzaIngredientFactory;
import factory_pattern.ingredient.PizzaIngredientFactory;
import factory_pattern.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        
        if(type.equals("cheese")) {
            CheesePizza cheesePizza = new CheesePizza(ingredientFactory);
            cheesePizza.setName("뉴욕 스타일 치즈 피자");
            return cheesePizza;
        }
        if(type.equals("clam")) {
            ClamPizza clamPizza = new ClamPizza(ingredientFactory);
            clamPizza.setName("뉴욕 스타일 조개 피자");
            return clamPizza;
        }

        return null;
    }
}
