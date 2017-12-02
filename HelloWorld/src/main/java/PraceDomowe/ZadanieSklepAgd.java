package PraceDomowe;

import java.util.Scanner;

public class ZadanieSklepAgd {

    /*W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program umożliwiający
    wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla programu są:
• cena towaru (od 100 zł do 10 tys. zł),
• liczba rat (od 6 do 48).
Kredyt jest oprocentowany w zależności od liczby rat:
• od 6–12 wynosi 2.5% ,
• od 13–24 wynosi 5%,
• od 25–48 wynosi 10%.
Obliczona miesięczna rata powinna zawierać również odsetki.
Program powinien sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach,
a w przypadku błędu pytać  użytkownika ponownie o podanie danych.
    */
    public static void main(StringMain[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać cenę towaru:");
        float price = scanner.nextFloat();
        System.out.println("Proszę podać liczbę rat:");
        float amount = scanner.nextFloat();


            do {
                if (amount >= 6 && amount <= 12 && price >= 100 && price <= 10000) {
                    System.out.format("Miesięczna rata wynosi: %.2f złotych",(price * 0.025 / amount) + (price / amount));
                    break;
                } else if (amount >= 13 && amount <= 24 && price >= 100 && price <= 10000) {
                    System.out.format("Miesięczna rata wynosi: %.2f złotych" ,(price * 0.5 / amount) + (price / amount));
                    break;
                } else if (amount >= 25 && amount <= 48 && price >= 100 && price <= 10000) {
                    System.out.format("Miesięczna rata wynosi: %.2f złotych" ,(price * 0.1 / amount) + (price / amount));
                    break;
                } else {
                    System.out.println("Proszę wprowadzić poprawne dane:");
//                    System.out.println(price + " nie mieści się w przedziale (");
//                    System.out.println(amount);
//                    System.out.println("są niepoprawne.");
                    System.out.println("Proszę podać cenę towaru:");
                    price = scanner.nextFloat();
                    System.out.println("Proszę podać liczbę rat:");
                    amount = scanner.nextFloat();
                }
            } while (amount >= 6 || amount <= 48 || price >= 100 || price <= 10000);

        }
    }
