package ZadaniaWlasne.Zadania;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        /**
         * Zadanie1
         * Wypisz elementy utworzonej wcześniej Listy zawierającą imiona na literę ‚a’
         * lista 10 imion
         *
         * wersja:
         * a) for
         * b) while
         *
         */
        List<Object> listaImion;  // domyślenie jest objekt
        List<String> listaImion2;  // domyślnie jest String
        
        List imiona = new ArrayList();
        //LinkedList imiona = new LinkedList();
        imiona.add("Wiola");
        imiona.add("Asia");
        imiona.add("Marzena");
        imiona.add("Bogdan");
        imiona.add("Roman");
        imiona.add("Janusz");
        imiona.add("Dorian");
        imiona.add("Harry");
        imiona.add("Mariusz");
        imiona.add("Adamm");
        imiona.add("Wojciech");
        /*
        for(int i=0; i<imiona.size(); i++)
        {
            System.out.println(imiona.get(i));
        }
        */
        // alternatyna wersjia

        for(Object imie: imiona)
        {
            Object imieObiekt = imie;
            String imieString = imie.toString(); // poprawna forma
            String imieString2 = (String) imie; // rzutowanie
            if(imieString.startsWith("A") || imieString.contains("a") )
            {
                System.out.println(imie);
            }

            /** wersja druga
             *
             * if(imieString.toLowerCase().contains("a") )
             *             {
             *                 System.out.println(imie);
             *             }
             *
             *
             */
        }

        /**
        // alternatywna wersja
        for(String imie : listaImion2)
        {

        }
        */
        System.out.println("******************");
        short i =0;
        while (i<imiona.size()) {
            if (imiona.get(i).toString().contains("a")) {
                System.out.println(imiona.get(i++));
            }

        }



    }
}
