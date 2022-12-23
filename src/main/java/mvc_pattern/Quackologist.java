package mvc_pattern;

public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("duck 소리 발생 ");
    }
}
