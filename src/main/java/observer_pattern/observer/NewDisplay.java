package observer_pattern.observer;

import observer_pattern.subject.WeatherData;

public class NewDisplay implements Observer, DisplayElement{
    private float maxTemperature;
    private float minTemperature=Float.MAX_VALUE;

    private float sumTemperature;
    private int count;

    private WeatherData weatherData;

    public NewDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("maxTemperature = " + maxTemperature);
        System.out.println("minTemperature = " + minTemperature);
        System.out.println("averageTemperature = " + sumTemperature/count);
    }

    @Override
    public void update() {
        this.maxTemperature = Math.max(this.maxTemperature, weatherData.getTemperature());
        this.minTemperature = Math.min(this.minTemperature, weatherData.getTemperature());
        this.sumTemperature+= weatherData.getTemperature();
        this.count++;
        display();
    }
}
