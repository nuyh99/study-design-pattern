## 싱글톤 패턴(Singleton Pattern)
* 클래스 인스턴스를 하나만 만들고, 그 인스턴스의 전역 접근을 제공한다.
* Enum을 사용해서 구현하는 것이 완벽한 싱글톤이다.
  * Serialize에서 안전하다.
  * Reflection에서 안전하다.
  * Enum을 직렬화하면 필드 변수는 소멸된다.
* 싱글톤으로 구현한 ChocolateBoiler
```java
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
```
---
## 쓰면서 제대로 공부하기
```java
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = false;
        boiled = false;
    }

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
```
