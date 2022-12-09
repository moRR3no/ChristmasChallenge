import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day5_SortAddresses {
    /**
     * Pomóż Mikołajowi w rozwożeniu prezentów!
     * Posortuj listę adresów dzieci po miastach alfabetycznie,
     * tak, żeby Mikołaj mógł wygodnie zaplanować plan podrózy.
     * Posortowaną listę adresów wypisz na ekranie.
     * To bardzo proste zadanie! Więc dodatkowym plusem będzie
     * wykonanie sortowania w jednej linijce. :D
     */
    public static void main(String[] args) {
        List<Address> addresses = Arrays.asList(new Address("Żelazna 76/40", "Warsaw", "00-875", "Poland"),
                new Address("Okopowa 12/4", "Warsaw", "26-125", "Poland"),
                new Address("Żeromskiego 58/1", "Radom", "26-600", "Poland"),
                new Address("Concha Espina 1", "Madrid", "11-213", "Spain"),
                new Address("Berlin strasse 123", "Berlin", "231-432", "Germany"),
                new Address("Warszawska 12", "Radom", "26-600", "Poland"),
                new Address("Pele ST 99", "Rio de Janeiro", "3231-4133", "Brazil"),
                new Address("7077 ALVERN ST", "Los Angeles", "90045-1982", "USA")
        );


        List<Address> sortedAddress = addresses.stream()
                .sorted(Comparator.comparing(Address::getCity))
                .collect(Collectors.toList());

        int i = 1;
        for (Address address : sortedAddress) {
            System.out.println(i + ". " + address);
            i++;
        }

    }
}

class Address {
    private String street;
    private String city;
    private String postalCode;
    private String country;

    public Address(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return  "Street='" + street + '\'' +
                ", City='" + city + '\'' +
                ", Postal Code='" + postalCode + '\'' +
                ", Country='" + country + '\'';
    }
}
