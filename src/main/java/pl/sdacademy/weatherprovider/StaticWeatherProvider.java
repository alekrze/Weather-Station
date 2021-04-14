package pl.sdacademy.weatherprovider;

import pl.sdacademy.CloudCover;
import pl.sdacademy.Weather;

public class StaticWeatherProvider implements WeatherProvider {
    @Override
    public Weather getWeather() {
        return new Weather(10,4, CloudCover.SUNNY);
    }
}
