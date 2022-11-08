package factory_pattern.pizza;

import factory_pattern.ingredient.cheese.Cheese;
import factory_pattern.ingredient.clam.Clams;
import factory_pattern.ingredient.dough.Dough;
import factory_pattern.ingredient.pepperoni.Pepperoni;
import factory_pattern.ingredient.sauce.Sauce;
import factory_pattern.ingredient.veggie.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String name;

    private Dough dough;
    private Sauce sauce;
    private Veggies[] veggies;
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clam;

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClam() {
        return clam;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    private final List<String> toppings = new ArrayList<>();

    public abstract void prepare();
    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
