import model.Gift;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day11_ChooseEnvelope {
    /**
     * Mikołaj pakuje prezenty w koperty. Zakupił trzy rozmiary: 10x15, 20x30, 30x30.
     * Dopasuj najmniejszą możliwą kopertę do każdego prezentu z listy.
     * Wypisz na ekranie, która koperta najlepiej pasuje do każdego prezentu.
     */
    public static void main(String[] args) {
        Map<String, String> giftAssignedToEnvelop = new HashMap<>();
        for (Gift gift : prepareGifts()) {
            if (gift.getWidth() <= 10 && gift.getHeight() <= 15) {
                giftAssignedToEnvelop.put(gift.getName(), "10x15");
            } else if (gift.getWidth() <= 20 && gift.getHeight() <= 30) {
                giftAssignedToEnvelop.put(gift.getName(), "20x30");
            } else {
                giftAssignedToEnvelop.put(gift.getName(), "30x30");
            }
        }
        for (Map.Entry<String, String> entry : giftAssignedToEnvelop.entrySet()) {
            System.out.println("Gift: " + entry.getKey() + ", envelop: " + entry.getValue());
        }
    }


    private static List<Gift> prepareGifts() {
        return List.of(
                new Gift("Parfum", 12, 30),
                new Gift("Socks", 10, 10),
                new Gift("Book", 30, 25),
                new Gift("Clock", 15, 15),
                new Gift("Wallet", 5, 10)
        );
    }
}
