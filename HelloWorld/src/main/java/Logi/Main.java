package Logi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        User u = new User( "dream", "tajne");
        u.validate("tajne");
        Scanner scanner = new Scanner(System.in);
        u.validate(scanner.nextLine());
    }
}
