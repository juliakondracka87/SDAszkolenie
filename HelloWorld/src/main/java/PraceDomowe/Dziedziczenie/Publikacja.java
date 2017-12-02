package PraceDomowe.Dziedziczenie;

public class Publikacja {

    private String title ="";
    private double price = 0.0;

    public Publikacja() {
    }

    public Publikacja(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Publikacja{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
