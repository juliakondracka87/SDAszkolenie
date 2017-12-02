package pl.kondracka.hello;

public class PetlaWpetli {
    public static void main(String[] args){

        int liczba = 1;
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                System.out.println(liczba);
                liczba++;
            }
        }
    }
}
