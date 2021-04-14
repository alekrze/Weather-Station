package pl.sdacademy;

//Stwórz projekt mavenowy.
//Stwórz klasę WeatherStation, reprezentującą stację pogodową.
// Klasa powinna mieć pole:
//currentWeather typu Weather (o polach temperature,
// wind oraz cloudCover (zachmurzenie - typ wyliczeniowy)).
// Powinna również zawierać metodę start, która w "wiecznej"
// pętli będzie co 5 sekund sprawdzała pogodę (na razie co 5
// sekund niech wypisuje w konsoli "aktualizacja").

//Będziemy w aplikacji używali tylko jednej instancji tej klasy.

//Stacja powinna móc korzystać z różnych sposobów aktualizacji danych - np. korzystając z symulatora (generatora) danych, z danych serwisu internetowego itp. (bardzo możliwe, że w przyszłości dodane zostaną inne źródła). Zaprojektuj rozwiązanie, które to umożliwi, następnie zaimplementuj sposoby aktualizacji danych i możliwość zmiany sposobu w obiekcie stacji pogodowej:
//a) korzystając z symulatora (losowego generatora) danych
//b) korzystając ze sztywno przygotowanych danych (jedna i ta sama pogoda).
//Sprawdzenie pogody spowoduje wypisanie jej w konsoli.

import pl.sdacademy.weatherprovider.WeatherProvider;
import pl.sdacademy.weatherprovider.RandomWeatherGernerator;

public enum WeatherStation {
    INSTANCE;
    private Weather currentWeather;
    private WeatherProvider weatherProvider;

    WeatherStation() {
        this.weatherProvider = new RandomWeatherGernerator();
    }

    public void start() {
        while (true) {
           currentWeather = weatherProvider.getWeather();
            System.out.println(currentWeather);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
