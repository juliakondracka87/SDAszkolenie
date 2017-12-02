package PraceDomowe;

//4) Pobieraj od użytkownika liczby int, licz ich sume Jeżeli użytkownik poda '0' => wyświetl policzoną sume

import java.util.Scanner;

public class Zadanie4Sumowanie {


    public static void main(StringMain[] args) {


        System.out.println("Wypełnij i wyświetl tablicę:");

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.println("Podaj 5 numerków:"); //
        while (true) {
            int numerek = scanner.nextInt();
            if (numerek == 0) {
                break;
            }
            suma += numerek;
        }
        System.out.println(suma);

           /* int suma = 0;
            for (int i = 0; i < tablica.length; i++) {

                suma += tablica[i];
                if (tablica[i] == 0) {
                    System.out.println(suma);*/

    }


}




//System.out.println();
//int suma;

//        for(int i = 0; i<tablica.length;i++){
//            int liczba = scanner.nextInt();
//            suma+=tablica[i];
//            System.out.println(suma);

//if(tablica[i]!=0){

//        System.out.println(suma);}
//         else{
//         }








