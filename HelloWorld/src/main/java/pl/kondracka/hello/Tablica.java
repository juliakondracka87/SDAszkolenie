package pl.kondracka.hello;

public class Tablica {

    public static void zmien(int[] x){
        System.out.println(x[0]);
        x[0] = 4;
        System.out.println(x[0]);

    }
    public static void zmien2(int y){
        System.out.println(y);
        y = 3;
        System.out.println(y);
    }
    public static void main(String[] args){

        int[] x = {10, 30};
        x[0] = 6;
        zmien(x);//odpala sie funkcja tablica zostaje przenoesiona
        System.out.println(x[0]);//oddaje nam tablice z 4 z przodu nam
        System.out.println(x);//wyswietlenie adredu tablicy
        System.out.println("To wyzej to jest tablica");
        System.out.println(".................");

        int z = 10;
        System.out.println(z);
        zmien2(z);//z jest kopiowana i mozesz sobie z nią robić co chcesz; zmiana wartosci na gorze
        // a na dole pozostaje 10
        System.out.println(z);
    }
}
