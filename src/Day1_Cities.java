public class Day1_Cities {
    /**
     * Wyzwanie Świąteczne @wswieciekodu
     * Dzień 1
     * Mikołaj musi odwiedzić 3 miasta o współrzędnych (1,1), (4,5), (11,5) w podanej kolejności.
     * Mikołaj startuje z punktu(1,1) spod stacji paliw ;)
     * Na 10 jednostek odległości jego sanie zużywają 20 litrów magicznego paliwa.
     * Ile paliwa potrzebuje na całą trasę? Do policzenia przygotuj odpowiedni kod.
     * Obliczony wynik wypisz na ekranie.
     *
     * Oblicz w kodzie dystans miedzy miastami, a nastepnie policz niezbedną ilosc paliwa.
     * Do obliczenia dystansu przygotuj odpowiednią funkcję.
     * Do obliczeń matematycznych użyj funkcji z biblioteki Twojego jezyka.
     */
    public static void main(String[] args) {
        City city1 = new City(1,1);
        City city2 = new City(4,5);
        City city3 = new City(11,5);

        double fullDistance = distanceBetweenCities(city1, city2) + distanceBetweenCities(city2,city3);
        double fuelBurned = fullDistance*2;

        System.out.println("Full distance: " + fullDistance);
        System.out.println("Fuel needed: " + fuelBurned);

    }
    public static double distanceBetweenCities (City city1, City city2) {
        return Math.sqrt(Math.pow((city2.getX()-city1.getX()),2) + Math.pow((city2.getY()-city1.getY()),2));
    }

}

class City {
    private double x;
    private double y;

    public City(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}


