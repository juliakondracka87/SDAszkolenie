package PraceDomowe.Dziedziczenie;

public class Main {
    public static void main(String[] args) {

        Książka lektura = new Książka("Lalka",60.00,"Bolesłąw Prus");
        Czasopismo gazeta = new Czasopismo("Cosmopolitan",6.00,1 );

        lektura.setAutor("Henryk Sienkiewicz");
        System.out.println(lektura.getAutor());
        System.out.println(gazeta.getNumer());
    }
}
