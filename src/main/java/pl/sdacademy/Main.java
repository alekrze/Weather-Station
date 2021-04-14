package pl.sdacademy;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = WeatherStation.INSTANCE;
        weatherStation.start();
    }
}
