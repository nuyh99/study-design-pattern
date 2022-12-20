package composite_pattern;

public class MenuItem extends MenuComponent {

    String name;
    String decription;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String decription, boolean vegetarian, double price) {
        this.name = name;
        this.decription = decription;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDecription() {
        return decription;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(getName());
        if(isVegetarian())
            System.out.println("(v)");
        System.out.println(", "+getPrice());
        System.out.println("    --- "+getDecription());
    }
}
