package ZadaniaWlasne.Zadania;

import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        /**
         * Wypisz parzyste elementy utworzonej wcześniej tablicy zawierającą liczby
         * tablica 10 liczb od 0 do 1000
         * + dodatkowo użycie Random() czyli losowania
         *
         * 1. Stwórz tablice
         * 2. Przypisz elementy
         * 3. Wypisz
         *
         * wersja:
         * a) for
         * b) while
         */
        // tworzymy tablice
        int[] liczby = new int[10];

        // wypełniamy tablice i wypisujemy
        for (int i=0; i<liczby.length; i++)
        {
            liczby[i] =  losuj();
            System.out.println(liczby[i]);
        }

        // petla while
        int i=0;

        while (i<liczby.length)
        {
            liczby[i] =  losuj();
            System.out.println(liczby[i++]);
        }

    }

    private static int losuj() {
        Random losuj = new Random();
        return losuj.nextInt(1000)+0;
    }
}
