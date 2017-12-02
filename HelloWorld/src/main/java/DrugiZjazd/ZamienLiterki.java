package DrugiZjazd;

import java.util.Scanner;

public class ZamienLiterki {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo:");
        String napis = scanner.nextLine();

        int wystapieniaO = 0;
        int wystapieniaA = 0;
        for (int i = 0; i < napis.length(); i++) {
            if (napis.charAt(i) == 'a') {
                wystapieniaA++;
            }
        }
        System.out.println("A jest: " + wystapieniaA);
        System.out.println("O jest:" + wystapieniaO);

    }
}
