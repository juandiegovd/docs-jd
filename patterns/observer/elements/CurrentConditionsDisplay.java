package patterns.observer.elements;

import patterns.observer.DisplayElement;
import patterns.observer.Observer;
import patterns.observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+weatherData.getTemperature()+"F degres and "+weatherData.getHumidity()+"% humidity");
    }
}
