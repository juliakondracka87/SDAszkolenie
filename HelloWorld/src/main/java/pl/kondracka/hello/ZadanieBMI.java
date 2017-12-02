package pl.kondracka.hello;

import javax.jws.soap.SOAPBinding;

public class ZadanieBMI {
    public static void main(String[] args){

        /*Napisać program, który oblicza wartość współczynnika BMI (ang. body mass index)
        wg. wzoru: waga/wzrost^2 . Jeżeli wynik jest w przedziale (18,5 - 24,9)
        to wypisuje „waga prawidłowa”, jeżeli poniżej to „niedowaga”, jeżeli powyżej „nadwaga”.*/

        float waga = 76f;
        float wzrost = 1.68f;

        float BMI = (waga/(wzrost*wzrost));


        if (BMI >= 18.5 && BMI <= 24.9 ) {
            System.out.println("waga prawidłowa");
        }

        else if (BMI < 18.5) {
            System.out.println("niedowaga");
        }

        else {
            System.out.println("nadwaga");
        }
    }
}
