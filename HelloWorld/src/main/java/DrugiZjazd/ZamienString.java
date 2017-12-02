package DrugiZjazd;

import java.util.Scanner;

public class ZamienString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz slowo");
        String pobranyString = scanner.nextLine();
        System.out.println("Wpisz litere");
        String zamienZ = scanner.next();
        System.out.println("Wpisz litere");
        String zamienNa = scanner.next();


        if (zamienZ.length() == 1 && zamienNa.length() == 1) {
            char chZmienZ = zamienZ.charAt(0);
            char chZamienNa = zamienNa.charAt(0);
            System.out.println(pobranyString.replace(chZmienZ, chZamienNa));
            char[] chPobranyString = pobranyString.toCharArray();
            for (int i = 0; i < pobranyString.length(); i++) {
                if (chPobranyString[i] == chZmienZ) {
                    chPobranyString[i] = chZamienNa;
                }
            }
            String nowyString = new String(chPobranyString);
            System.out.println(nowyString);
        }
        else


            System.out.println("Jestes nie dobry");

    }
//    char znak1 = scanner.next().charAt(0);
//    char znak = scanner.next().charAt(0);
}

