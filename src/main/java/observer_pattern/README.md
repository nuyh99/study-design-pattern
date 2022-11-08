## 옵저버 패턴(Observer pattern)
* 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 알림이 간다.
* 알림을 받으면 자동으로 내용이 갱신된다.
* 1:N 의존성을 정의
> Observer 인터페이스 - update()<br>
> Subject 인터페이스 - registerObserver(), removeObserver(), notifyObserver()<br>
---
## 쓰면서 제대로 공부하기
### Interface
* Subject
  * registerObserver()
  * removeObserver()
  * notifyObserver()
* Observer
  * update()

### Class
* WeatherData implements Subject
  * field
    * float temp
    * float humidity
    * float pressure
  * method
    * getter
    * setter
* Display~ implements Observer
---

## 코드 자석

```java
import observer_pattern.observer.DisplayElement;
import observer_pattern.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
  private float currentPressure = 29.92f;
  private float lastPressure;
  private WeatherData weatherData;

  public ForecastDisplay(WeatherData weatherData) {
      this.weatherData=weatherData;
      weatherData.registerObserver(this);
  }

  @Override
  public void display() {
      //디스플레이 코드
  }

  @Override
  public void update() {
    lastPressure = currentPressure;
    currentPressure= weatherData.getPressure();
    display();
  }
}
```
---
