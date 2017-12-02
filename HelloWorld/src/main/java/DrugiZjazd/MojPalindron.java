package DrugiZjazd;

import java.util.Scanner;

public class MojPalindron {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wpisanyWyraz = scanner.nextLine();
        int dlugosc = wpisanyWyraz.length();
        int pierwszaOstatnia = 2;
        int ostatnia = (dlugosc - 1);
        for (int i = 0; i < dlugosc; i++) {

            if (wpisanyWyraz.charAt(i) != wpisanyWyraz.charAt(ostatnia)) {
                pierwszaOstatnia = 1;
            } else {
                pierwszaOstatnia = 0;
            }

            ostatnia--;

        }

        if (pierwszaOstatnia == 0) {
            System.out.println("Jest palindromem");
        }
        if (pierwszaOstatnia == 1) {


            System.out.println("Nie jest palindromem");
        }

    }
}
