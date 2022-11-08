package factory_pattern.ingredient;

import factory_pattern.ingredient.cheese.Cheese;
import factory_pattern.ingredient.clam.Clams;
import factory_pattern.ingredient.dough.Dough;
import factory_pattern.ingredient.pepperoni.Pepperoni;
import factory_pattern.ingredient.sauce.Sauce;
import factory_pattern.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
