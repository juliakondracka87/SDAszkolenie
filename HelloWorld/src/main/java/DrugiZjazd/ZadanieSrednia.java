package DrugiZjazd;

import java.util.Scanner;

public class ZadanieSrednia {

    /*public static int max2(int a, int b){
    if (a > b){
        return a;
    }
    return b;
    }
    public static int min2(int a, int b){
        if(a<b)
   */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pobranaWartosc = scanner.nextInt();
        int min = pobranaWartosc;
        int max = pobranaWartosc;
        int suma = pobranaWartosc;
        int iloscLiczb = 1;//pobranie pierwszej liczby

        while(true){//while(((pobranaWartosc=scanner.next()) !=0){
            pobranaWartosc = scanner.nextInt();//tego nie ma

        if(pobranaWartosc == 0){//tego niema
            System.out.println("min: "+min);//to na koniec
            System.out.println("max: " + max);//na koniec
            System.out.println("srednia: " + suma/(double)iloscLiczb);//na koniec
        break;//wtedy bez break
        }
        else {//tego nie ma
            if (pobranaWartosc > max) {
                max = pobranaWartosc;
            }
            if (pobranaWartosc < min){
                min = pobranaWartosc;
            }
            suma+=pobranaWartosc;
            iloscLiczb++;
            //int liczby = scanner.nextInt();
            }

        }
    }
}

