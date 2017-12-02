package pl.kondracka.hello;

public class TablicaJednowymiarowa {
    public static void main(String[] args) {
        int[] oceny = new int[3];
        oceny[0] = 5;
        oceny[1] = 4;
        oceny[2] = 3;

        int suma;
        suma = oceny[0] + oceny[1] + oceny[2];
        System.out.println(suma);
    }
}
