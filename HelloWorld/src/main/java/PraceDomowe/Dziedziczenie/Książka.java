package PraceDomowe.Dziedziczenie;

public class Książka extends Publikacja{
    private String autor = "";

    public Książka(String title, double price, String autor) {
        super(title, price);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
