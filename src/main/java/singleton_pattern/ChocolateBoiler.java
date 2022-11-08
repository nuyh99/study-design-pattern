package singleton_pattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = false;
        boiled = false;
    }

    /**
     * 아래와 같이 구현하면 멀티스레딩 환경에서 동시에 여러 인스턴스가 만들어질 수 있다.
     * 1. uniqueInstance를 애초에 new 생성해둔다.
     * 2. getInstance()를 synchronized 한다.
     * 3. DCL(Double Checked Locking)을 한다.
     */
    public ChocolateBoiler getInstance() {
        if(uniqueInstance==null)
            uniqueInstance = new ChocolateBoiler();

        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty=false;
            boiled=false;
        }
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }
}