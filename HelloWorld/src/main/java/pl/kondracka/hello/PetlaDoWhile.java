package pl.kondracka.hello;

import java.util.Scanner;

public class PetlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.println("Wpisz hasło (minimum 5 znaków):");
            password = scanner.nextLine();
        } while(password.isEmpty() || password.length() < 5);
        System.out.println("Brawo, udało się!");
    }

}
