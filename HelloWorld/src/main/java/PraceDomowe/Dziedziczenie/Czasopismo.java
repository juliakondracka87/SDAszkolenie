package PraceDomowe.Dziedziczenie;

public class Czasopismo extends Publikacja{

    private int numer = 0;




    public Czasopismo(String title, double price, int numer) {
        super(title, price);
        this.numer = numer;


    }
    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }
}
