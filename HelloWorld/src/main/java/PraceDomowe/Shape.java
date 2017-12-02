package PraceDomowe;
/*Zadanie 2:
        Stwórz klasę `Shape`, która ma spełniać następujące wymogi:
        1. Mieć prywatne atrybuty:
        `x`, `y` (określające środek tego kształtu) i `color`.
        2. Posiadać konstruktor przyjmujący zmienne określające wartości `x`, `y` i `color`.
        Konstrukto9r powinien wypisywać informacje o właśnie stworzonym kształcie.
        3. Mieć funkcję wypisującą informacje o tym kształcie.
        4. Mieć funkcję zwracającą odległość od innego kształtu.
        5. Spróbuj `color` ze stringu przerobić na `enum`*/


public class Shape {
    private double x;
    private double y;
    private KolorytEnum colour;
    private Line linia;

    public Shape(double x, double y, KolorytEnum ...colour) {
        this.setX(x);
        this.setY(y);
        this.colour = colour[0];
        this.info();
        this.linia = new Line(colour[1]);
    }

    public void info() {
        System.out.println("Wyświetl informacje o stworzonym kształcie: [" + this.getX() + "," + this.getY() + "] " + this.colour);
    }


    public double odleglosc(Shape shape) {
        System.out.println("Metoda odleglosc 1.");
        double result = Math.sqrt((Math.pow((shape.x - this.x), 2)) + (Math.pow((shape.y - this.y), 2)));
        return result;
    }

    public double odleglosc(double x2, double y2) {
        System.out.println("Metoda odleglosc 2.");
        double result = Math.sqrt((Math.pow((x2 - this.x), 2)) + (Math.pow((y2 - this.y), 2)));
        return result;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Line {
    public Line(KolorytEnum colour) {
        System.out.println("Tworzę linię " + colour);
    }
}