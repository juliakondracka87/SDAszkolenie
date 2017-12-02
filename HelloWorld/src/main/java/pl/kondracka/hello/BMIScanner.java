package pl.kondracka.hello;

import java.util.Scanner;

public class BMIScanner {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją wagę w kg ");
        float waga = scanner.nextFloat();
        System.out.println("Podaj swoją wagę w kg ");
        float wzrost = scanner.nextFloat();

        float BMI = (waga / (wzrost * wzrost));

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("waga prawidłowa");
        } else if (BMI < 18.5) {
            System.out.println("niedowaga");
        } else {
            System.out.println("nadwaga");
        }

    }
}
