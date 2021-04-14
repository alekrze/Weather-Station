package pl.sdacademy;

public class Weather {
    private int temperature;
    private int wind;
    private CloudCover cloudcover;

    public Weather(int temperature, int wind, CloudCover cloudcover) {
        this.temperature = temperature;
        this.wind = wind;
        this.cloudcover = cloudcover;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", wind=" + wind +
                ", cloudcover=" + cloudcover +
                '}';
    }
}
