package pl.kondracka.hello;

public class Petle {

    public static void zmien(int y){//druga zmienna, dwa miejsca zarezerwowane w pamieci ram,
        // to jest skopiowana nazwa, tylko zmienne dadząsie kopiować, tablicy nie da sie skopiowac
        System.out.println(y);
        y = 3;
        System.out.println(y);

    }
    public static void main(String[] args) {
        int x = 10;//tulko w tej funkcji istnieje ten x
        x = 5;
        System.out.println("x = " +x);
        zmien(x);
        System.out.println("nowy x = " +x);//będziemy miec jedna instrukcje tyle razy ile będziemy chceili
        // az nie zajdzie jakis warunek koncząc,

        //for(inicjalizacja;sprawdzenieWARUNKU; AKUALIZACJA)

        //W TABLICACH
        int[] tablica = {10, 20, 30};
        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println("Ogien z petla");

        for(int i=0; i < tablica.length; i++){//przyjmujemy wartosc i 0 sprawedzamy warunek wyswietlamy pierwsze miejse w tabeli,
            //nie może być znak wieksze rowne
            int element = tablica[i]; //kopiuje wartość z tablicy[i] czytaj "od i"
            System.out.println(tablica[i]);
            element = 5; //zmieniam element z 10 na 5
            System.out.println("Nowy element: "+element);
            System.out.println("A tablica[i] "+tablica[i]);
            System.out.println("......Koniec obiegu petl");
        }

        int i = 0;
        for(int element : tablica){//dla kazdego elementu(to mozna zmienić) z tablicy
            System.out.println(element);
            element = 5;
            System.out.println("Nowy element: "+ element);
            System.out.println("A tablica[i] "+tablica[i]);
            System.out.println("I: "+ i);
            System.out.println("......Koniec oniegu....");
            i++;
        }
// tablica dwuwymiarowa
    }
}
