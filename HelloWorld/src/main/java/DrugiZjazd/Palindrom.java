package DrugiZjazd;

import java.util.Scanner;

public class Palindrom {
    public static boolean czyPalindrom(String napis) {
        int poczatek = 0;
        int koniec = napis.length()-1;
        while (poczatek < koniec) {
            if (napis.charAt(poczatek) != napis.charAt(koniec)) {
                return false;
            }
            poczatek++;
            koniec--;

        }
        return true;
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz wyraz w celu sprawdzenia czy to palindrom:");
        String napis = scanner.nextLine();
        System.out.println(czyPalindrom(napis.replace(" ", "")));
    }
}


