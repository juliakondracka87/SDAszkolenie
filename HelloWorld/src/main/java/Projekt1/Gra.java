package Projekt1;

import java.util.Random;
import java.util.Scanner;

public class Gra {

    Random random;
    Scanner scanner;
    private int ilośćStarć = 5;
    WybórPostaci graczWybieraPostać;
    WybórPostaci kompLosujePostać;
    Item graczWybieraAtrybut;
    Item kompLosujeAtrybut;

    public Gra() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);

    }

    public Gra(int ilośćStarć) {
        this.ilośćStarć = ilośćStarć;
    }

    public int getIlośćStarć() {
        return ilośćStarć;
    }

    public void setIlośćStarć(int ilośćStarć) {
        this.ilośćStarć = ilośćStarć;
    }

    public void podajPostać(){
        System.out.println("Wybierz postać: \n0 - giermek, \n1 - król, \n2 - książę, \n3 - księżniczka, \n4 - rycerz;");
        int postać = scanner.nextInt(5);
        graczWybieraPostać = WybórPostaci.RYCERZ;
        switch (postać){
            case 0:
                graczWybieraPostać = WybórPostaci.GIERMEK;
                podajAtrybut();


                break;

            case 1:
                graczWybieraPostać = WybórPostaci.KROL;

                break;
            case 2:
                graczWybieraPostać = WybórPostaci.KSIAZE;

                break;
            case 3:
                graczWybieraPostać = WybórPostaci.KSIEZNICZKA;

                break;
            case 4:
                graczWybieraPostać = WybórPostaci.RYCERZ;
                break;
            default:
                System.out.println("Błąd wyboru, ustawiono postać: ");
                graczWybieraPostać = WybórPostaci.GIERMEK;

        }
        System.out.println("Gracz wybrał postać: " + graczWybieraPostać.name());
    }
    public void losujPostać(){
        System.out.println("Komp losuje postać:");
        int wróg = random.nextInt(5);
        kompLosujePostać = WybórPostaci.RYCERZ;
        switch (wróg){
            case 0:
                kompLosujePostać = WybórPostaci.GIERMEK;

                break;

            case 1:
                kompLosujePostać = WybórPostaci.KROL;

                break;
            case 2:
                kompLosujePostać = WybórPostaci.KSIAZE;

                break;
            case 3:
                kompLosujePostać = WybórPostaci.KSIEZNICZKA;

                break;
            case 4:
                kompLosujePostać = WybórPostaci.RYCERZ;

        }
        System.out.println("Komp wylosował postać: " + kompLosujePostać.name());
    }
    public void podajAtrybut(){
        System.out.println("Wybierz arybut: \nb - broń, \nt - tarcza, \nw - wino;");
        char atrybut = scanner.next().toLowerCase().charAt(0);
        switch(atrybut){
            case 'b':
                graczWybieraAtrybut = Item.BROŃ;
                break;
            case 't':
                graczWybieraAtrybut = Item.TARCZA;
                break;
            case 'w':
                graczWybieraAtrybut = Item.WINO;
                break;
            default:
                System.out.println("Nie ma takiego atrybutu, przypisano Ci atrybut WINO!");
                graczWybieraAtrybut = Item.WINO;
        }
        System.out.println("Gracz wybrał atrybut: " + graczWybieraAtrybut.name());
    }
    public void losujAtrybut(){//(charakter p)
        System.out.println("Komp losuje atrybut");
        int wylosowanyAtrybut = random.nextInt(3);
        kompLosujeAtrybut = Item.WINO;
        switch(wylosowanyAtrybut){
            case 0:
                kompLosujeAtrybut = Item.BROŃ;
                //p =
                break;
            case 1:
                kompLosujeAtrybut = Item.TARCZA;
                break;
            case 2:
                kompLosujeAtrybut = Item.WINO;

        }
        System.out.println("Komp wylosował atrybut: " + kompLosujeAtrybut.name());
    }

    public WybórPostaci getGraczWybieraPostać() {
        return graczWybieraPostać;
    }

    public void setGraczWybieraPostać(WybórPostaci graczWybieraPostać) {
        this.graczWybieraPostać = graczWybieraPostać;
    }

    public WybórPostaci getKompLosujePostać() {
        return kompLosujePostać;
    }

    public void setKompLosujePostać(WybórPostaci kompLosujePostać) {
        this.kompLosujePostać = kompLosujePostać;
    }

    public Item getGraczWybieraAtrybut() {
        return graczWybieraAtrybut;
    }

    public void setGraczWybieraAtrybut(Item graczWybieraAtrybut) {
        this.graczWybieraAtrybut = graczWybieraAtrybut;
    }

    public Item getKompLosujeAtrybut() {
        return kompLosujeAtrybut;
    }

    public void setKompLosujeAtrybut(Item kompLosujeAtrybut) {
        this.kompLosujeAtrybut = kompLosujeAtrybut;
    }
}
