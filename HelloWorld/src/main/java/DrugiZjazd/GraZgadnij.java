package DrugiZjazd;

import java.util.Random;

public class GraZgadnij {

    boolean losowano;
    private int wylosowanyNumer;
    private int iloscProb;

    public GraZgadnij (){
        losowano = false;
        iloscProb = 0;
    }

    public void losujNumer() {
        if (losowano == false) {
            Random random = new Random();
            wylosowanyNumer = random.nextInt(201) - 100;
            losowano = true;

        }
    }

    public void sprawdzNumer(int wprowadzonaLiczba) {
        iloscProb++;
        if (wprowadzonaLiczba > wylosowanyNumer) {
            System.out.println("Za dużo!");
            iloscProb++;
        } else if (wprowadzonaLiczba < wylosowanyNumer) {
            System.out.println("Za mało!");
            iloscProb++;
        } else {
            System.out.println("Wygrałes w probie" + iloscProb);
        }

    }

    public int pobierzWylosowaneLiczby() {
        return wylosowanyNumer;

    }
}
