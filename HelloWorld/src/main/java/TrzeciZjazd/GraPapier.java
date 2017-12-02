package TrzeciZjazd;

import java.util.Random;
import java.util.Scanner;

public class GraPapier {
    public static void main(String[] args) {
        //deklaracja referencji do przechowywania wyboru użytkownika i kompa
        GraPapierEnum gestUser;
        GraPapierEnum gestKomp;

        //wyswietl info dla uztykownika
        System.out.println("Wybierz gest \np -papier, \nk - kamień lub \nn - nożyczki): ");

        //Pobrac wybor uzytkownika
        Scanner scanner = new Scanner(System.in);
        char inChar = scanner.next().toLowerCase().charAt(0);

        //zainicjować wybór użytkownika
        switch (inChar) {
            case 'p':
                gestUser = GraPapierEnum.PAPIER;
                //System.out.println("PAPIER");
                break;

            case 'k':
                gestUser = GraPapierEnum.KAMIEN;
                //System.out.println("KAMIEN");
                break;

            case 'n':
                gestUser = GraPapierEnum.NOZYCZKI;
                // System.out.println("NOŻYCZKI");
                break;

            default:
                System.out.println("wybrałeś źle. \nPrzypisano Ci gest PAPIER");
                gestUser = GraPapierEnum.PAPIER;

        }
        // KOMP LOSUJE
        Random random = new Random();
        int wylosowanyGest = random.nextInt(3);//0,1,2

        //initial value, to be changed in switch statement
        gestKomp = GraPapierEnum.KAMIEN;

        switch (wylosowanyGest) {
            case 0:
                gestKomp = GraPapierEnum.PAPIER;
                //System.out.println("PAPIER");
                break;

            case 1:
                gestKomp = GraPapierEnum.KAMIEN;
                //System.out.println("KAMIEN");
                break;

            case 2:
                gestKomp = GraPapierEnum.NOZYCZKI;
                //System.out.println("NOŻYCZKI");
                break;
        }
        System.out.println("Komp wylosował: " + gestKomp.name());

//            default:
//                System.out.println("wybrałeś źle, przypisano Ci gest PAPIER"); nie musi być bo zakres jest ustawiony

        //Ustalic kto jest zwyciezca
        int wygrana = gestUser.play(gestKomp);

        //Wypisac rezultat
        if (wygrana > 0) {
            System.out.println("Wygrales!");
        } else if (wygrana < 0) {
            System.out.println("Przegrales :(");
        } else {
            System.out.println("Remis");
        }

    }

}