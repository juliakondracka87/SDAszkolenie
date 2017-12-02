package PraceDomowe;

import java.util.Scanner;

/* stwórz tablicę która bd miała 5 elementów
pobierz 5 intów od użytkownika i wpisz je do tablicy (1 for)
wyświetl zawartość tablicy (1 for)
razem 2 fory*/
public class Zadanie3Tablica {

    public static void main(StringMain[] args) {

        int[] tablica = new int[5]; // int[] oceny = new int[5];
        Scanner scanner = new Scanner(System.in);//ok
        System.out.println("Podaj 5 numerków:");
        for (int i = 0; i < 5; i++) {
            tablica[i] = scanner.nextInt();
        }
        System.out.println("Wyświetl tablicę:");

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}
