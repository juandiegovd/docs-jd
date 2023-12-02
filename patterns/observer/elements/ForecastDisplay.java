package patterns.observer.elements;

import patterns.observer.DisplayElement;
import patterns.observer.Observer;
import patterns.observer.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float prevPressure;
    private float currentPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.prevPressure = 0;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        currentPressure = weatherData.getPressure();
        display();
        prevPressure = currentPressure;
    }

    @Override
    public void display() {
        if (currentPressure > prevPressure){
            System.out.println("Forecast: Improving weather on the way");
        }
        else if (currentPressure == prevPressure){
            System.out.println("Forecast: More of the same");
        }
        else{
            System.out.println("Forecast: Watch out for cooler, rainy weather");
        }
    }
}
