package factory_pattern.ingredient;

import factory_pattern.ingredient.cheese.Cheese;
import factory_pattern.ingredient.cheese.MozzarellaCheese;
import factory_pattern.ingredient.clam.Clams;
import factory_pattern.ingredient.clam.FrozenClams;
import factory_pattern.ingredient.dough.Dough;
import factory_pattern.ingredient.dough.ThickCrustDough;
import factory_pattern.ingredient.pepperoni.Pepperoni;
import factory_pattern.ingredient.pepperoni.SlicedPepperoni;
import factory_pattern.ingredient.sauce.PlumTomatoSauce;
import factory_pattern.ingredient.sauce.Sauce;
import factory_pattern.ingredient.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
