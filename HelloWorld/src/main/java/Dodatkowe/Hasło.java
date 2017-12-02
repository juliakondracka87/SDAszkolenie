package Dodatkowe;

import java.io.Console;

public class Hasło {
    public static void main(String[] args) {
        Console cons = System.console();
        String username = cons.readLine("Nazwa użytkownika: ");
        char[] password = cons.readPassword("Hasło: ");
        username = "Nadpisany użytkownik";
    }
}
