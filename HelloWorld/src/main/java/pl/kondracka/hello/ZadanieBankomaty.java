package pl.kondracka.hello;

public class ZadanieBankomaty {

    /*Mamy do dyspozycji monety i banknoty o nominałach 1,2,5,10,20 zł
Napisz funkcję która podaną przez użytkownika kwotę zamieni na jak najmniejszą liczbę banknotów (lub monet).
Wynik wypisze na ekranie np.

Dla 198 zł =>
Banknotów 20 zł -> 9
Banknotów 10 zł -> 1
Banknotów 5 zł –> 1
Banknotów 2 zł-> 1
Banknotów 1zł -> 1*/

    public static void rozmien(int wartosc){
        int zl20 = wartosc/20;
        System.out.println("Banknotow 20zl: " + zl20);
        //wartosc = wartosc - zl20*20;
        wartosc -= zl20*20;
        int zl10 = wartosc/10;
        System.out.println("Banknotow 10 zl: " + zl10);
        //wartosc = wartosc - zl10*10;
        wartosc -= zl10*10;
        int zl5 = wartosc/5;
        System.out.println("Bilonu 5 zl: " + zl5);
        wartosc -= zl5*5;
        int zl2 = wartosc/2;
        System.out.println("Bilonu 2 zl: " + zl2);
        wartosc -= zl2*2;
        int zl1 = wartosc/1;
        System.out.println("Bilonu 1 zl: " + zl1);
        wartosc -= zl1*1;


    }

    public static void main(String[] args){
        rozmien(198);
    }
}
