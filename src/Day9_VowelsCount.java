import model.Address;
import java.util.ArrayList;
import java.util.List;

public class Day9_VowelsCount {
    /**
     * Mikołaj wykupił pakiet wysyłkowy do prezentów, ale przyoszczędził na wersji premium.
     * Przez to będzie musiał dopłacić 2 zł za każdą samogłoskę w adresie.
     * Pomóż Mikołajowi i policz ile będzie musiał dopłacić, a policzoną wartość wypisz na ekranie.
     * Adresy znajdziesz w przygotowanej liście, nie ma w nich polskich znaków.
     */
    public static void main(String[] args) {
        String withoutVowels = concatenatedString().replaceAll("[aeiouyAEIOUY]","");

        int sum = 2*(concatenatedString().length() - withoutVowels.length());
        System.out.println("Mikołaj będzie musiał zapłacić dodatkowo " + sum + " złote, za to, że przyoszczędził na wersji premium.\nEssa");

    }

    private static String concatenatedString  () {
        StringBuilder possibleVowelsString = new StringBuilder();
        for (Address address : prepareAddresses()) {
            possibleVowelsString.append(address.getCity().concat(address.getNumber()).concat(address.getStreet()));
        }
        return possibleVowelsString.toString();
    }
    private static List<Address> prepareAddresses() {
        List<Address> addresses = new ArrayList<>();

        addresses.add(new Address("Serniczkowa",
                "4B",
                2,
                "Krakow",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289A",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Barszczykowa",
                "234",
                5,
                "Rzeszow",
                "37-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Cukierkowa",
                "23I",
                5,
                "Poznan",
                "02-326"
        ));

        return addresses;
    }
}
