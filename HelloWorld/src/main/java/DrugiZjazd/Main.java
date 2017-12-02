package DrugiZjazd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraZgadnij metody = new GraZgadnij();
        metody.losujNumer();

        while(true){
            System.out.println("Podaj liczbe:");
            int pobranaWartosc = scanner.nextInt();
            metody.sprawdzNumer(pobranaWartosc);
            if (pobranaWartosc == metody.pobierzWylosowaneLiczby()) {
                break;
            }


        }

//        Random random = new Random();
//        for(int i = 0; i<10;i++)
//        System.out.println(random.nextInt(201 - 100));
//
//        metody.sprawdzNumer();
//        metody.losujNumer();
//        metody.pobierzWylosowaneLiczby();
//
//        System.out.println("Wygrałeś w próbie: " );

        //Czlowiek julia = new Czlowiek("Julia", 67, Sex.KOBIETA);
        //julia.przedstawSie();
        /*Wyklad julia = new Wyklad( "Julia", 15, Sex.KOBIETA);

        julia.przedstawSie();*/


        /*julia.imie = "Julia";
        julia.setWiek(15);
        julia.setPlec(1);
        julia.przedstawSie();*/

        /*Wyklad artur = new Wyklad();
         artur.imie = "Artur";
         artur.setPlec(2);
         artur.przedstawSie();

         julia.setWiek(-12);
         julia.przedstawSie();
        julia.przedstawSie();*/

//        Calculator calc = new Calculator();
//        System.out.println( calc.add(10,20));
//        System.out.println(calc.divide (3, 7));
//        calc.printOperation();
        //calc.addOperation();

//        Days dzien = Days.THURSDAY;
//        System.out.println(dzien.roboczy);
//
//        MiesiaceEnum miesiac = MiesiaceEnum.WRZESIEN;
//        System.out.println(miesiac.poraRoku);
//
    }
}
