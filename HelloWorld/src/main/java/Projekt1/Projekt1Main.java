package Projekt1;

import java.util.ArrayList;
import java.util.List;

//Projekt "gra":
//        1) Gracz kontroluje wybraną przez siebie postać (do wyboru spośród 5 różnych możliwości). //hierarchia
//        2) Postać gracza może posiadać do dwóch obiektów wspomagających (np. broń, tarcza, wino). //kompozycja
//        3) Na początku gry losowana jest jedną z takich rzeczy. Drugą przejmujesz po zabiciu wrogu.
// (Dla ambitnych: zaimplementować możliwość zamiany obiektów, np. po zabiciu kolejnego wroga - pytasz gracza, czy chce
// wymienić jeden z posiadanych obiektów na obiekt zdobyczny)
//        4) Określamy ilość tur głównych (ilość starć).
//        5) W każdej turze głównej losowany jest przeciwnik, który też ma losowy przedmiot.
//        6) Następują tury walki - losujemy, kto atakuje jako pierwszy. Zadaje się obrażenia wg wzoru: HP + DP - AP_wroga.
// Wartości DP przedziału <10, 60>, wartości AP z przedziału <65, 120>.
//        7) Jeśli giniesz - przegrywasz. Jeśli zabiłeś wroga - jest następna tura główna. Po zakończeniu wszystkich
// tur głównych, jeśli przeżyłeś, wygrywasz.
public class Projekt1Main {



    public static void main(String[] args) {
        System.out.println("Startujemy!");
        Gra gra = new Gra();
        gra.podajPostać();
        gra.losujPostać();
        //gra.podajAtrybut();
        gra.losujAtrybut();

        System.out.println("Gracz wybrał postać: "+gra.getGraczWybieraPostać());
        Charakter p1 = new Księżniczka(200,90, 45);
        Charakter p2 = new Rycerz(300, 100, 50);
        Charakter p3 = new Książe(400,110,55);
        Charakter p4 = new Król(500,120,60);
        //Charakter p5 = new Giermek(150,80,40);
        List<Charakter> postaci = new ArrayList<>();
        postaci.add(p1);
        postaci.add(p2);
        postaci.add(p3);
        postaci.add(p4);
        ///postaci.add(p5);
        for(Charakter p : postaci){
            p.attack();
            p.defend();
        }

    }
}
