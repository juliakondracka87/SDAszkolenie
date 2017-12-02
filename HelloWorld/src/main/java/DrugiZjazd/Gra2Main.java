package DrugiZjazd;

import java.util.Scanner;

public class Gra2Main {

    //1.Losuj 10 liczb(liczby od komputera dla gracza) - wylicz średnią.
    //2. Podajemy 10 liczb (od gracza dla kompa) - wylicz średnią.
    //3. Zgadnij numer.
    //4. Sprawdź numer.
    //5. Można pomylić się o 5.
    //6. Komputer ma 1000 prób;
    //7. Gramy ze średnią z tych liczb;
    //8. Out: Wygrałeś za x razem;
    //9/ Komputer wtgrał z y razem;
    //10. Minimalna wartość kompa
    //11. Maksymalna wartość kompa;
    //12. Minimalna wartość gracza;
    //13. Maksymalna wartość gracza;
    //14. średnia z Twoich podanych liczb;
    //15. średnia z podanych liczb kompa//

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Gra2 gra = new Gra2();
        gra.kompLosuje();

        int suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + (i+1) + " z 10 liczb");
            suma += scanner.nextInt();

        }
        System.out.println("Suma gracz: "+suma);
        gra.graczPodajSrednia(suma / 10);//tu nie jestem pewna
        while (true) {
            System.out.println("Podaj liczbe:");
            int pobranaWartosc = scanner.nextInt();
            gra.graczSprawdzNumer(pobranaWartosc);
            if (pobranaWartosc == gra.kompPobierzSrednia()) {
                break;
            }


        }
    }
}
