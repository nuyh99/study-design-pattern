package singleton_pattern;

public enum SingletonChocolateBoiler {
    INSTANCE, INSTANCE2, INSTANCE3;

    private boolean empty;
    private boolean boiled;

    SingletonChocolateBoiler() {
        empty=true;
        boiled=false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty=false;
            boiled=false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled())
            empty=true;
    }

    public void boil() {
        if(!isEmpty() && !isBoiled())
            boiled=true;
    }
}
