package PraceDomowe;

/*
* Napisz funkcję `max` która przyjmuje jako parametr tablicę i posortuje ją rosnąco.
(np. algorytm BUBBLESORT)*/

public class MaxAlgorytmBublesort {
    public static void main(StringMain[] args) {

        int[] tablica = {9, 7, 6, 8, 4, 5, 4, 3};
        System.out.println("Tablica przed sortowaniem: ");
        for (int i : tablica) {
            System.out.print(i + ",");
        }
        System.out.println();
        bubbleSort(tablica);
        System.out.println("Tablica po sortowaniu: ");
        for (int i : tablica) {
            System.out.print(i + ",");
        }
    }

    private static void bubbleSort(int[] tablica) {
        int temp = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 1; j < (tablica.length) - i; j++) {
                if (tablica[j - 1] > tablica[j]) {
                    // swapujemy elementy
                    temp = tablica[j - 1];
                    tablica[j - 1] = tablica[j];
                    tablica[j] = temp;

                }
            }
        }
    }
}
       /*nt y = 0;
        for (int i = 0; i <= 10; ++i) {
            System.out.println(i + " - " + ++x + " - " + y++);
            System.out.println(i + " - " + x + " - " + y);
        }
    }
    public static void main(StringMain[] args) {
        incrementacja();
    }
   /* public static void sort(int[] tablicaSortowanie){

        int[] tablicaSortowanie = {3,6,8,4,3,2,5};
       for(int i=0 ; i<tablicaSortowanie.length -1 ; i++){
           for(int j=0 ; j < tablicaSortowanie.length - 1 - i ; i++){


               //System.out.println(list[i]);
           }
       }
   }*/



    /*public static void swap(int[] arr){

        int[] list = {3,6,8,4,3,2,5};

        bubbleSort(list);
    }
}
*/