package TrzeciZjazd;

public abstract class Shape {
   private String color = "czerwony";

    public Shape() {
    }

    public Shape(String color) {

        this.color = color;
    }

    abstract public double getArea();

@Override
    public String toString() {

    return "Mam kolor " + color;
    }
    public String getColor() {

    return color;
    }

    public void setColor(String color) {

    this.color = color;
    }
}
