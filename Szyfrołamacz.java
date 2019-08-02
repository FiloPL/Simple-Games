package ZadaniaWlasne.Zadania;

import java.util.Random;
import java.util.Scanner;

public class Szyfrołamacz {
    public static void main(String[] args) {
        int liczba = losujLiczbe();
        szyfrolamacz(liczba);

    }

    private static int losujLiczbe() {
        Random losuj = new Random();
        int liczba = losuj.nextInt(8999)+1000;
        System.out.println(liczba);
        return liczba;
    }

    private static void szyfrolamacz(int liczba) {
        int zycie = 5;
        boolean ponownie = true;
        while( ponownie == true)
        {
            int podpowiedz = 1;
            while(zycie>0)
            {
                System.out.println("Masz " + zycie + " zyc. Zgadnij liczbe");
                Scanner podane = new Scanner(System.in);
                int wczytana = podane.nextInt();
                if(liczba == wczytana)
                {
                    System.out.println("wygrales"); break;
                }
                if(liczba < wczytana)
                {
                    System.out.println("Podales za duza liczbe");  zycie--;

                }
                else
                {
                    System.out.println("Podales za mala liczbe");  zycie--;
                }
                podpowiedz=podpowiadam(podpowiedz, liczba);


            } // koniec petli while odpowieadajacej za powtarzanie gry gdy sa zycia
            Scanner zagrajJeszczeRaz = new Scanner(System.in);
            System.out.println("Czy chcesz zgrac ponownie? true or false");
            ponownie = zagrajJeszczeRaz.nextBoolean();
            if(ponownie == true)
            {
                zycie = 5;
            }
        }  // koniec petli gdy uzytkownik chce kontynuowac/konczyc gre

    }

    private static int podpowiadam(int podpowiedz, int liczba) {
        if(podpowiedz>0)
        {
            Scanner wczytaj = new Scanner(System.in);
            System.out.println("czy chcesz podpowiedz, true/false");
            boolean decyzja = Boolean.parseBoolean(wczytaj.nextLine());
            if(decyzja == true)
            {
                // tutaj dopisz brakujacy kod
                int[] k = new int[4];
                for(int i=0; i<4; i++)
                {
                   // k[i] =
                }
                Random losujPodpowiedz = new Random();

                System.out.println("dorba masz ja");
                podpowiedz=0;
            }
            else
            {
                System.out.println("nie to nie");
            }
        }
        return podpowiedz;
    }
}
