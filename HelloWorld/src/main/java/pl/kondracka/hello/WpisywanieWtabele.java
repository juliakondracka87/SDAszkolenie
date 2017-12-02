package pl.kondracka.hello;

import java.util.Scanner;

public class WpisywanieWtabele {
    public static void main(String[] args) {

//        int[] tablica = new int[5];
//        System.out.println("Wypełnij i wyświetl tablicę:");
//        for(int i=0 ; i < tablica.length; i++){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Podaj 5 numerków:");
//            int numerek1 = scanner.nextInt();
//            int numerek2 = scanner.nextInt();
//            int numerek3 = scanner.nextInt();
//            int numerek4 = scanner.nextInt();
//            int numerek5 = scanner.nextInt();
//            tablica[0]=numerek1;
//            tablica[1]=numerek2;
//            tablica[2]=numerek3;
//            tablica[3]=numerek4;
//            tablica[4]=numerek5;
//        }
//        for (int i=0 ; i<tablica.length; i++){

        //System.out.print(tablica[i] + ",");

//        System.out.println();
//        int suma;

//        for(int i = 0; i<tablica.length;i++){
//            int liczba = scanner.nextInt();
//            suma+=tablica[i];
//            System.out.println(suma);

        //if(tablica[i]!=0){

        //System.out.println(suma);}
        // else{
        // }
        int[] tablica;
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj ilość elementów: ");
        int liczbaElementow = odczyt.nextInt();
        tablica = new int[liczbaElementow];

        for (int i = 0; i < tablica.length; i++)

        {
            tablica[i] = i + 1;
        }
        int licznik = 0;
        while (licznik < tablica.length)

        {
            System.out.print(tablica[licznik] + " ");
            licznik++;
        }

    }


}

