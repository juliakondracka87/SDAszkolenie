package DrugiZjazd;

import java.util.Scanner;

public class ZadSuma {
    public static void main(String[] args) {
        System.out.print("Podaj dowolną liczbę całkowitą większą od 100: ");
        Scanner scanner = new Scanner(System.in);

//         plik znajduje się w c:\żytkownicy
        int liczba = scanner.nextInt();
        int suma = 0;

        while (liczba!=0){
            suma += liczba % 10;
            liczba = liczba / 10;
//
        }
        System.out.format("Suma cyfr: %d", suma);

    }
}
