package pl.kondracka.hello;

import java.util.Scanner;

public class ZadanieFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą większą od zera:");
        int max = scanner.nextInt();

    int suma = 0;
    for(int i=1; i <= max; i++){
    suma += i;
        System.out.println(i);
        System.out.println(suma);
    }
    }

}
