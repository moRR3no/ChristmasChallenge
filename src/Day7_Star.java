import java.util.Scanner;

public class Day7_Star {
    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie gwiazdkę.
     * Jeżeli potrafisz, nie wpisuj gwiazdki bezposrednio w printy - pokombinuj z pętlami.
     * Tak, żeby gwiazdka wygenerowała się sama!
     * Gwiazdka może mieć dowolny kształt, wygeneruj taki jaki potrafisz. Przykładowe gwiazdki:
     *     *       *       *         *
     *     *         *   *        *******
     * *********   **********      *****
     *     *         *   *        *******
     *     *       *       *         *
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++) { System.out.print("*" + " "); } System.out.println(""); } for (int i= rows-1; i>= 0; i--)
    {
        for (int j=0; j< i ;j++)
        {
            System.out.print(" ");
        }
        for (int k=i; k<=rows-1; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println("");
    }
        sc.close();
    }

}
