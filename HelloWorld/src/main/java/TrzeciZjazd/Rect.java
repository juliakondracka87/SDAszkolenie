package TrzeciZjazd;

public class Rect implements Interfacowe, Printable {

    private double a = 0.0;
    private double b = 0.0;

    @Override
    public double getArea() {

        return a * b;
    }

    @Override
    public void print() {
        System.out.println("Printing rect...");
    }

    public Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + getArea() + '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
