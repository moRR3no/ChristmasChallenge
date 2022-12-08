import java.util.*;

public class Day2_RandomPresent {
    /**
     * Mikołaj postanowił w tym roku skorzystać z pomocy nowoczesnych technologii.
     * Zamiast zastanawiać się, komu jaki prezent dostarczyć postanowił skorzystać z programu.
     * Pomoż Mikołajowi!
     * Przygotuj kod, który z listy dostępnych prezentów wylosuje 3 prezenty i wypisze na ekranie.
     * Odpal program kilka razy - sprawdź, czy na pewno losuje za kazdym razem inne prezenty!
     * Wylosowane prezenty wypisz na ekranie. Zadbaj o to, żeby wylosowane prezenty były unikalne.
     */
    public static void main(String[] args) {
        List<String> gifts = new ArrayList<>();
        gifts.add("Hot Wheels car");
        gifts.add("Barbie doll");
        gifts.add("Adidas Teamgeist ball");
        gifts.add("FIFA 23");
        gifts.add("Xbox Series X");
        gifts.add("PS5");
        gifts.add("Iphone 14");
        gifts.add("Nintendo Switch");
        gifts.add("Roland drumset");
        gifts.add("Electric guitar Ibanez");

        Set<String> endGiftsList = new HashSet<>();


        // Program uruchomiony 3 razy, zeby potwierdzic ze prezenty przy kolejnym uruchomieniu sie nie powtórzą
        executedGiftList(gifts, endGiftsList);
        executedGiftList(gifts, endGiftsList);
        executedGiftList(gifts, endGiftsList);


        for (String gift : endGiftsList) {
            System.out.println(gift.toString());
        }
    }

    public static String drawRandomGift(List<String> giftsList) {
        Random rand = new Random();
        String randomElement = giftsList.get((rand.nextInt(giftsList.size())));
        return randomElement;
    }

    public static void executedGiftList(List<String> giftsList, Set<String> endList) {
        String tempGift;
        int count = 0;
        while (count < 3) {
            tempGift = drawRandomGift(giftsList);
            if (!endList.contains(tempGift)) {
                endList.add(tempGift);
                count++;
            }
        }

    }
}
