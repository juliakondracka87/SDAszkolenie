package PraceDomowe;
/*Utwórz jedną tablice (dwuwymiarową) o wartościach
{10,15,20,30}
{51,231,212,12}
{51,21,576,21}
{12,3,5,8}
A następnie funkcję, która jako argument przyjmuje tablicę i wyświetla jej elementy w postaci macierzowej

Wynik:
10,15,20,30
51,231,212,12
51,21,576,21
12,3,5,8*/
public class TablicaMacierz {

    public static void zmienNaMacierz(int[][] macierz) {

        for (int i = 0; i < macierz.length; i++) {//czy jest różnica w tym przypadku czy ++i, i++
            for (int j = 0; j < macierz[i].length; ++j) {
                System.out.print((macierz[i][j]) + ",");
            }
                System.out.println();
            }
        }
    public static void main(StringMain[] args){

        int[][] macierz = { {10,15,20,30} , {51,231,212,12} , {51,21,576,21} , {12,3,5,8}};

        zmienNaMacierz(macierz);

    }
}
