import model.ChildWithBirthDate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Mikołaj przygotował dodatkowe prezenty dla najmłodszego i najstarszego dziecka.
 * Pomóż mu znaleźć je w liście.
 * Wypisz na ekran znalezione dzieci wraz z informacja, które jest najstarsze, a które najmłodsze.
 */


public class Day16_FindOldestAndYoungest {
    public static void main(String[] args) {

        List<ChildWithBirthDate> sortedList = new ArrayList<>(prepareChildren());

        sortedList.sort(new Comparator<ChildWithBirthDate>() {
            @Override
            public int compare(ChildWithBirthDate o1, ChildWithBirthDate o2) {
                return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
            }
        });

        int count = 0;
        for (ChildWithBirthDate child : sortedList) {
            if (count == 0) System.out.println("Najstarsze dziecko: " + child);
            if (count == sortedList.size()-1) System.out.println("Najmlodsze dziecko: " + child);
            count++;
        }
    }



    private static List<ChildWithBirthDate> prepareChildren() {
        return List.of(
                new ChildWithBirthDate(
                        "Jasiu",
                        "Kowalski",
                        LocalDate.of(2010, 12, 30)
                ),
                new ChildWithBirthDate(
                        "Kasia",
                        "Nowak",
                        LocalDate.of(2011, 11, 30)),
                new ChildWithBirthDate(
                        "Asia",
                        "Wisniewska",
                        LocalDate.of(2010, 12, 31)),
                new ChildWithBirthDate(
                        "Tomek",
                        "Wojcik",
                        LocalDate.of(2015, 6, 30)),
                new ChildWithBirthDate(
                        "Tomek",
                        "Zajac",
                        LocalDate.of(2020, 12, 30))
        );
    }
}


