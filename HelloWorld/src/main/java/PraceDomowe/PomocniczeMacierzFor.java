package PraceDomowe;

import java.util.Random;

public class PomocniczeMacierzFor {
    public static void main(StringMain[] args) {

        Random los = new Random();
        int[][] macierz = new int[4][5];


            int sumaP = 0;
            int sumaN = 0;
            int ileP = 0;

            for (int w = 0; w < macierz.length; w++) {
                for (int k = 0; k < macierz[w].length; k++) {
                    macierz[w][k] = los.nextInt();
                    if (macierz[w][k] % 2 == 0) {
                        ileP++;
                        sumaP += macierz[w][k];
                    } else
                        sumaN += macierz[w][k];
                    System.out.print((macierz[w][k]) + " | ");

                    System.out.println();
                }
            }
            System.out.println("Ilosc parzystych = " + ileP + " ilosc nieparzystych = " + (5 * 4 - ileP));

        }
    }
