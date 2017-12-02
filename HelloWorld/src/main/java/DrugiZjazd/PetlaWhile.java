package DrugiZjazd;

import java.util.Scanner;

public class PetlaWhile {
    public static void main(String[] args) {
// public static int max2(int l1, int l2){
        // if{l1>l2){
        // return l1;
        // }
        //return 2;
    //}
        //public static int min2(int l1, int l2){
        // if(l1>l2){
        //return l2;
        //}
        //return l1
        //}
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b  = scanner.nextInt();

        //int a = min2(l1,l2);
        //int b = max2(l1,l2);
        //int suma = 0;
        int suma = 0;
        for(;a<=b;a++) {//moze być for(int i = a; i<=b;i++){ suma+=i; nie musimy podawac pocztku petli
            suma += a;
        }
        System.out.println(suma);
        //while(warunek){ instrukcje} łatwo zrobić petle nieskończoną, trzeba pamiętać zeby zrobić element który zmienia warunek np i++
        //mozna break

        /*
        do {
        //instrukcja
        }
        while(warunek);


        continue

        while(warunek)
        continue
        }*/

        //petla w petli:
    }
}
