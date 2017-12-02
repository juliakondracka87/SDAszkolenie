package pl.kondracka.hello;

public class Metody {

    /*public static void helloWorld(){
        System.out.println("Hello World");
    }
    public static void main(String[] args){

        helloWorld();
    }

    */
    public static int max2(int L1, int L2) {
        if (L1 > L2) {
            return L1;
        } else {  /* nie musi być tego elsa, nawet lepiej jak go nie ma wystarczy sam return*/
            return L2;
        }
    }
    public static int max3(int L1, int L2, int L3){

        /*
        max2 = (
        int maxLiL2 = max2(L1, L2);
        int maxL1L2L3 = max2(maxLiL2, L3);
        return maxL1L2L3;

        if (L1 > L2){
            return L1;
        }
         else if (L2 > L3) {
            return L2;
        }
            return L3 ;*/
        return max2(max2(L1,L2), L3);
    }
    public static void main(String[] args) {
        int maksymalna = max2(10, 20);
        System.out.println(maksymalna);

        int maksymalna1 = max3(7, 60, 78);
        System.out.println(maksymalna1);
}}
