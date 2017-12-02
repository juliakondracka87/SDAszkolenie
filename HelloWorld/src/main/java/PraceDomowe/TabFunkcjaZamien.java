package PraceDomowe;

/*Zadanie 5:
Utwórz tablice o wartościach {10,15,20,30} a następnie funkcje która jako argument przyjmuje a,b (liczby całkowite)
oraz tablicę
Wynik: Zamienia elementy w tablicy (tzn. a z b)
Ex: zamien(1,2,tablica) -> {15,10,20,30}

Utwórz jedną tablice (dwuwymiarową) o wartościach
{10,15,20,30}
{51,231,212,12}
{51,21,576,21}
{12,3,5,8}
A następnie funkcję, która jako argument przyjmuje tablicę i liczy sumę elementów na przekątnej, oraz ją zwraca.
(zakładamy, że tablica dwuwymiarowa jest tablicą kwadratową)*/
public class TabFunkcjaZamien {

    public static void zamien(int a, int b, int[] tab1) {
        int temp = 0;
        int i=0;
        temp = tab1[i];
        tab1[i] = tab1[i + 1];
        tab1[i + 1] = temp;
//        for (int i = 0; i < tab1.length; i++) {

// if ( a == tab1[i] || a == tab1[i] ){
//                for(int j = 0; j < tab1.length; j++){
//                    if(a == tab1[j]&& i!=j || b == tab1[j] && i!=j){



        }


//            b = tab1[i];
//            a = tab1[i];

//            System.out.println();
//            System.out.println(tab1[i]+" ");
//            System.out.println("A tablica[i] "+tab1[i]);
//            System.out.println("I: "+ i);
//            System.out.println("......Koniec obiegu petl");



    public static void main(StringMain[] args) {

        int[] tab1 = {10, 15, 20, 30};

        System.out.println("Tablica przed: ");
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }

        int a = 1;
        int b = 2;

        zamien(a, b, tab1);

        System.out.println();
        System.out.println("Tablica po: ");

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
            //System.out.println("co z tego wyjdzie" + tab1[i]+" ");

        }
    }
}







