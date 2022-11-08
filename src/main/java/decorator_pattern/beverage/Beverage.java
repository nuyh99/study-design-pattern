package decorator_pattern.beverage;

public abstract class Beverage {
    enum Size{TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String description = "";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
