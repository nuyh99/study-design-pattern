package observer_pattern.observer;

import observer_pattern.subject.WeatherData;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temperature+humidity+pressure);
    }

    @Override
    public void update() {
        this.temperature=weatherData.getTemperature();
        this.humidity=weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
