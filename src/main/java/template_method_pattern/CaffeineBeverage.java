package template_method_pattern;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    abstract void brew();

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }
}
