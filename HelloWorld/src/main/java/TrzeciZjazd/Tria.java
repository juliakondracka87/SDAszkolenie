package TrzeciZjazd;

public class Tria implements Interfacowe {

    private double a = 0.0;
    private double h = 0.0;

    @Override
    public double getArea() {
        return 0.5 * a * h;
    }

    @Override
    public String toString() {
        return "Tria{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }

    public Tria(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
