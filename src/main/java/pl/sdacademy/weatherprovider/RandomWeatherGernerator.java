package pl.sdacademy.weatherprovider;

import pl.sdacademy.CloudCover;
import pl.sdacademy.Weather;

import java.util.Random;

public class RandomWeatherGernerator implements WeatherProvider {
    @Override
    public Weather getWeather() {
        Random random = new Random();
        int temperature = random.nextInt(50) - 20;
        int wind = random.nextInt(10);
        //TODO wylosować zachmurzenie
        CloudCover cloudCover = CloudCover.PARTIALLY_CLOUDY;
        return new Weather(temperature, wind, cloudCover);
    }
}
