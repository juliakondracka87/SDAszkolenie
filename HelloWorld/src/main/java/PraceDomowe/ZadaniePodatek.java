package PraceDomowe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ZadaniePodatek {
   /*Napisać program obliczający należny podatek dochodowy od osób fizycznych. Program ma pobierać od użytkownika
   dochód i po obliczeniu wypisywać na ekranie należny podatek. Podatek obliczany jest wg. następujących reguł:
• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
• od 85.528 podatek wynosi 14.839,02 zł 90+ 32% nadwyżki ponad 85.528,00*/

    public static void main(StringMain[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój dochód:");
        float income = scanner.nextFloat();
//        System.out.println(income);
        System.out.println("Twój podatek wynosi:");
        if (income <= 85528){


            System.out.println(new DecimalFormat("##.##").format(income * 0.18 - 556.02));

        }
        else {
//            System.out.println("Twój podatek wynosi:");
            System.out.println(new DecimalFormat("##.##").format((income - 85528)* 0.32 + 14.839));
        }

    }
}
