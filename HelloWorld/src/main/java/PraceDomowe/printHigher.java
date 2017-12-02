package PraceDomowe;

/*Napisz funkcję `printHigher` która przyjmuje jako parametr tablicę oraz liczbę.
Wynik: Wypisze na ekranie wszystkie liczby większe bądź równe zadanej liczbie.*/
public class printHigher {

    public static void printHigher(int x, int[] tablica) {
        System.out.println("Wypisz wszystkie liczby większe bądź równe 4: ");
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] >= x) {
                System.out.print(tablica[i] + ",");
            }
        }
        System.out.println();
    }

    public static void main(StringMain[] args) {

        int x;
        x = 4;
        int[] tablica = {2, 3, 5, 7, 8, 9, 10};

        printHigher(x, tablica);


    }
}
