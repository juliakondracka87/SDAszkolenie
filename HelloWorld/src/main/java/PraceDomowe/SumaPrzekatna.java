package PraceDomowe;

public class SumaPrzekatna {
    public static int sumaNaPrzekatnej(int sumaprzyp, int[][] tab2) {

        for (int i = 0; i <= 3; i++) {

            sumaprzyp = sumaprzyp + tab2[i][i];
            //System.out.println(sumaprzyp); jezeli tu wydrukujemy pokaże etapy dodawania tych elementow z przekatnej.

        }
        return sumaprzyp;
    }


    public static void main(StringMain[] args) {
        int tab2[][] = {{10, 15, 20, 30}, {51, 231, 212, 12}, {51, 21, 576, 21}, {12, 3, 5, 8}};
        int sumaprzyp = 0;

        sumaNaPrzekatnej(sumaprzyp, tab2);

        System.out.println(sumaNaPrzekatnej(sumaprzyp, tab2));



    }
}
