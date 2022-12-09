/**
 * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
 * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
 * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie choinkę.
 * Jeżeli potrafisz, nie wpisuj drzewka bezposrednio w printy - pokombinuj z pętlami.
 * Przygotuj funkcję przyjmującą wysokość choinki i wypisującą choinkę na ekranie.
 * Tak, żeby choinka wygenerowała się sama! Choinka może być po prostu trójkątem, albo być żłożona z kilku warstw. :)
 */

public class Day3_ChristmasTree {
    public static void main(String[] args) {
        int i, j, row = 6;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int count =0;
        while (count <2) {
            for (int p = 0; p <= row / 2; p++) {
                System.out.print(" ");
            }
            System.out.println("||");
            count++;
        }
    }
}
