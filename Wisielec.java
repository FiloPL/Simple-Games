package ZadaniaWlasne.Zadania;


import java.util.Scanner;

/**
 * program Wisielec
 * uzytkownik podaje haslo, przecwnik zgaduje slowo: ma on 5 żyć by zgadnać
 * haslo losowane jest z bazy haseł
 * na koniec pytanie ccy chce sprobowac ponownie
 *
 */
// TODO blad po skończeniu gdy nie chcesz kontynuować
public class Wisielec {
    public static void main(String[] args) {

        String haslo = podajHaslo(); // tutaj slowo szukane trafia do zmiennej haslo
        boolean ponownie = true;
        while( ponownie == true) {
            zgadnij(haslo); // slowo szukane przekazywane jest do metody
            System.out.println(" Czy chcesz zagrac ponownie");
            Scanner ponow = new Scanner(System.in);
            String s  = "true";
            String decyzja = ponow.nextLine();
            if(decyzja == s )// nie DZIAALA
            {
                ponownie = false;
            }

        }
    }

    private static void zgadnij(String haslo) {
        // tworze tablice o dlugosci hasla;
        String[] tablica = new String[haslo.length()];
        // pojedynczy znak wprowadzamy do tablicy by moc porownywac poszczegolne elementy
        for(int i = 0; i<haslo.length(); i++)
        {
            tablica[i] = String.valueOf(haslo.charAt(i));
            //System.out.println(tablica[i]);
        }

        Scanner litera = new Scanner(System.in);
        // tworzymy zmienne ktore ustalaja koniec i poczatek programu,
        // zycia konczy gdy przegramy
        // trafioneDobrze gdy zgadniemy cale slowo
        int zycia = 5, trafioneDobrze = 0;
        // petla trwa dopoki zycie jest dodatnie
        while(zycia >0)
        {
            System.out.println("Masz " + zycia + " żyć. Podaj litere: ");
            String symbol = litera.nextLine();
            // zmienna ktora sprawdza ilosc wystapienia liter w slowie
            // jesli nie wystepuje raz odejmowane jest zycie
            int dobrze =0;
            for(int i=0; i<haslo.length(); i++)
            {

                if(symbol.equals(tablica[i]))
                {
                    dobrze++; trafioneDobrze++;
                   // System.out.println(trafioneDobrze);
                }
            }

            // odejmujemy zycie jesli nie trafilismy z litera
            if(dobrze==0)
            {
                zycia--;
            }

            // gdy trafimy tyle ile ma slowo - > wygraana -> koniec petli
            if(trafioneDobrze == haslo.length())
            {
                System.out.println("Zgadles !");
                zycia = 0;            }
        }


        System.out.println( "Haslo to: " + haslo);

    }

    private static String podajHaslo() {
        Scanner wczytaj = new Scanner(System.in);
        String haslo;
        System.out.println("Podaj haslo do zgadniecia: ");
        haslo = wczytaj.nextLine();
        return haslo;
    }
}
