import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Day4_PresentToZeroOnes {

    /**
     * Mikołaj postanowił w tym roku skorzystać z pomocy nowoczesnych technologii
     * i zamiast rozwozić wszystkie prezenty, niektóre przesłać przez Internet.
     * Do tego celu musi zamienić nazwy prezentów w strumienie bitów!
     * Pomoż Mikołajowi! Przygotuj kod, który zamieni nazwy prezentów na ciąg zer i jedynek.
     * Dla każdej litery nazwy prezentu znajdz kod UTF-8, a później zamień go na system binarny.
     * Dla każdego prezentu wypisz na ekran ciąg zer i jedynek. Każdy prezent w oddzielnej linijce.
     * Możesz napisać funkcję zamieniającą numer znaku na system binarny samodzielnie,
     * albo znaleźć odpowiednią funkcję w bibliotece Twojego języka.
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
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

        int i = 1;
        for (String gift : gifts) {
            System.out.print(i+". " + gift + ": ");
            toBinary(gift);
            System.out.println();
            i++;
        }
    }

    public static void toBinary (String str) throws UnsupportedEncodingException {
        byte[] arr = str.getBytes("UTF8");
        for (byte x : arr) {
            System.out.print("0" + Integer.toBinaryString(x) + " ");
        }
    }
}


