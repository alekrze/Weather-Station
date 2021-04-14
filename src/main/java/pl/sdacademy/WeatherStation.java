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

public enum WeatherStation {
    INSTANCE;
    private Weather currentWeather;

    public void start() {
        while (true) {
            System.out.println("aktualizacja");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
