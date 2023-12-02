package patterns.observer.elements;

import patterns.observer.DisplayElement;
import patterns.observer.Observer;
import patterns.observer.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private List<Float> temperatures;
    private float avgTemperature;
    private float maxTemperature;
    private float minTemperature;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        temperatures = new ArrayList<>();
    }

    @Override
    public void update() {
        temperatures.add(weatherData.getTemperature());

        float sum = 0.0f;
        for (var temp: temperatures){
            sum+= temp;
        }
        avgTemperature = sum/temperatures.size();
        maxTemperature = temperatures.stream().max((o1, o2) -> (int) (o1 - o2)).get();
        minTemperature = temperatures.stream().min((o1, o2) -> (int) (o1 - o2)).get();
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "+avgTemperature+"/"+maxTemperature+"/"+minTemperature);
    }
}
