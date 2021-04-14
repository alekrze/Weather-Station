package pl.sdacademy;

import pl.sdacademy.weatherprovider.StaticWeatherProvider;

//W metodzie main stwórz wątek, który po 20 sekundach zmieni sposób pobierania danych przez stację pogodową.
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = WeatherStation.INSTANCE;

        Thread thread = new Thread(()-> {
            try {
                Thread.sleep(11000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            weatherStation.setWeatherProvider(new StaticWeatherProvider());
        });
        thread.start();
        weatherStation.start();
    }
}
