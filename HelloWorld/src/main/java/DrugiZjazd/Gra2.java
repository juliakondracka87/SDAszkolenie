package DrugiZjazd;

import java.util.Random;


public class Gra2 {
    Random random;//randoma dekalarujemy w klasie, ponieważ będzie on potrzeby wielokrotnie;
    private int sredniaKomp;//dlaczego prywatne??
    private int sredniaGracz;
    private int iloscProbGracz;
    private int minWartoscGracz;
    private int maxWartoscGracz;

//    int liczbyKompa;
//    int liczbyGracza;

    public Gra2() {
        random = new Random();// dekalrujemy w konstruktorze, ponieważ będzie on potrzebny wielokrotnie dla tego obiektu;
//        iloscProbGracz = 0;
    }

    public void kompLosuje() {
        int suma = 0;

        int tmp;
        System.out.print("kompLosuje: ");
        for (int i = 0; i < 10; i++) {
            tmp = random.nextInt(201) - 100;

            System.out.print(tmp+", ");
            suma += tmp;
        }

        this.sredniaKomp = suma / 10;
        System.out.println("SredniaKomp = "+ this.sredniaKomp );
    }

    public void graczPodajSrednia(int srednia) {
        System.out.println("Srednia gracza: "+srednia);
        sredniaGracz = srednia;
    }

    public int kompPobierzSrednia() {

        return sredniaKomp;
    }

    private void grajKomp() {
        int wylosowanaWartosc = random.nextInt(201) - 100;
        int minWartosc = wylosowanaWartosc;
        int maxWartosc = wylosowanaWartosc;
        for (int i = 1; i <= 1000; i++) {


            int liczba = sredniaGracz - wylosowanaWartosc;
            if (minWartosc > wylosowanaWartosc) {
                minWartosc = wylosowanaWartosc;
            }
            if (maxWartosc < wylosowanaWartosc) {
                maxWartosc = wylosowanaWartosc;
            }
            if (liczba <= 5 && liczba >= -5) {
                System.out.println("Komputer wygrał za: " + i + " razem.");
                System.out.println("Liczba=" +liczba);
                System.out.println("wylosowanaWartosc=" +wylosowanaWartosc);
                break;
            }


            wylosowanaWartosc = random.nextInt(201) - 100;
        }
        System.out.println("min wartosc komp " + minWartosc);
        System.out.println("max wartosc komp " + maxWartosc);
        System.out.println("srednia wartosc komp: " + sredniaKomp);
    }

    public void graczSprawdzNumer(int wprowadzonaLiczba) {

        iloscProbGracz++;
        if (iloscProbGracz == 1) {
            minWartoscGracz = wprowadzonaLiczba;
            maxWartoscGracz = wprowadzonaLiczba;
        }
        else {
            if (minWartoscGracz > wprowadzonaLiczba) {
                minWartoscGracz = wprowadzonaLiczba;
            }
            if (maxWartoscGracz < wprowadzonaLiczba) {
                maxWartoscGracz = wprowadzonaLiczba;
            }
        }
        if (wprowadzonaLiczba > sredniaKomp + 5) {
            System.out.println("Za dużo!");

        } else if (wprowadzonaLiczba < sredniaKomp - 5) {
            System.out.println("Za mało!");

        } else {
            System.out.println("Wygrałes za " + iloscProbGracz + " razem.");
            System.out.println("Min wartosc gracza " + minWartoscGracz);
            System.out.println("Max wartosc gracz " + maxWartoscGracz);
            grajKomp();
        }


    }
}

