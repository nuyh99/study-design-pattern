package singleton_pattern;

public class MainTest {
    public static void main(String[] args) {
        SingletonChocolateBoiler.INSTANCE.fill();
        System.out.println(SingletonChocolateBoiler.INSTANCE.isEmpty());
        System.out.println(SingletonChocolateBoiler.INSTANCE2.isEmpty());
    }
}
