package TrzeciZjazd;

import java.util.Scanner;

public class GraStatki {
    public static void main(String[] args) {

        Pc pc = new Pc();
        pc.placeShip();
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("wpisz dwie cyfry od 0 do 10");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            player.shot(pc, x, y);

        }
        while (pc.getShip().isAlive());
        System.out.println("Trafiony zatopiony!!");

    }

}
