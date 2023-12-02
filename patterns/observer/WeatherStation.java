package patterns.observer;

import patterns.observer.elements.CurrentConditionsDisplay;
import patterns.observer.elements.ForecastDisplay;
import patterns.observer.elements.HeatIndexDisplay;
import patterns.observer.elements.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.measurementsChanged(80, 65, 30.4f);
        weatherData.measurementsChanged(82, 70, 29.2f);
        weatherData.measurementsChanged(78, 90, 29.2f);
    }
}
