package ZadaniaWlasne.Zadania;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Tomasz Filo Zegarlicki
 * [https://github.com/FiloPL]
 */
public class Zadanie3 {

    public static void main(String[] args) {
        /**
         * Zadanie dodatkowe
         * Gra w kości z komputerem
         */
//        Random losuj = new Random();
//        int wylosowano = losuj.nextInt(5);
//        System.out.println(wylosowano);

        boolean warunekKontynuacji = true;
        int numerGry = 0;
        // ustalamy saldo gry
        int saldoGryTwoje = 1000;
        int saldoGryKomputera = saldoGryTwoje;
        while (warunekKontynuacji) {// gramy aż wygramy ( warunkiem zakończenia jest wygrana
            numerGry++;
            // ustawiamy stawkę o ktorą się gra
            int stawka = ustawStawke(saldoGryTwoje);
            System.out.println("Gra: "+numerGry);
            int mojaLiczba = wylosujIPobierzWartoscKostki();
            System.out.println("wykulałeś kostką: " +mojaLiczba );

            int wylosowano = wylosujIPobierzWartoscKostki();
            System.out.println("Komputer wyolosował liczbę: " + wylosowano);

            if (mojaLiczba > wylosowano && mojaLiczba>=1 && mojaLiczba<=6) {
                    System.out.println("brawo, wygrałeś !");
                    // zmieniamy saldo Twoje i komputera
                    saldoGryTwoje += stawka;
                    saldoGryKomputera -= stawka;

                    //warunekKontynuacji=false;// wygrałeś nie kontynuujemy dalej gry
            } else if (mojaLiczba < wylosowano) {
                System.out.println("przykro mi przegrałeś, spróbuj ponownie");
                // zmieniamy saldo Twoje i komputera
                saldoGryTwoje -= stawka;
                saldoGryKomputera += stawka;
                if(saldoGryTwoje <=0 )
                {
                    System.out.println("Sorry ale bez kasy nie zagrasz");
                    warunekKontynuacji = false;
                }

            } else {
                System.out.println("remis, spróbuj ponownie");

            }
            System.out.println("Twoje saldo to: " + saldoGryTwoje);
            System.out.println("---------------------------");
            System.out.println("Czy chcesz grac dalej? ");
            System.out.println("true / false ");
            System.out.println("-> ");
            Scanner czyDalej = new Scanner(System.in);
            warunekKontynuacji= czyDalej.nextBoolean(); // uzytkownik decyduje czy gramy dalej czy nie

        }
    }

    private static int ustawStawke(int saldoGryTwoje) {
        System.out.printf("\nPosiadasz %d $, zakladamy się o: ", saldoGryTwoje);
        Scanner pobeirz = new Scanner(System.in);
        int stawka = pobeirz.nextInt();
        if(stawka>saldoGryTwoje || stawka<1) {
            while (stawka > saldoGryTwoje || stawka <1)
            {
                System.out.println("Stawiasz wiecej niz masz, podaj poprawna kwote: ");
                stawka = pobeirz.nextInt();
            }
        }
        return stawka;

    }

    public static int wylosujIPobierzWartoscKostki(){
        Random losuj = new Random();
        int wylosowano = losuj.nextInt(6) + 1;
        return  wylosowano;
    }


}
