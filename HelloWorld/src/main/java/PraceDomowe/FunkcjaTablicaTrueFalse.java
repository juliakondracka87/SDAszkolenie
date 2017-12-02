package PraceDomowe;

public class FunkcjaTablicaTrueFalse {
    /*Napisz funkcję, która sprawdza, czy zmienna przekazana jako pierwszy parametr występuje w
      tablicy przekazanej jako drugi parametr.
     Jeżeli tak funkcja ma zwrócić `true`, jeżeli nie `false`.*/


    public static boolean trueOrFalse(int x, int[][] tablica) {

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; ++j) {

                if (x == tablica[i][j]) {
                    return true;
                }
            }
        }
                    return false;
    }
    public static void main(StringMain[] args) {

        int x = 30;
        int[][] tablica = {{10, 15, 20, 30}, {51, 231, 212, 12}, {51, 21, 576, 21}, {12, 3, 5, 8}};

        if (trueOrFalse(x, tablica)) {
            System.out.println(true);
        }
        else{
        System.out.println(false);
    }}
}

