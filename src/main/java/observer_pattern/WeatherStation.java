package observer_pattern;

import observer_pattern.observer.CurrentConditionDisplay;
import observer_pattern.observer.HeatIndexDisplay;
import observer_pattern.observer.NewDisplay;
import observer_pattern.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        NewDisplay newDisplay = new NewDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("---------------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("---------------------------------");
        weatherData.setMeasurements(78, 90, 29.4f);
    }
}
