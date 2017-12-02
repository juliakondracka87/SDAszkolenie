package PraceDomowe.Kompozycja;

public class Main{
    public static void main(String[] args) {
        Książka lektura = new Książka(new Osoba("Henryk", "Sienkiewicz"), "Potop",55.20);

        lektura.setTytuł("Ogniem i mieczem");
        System.out.println(lektura);
    }
}
