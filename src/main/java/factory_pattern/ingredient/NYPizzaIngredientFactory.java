package factory_pattern.ingredient;

import factory_pattern.ingredient.cheese.Cheese;
import factory_pattern.ingredient.cheese.ReggianoCheese;
import factory_pattern.ingredient.clam.Clams;
import factory_pattern.ingredient.clam.FreshClams;
import factory_pattern.ingredient.dough.Dough;
import factory_pattern.ingredient.dough.ThinCrustDough;
import factory_pattern.ingredient.pepperoni.Pepperoni;
import factory_pattern.ingredient.pepperoni.SlicedPepperoni;
import factory_pattern.ingredient.sauce.MarinaraSauce;
import factory_pattern.ingredient.sauce.Sauce;
import factory_pattern.ingredient.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
