import java.util.ArrayList;
import java.util.List;

/**
 * Lista prezentów od dzieci przychodzi w jednym długim napisie.
 * Napis zawiera dane w formacie: imię dziecka, spacja, prezenty rozdzielone spacjami, przecinek.
 * Pomóż Mikołajowi! Podziel napis na ciągi: imię dziecka => prezenty po przecinku.
 * Po ostatnim prezencie w linii nie powinno byc przecinka.
 */

public class Day14_SplitPresentsList {
    public static void main(String[] args) {
        String giftsList = "Kuba klocki klawiatura dron quad, Alicja komputer samochod mysz, "
                + "Janina ksiazka traktor, Tomek kuchenka koparka flamastry, ";


        String[] arrayByPerson = giftsArrayByPerson(giftsList);
        //Kuba klocki klawiatura dron quad ...

        List<String> endGiftsListProperlyOrdered = new ArrayList<>();
        for (String nameAndGifts : arrayByPerson) {
            nameAndGifts = nameAndGifts.replaceAll(" ", ", ");
            nameAndGifts = nameAndGifts.replaceFirst(", ", " => ");
            endGiftsListProperlyOrdered.add(nameAndGifts);
        }

        for (String strr : endGiftsListProperlyOrdered) {
            System.out.println(strr);
        }

    }

    private static String[] giftsArrayByPerson(String giftsString) {
        return giftsString.split(", ");
        //Kuba klocki klawiatura dron quad ...
    }
}
