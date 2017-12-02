package PraceDomowe.Kompozycja;

public class Książka {
    private Osoba autor;
    private String tytuł;
    private double cena;

    public Książka() {
    }

    public Książka(Osoba autor, String tytuł, double cena) {
        this.autor = autor;
        this.tytuł = tytuł;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Książka{" +
                "autor=" + autor +
                ", tytuł='" + tytuł + '\'' +
                ", cena=" + cena +
                '}';
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
