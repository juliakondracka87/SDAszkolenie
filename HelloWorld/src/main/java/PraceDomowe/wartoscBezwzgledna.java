package PraceDomowe;

import java.util.Scanner;

public class wartoscBezwzgledna {
    public static void main(StringMain[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą dodatnią bądź ujemną:");
        int bezwzgledna = scanner.nextInt();

        if (bezwzgledna < 0 ){
            System.out.println("bezwzgledna = " + "|" + bezwzgledna*(-1) + "|");
        }
        else{
            System.out.println(bezwzgledna);
        }
    }
}
