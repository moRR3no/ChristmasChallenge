import java.util.ArrayList;
import java.util.List;

/**
 * Chochliki nie ułatwiają życia Mikołajowi. Tym razem poodwracały imiona dzieci na liście…
 * Napraw co popsuły chochliki i odwróć imiona.
 * Zwróć uwagę na duże litery i zamień je, tak, żeby imiona były poprawne.
 * Na koniec wypisz listę w terminalu żeby sprawdzić, czy wszystko jest ok!
 */

public class Day13_RevertNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Uisaj");
        names.add("Aisak");
        names.add("Aisa");
        names.add("Kemot");
        names.add("Lahcim");

        List<String> properNames = new ArrayList<>();
        for (String name : names) {
            String tempName = revertString(lowString(name));
            String properName = tempName.substring(0,1).toUpperCase() + tempName.substring(1).toLowerCase();
            properNames.add(properName);
        }

        for (String name : properNames) {
            System.out.println(name);
        }
    }
    private static String lowString (String str) {
        return str.toLowerCase();
    }

    private static String revertString (String str) {
        StringBuilder properOrder = new StringBuilder(str);
        return properOrder.reverse().toString();
    }
}
