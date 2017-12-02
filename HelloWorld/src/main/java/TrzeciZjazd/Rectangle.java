package TrzeciZjazd;

public class Rectangle extends Shape{
   private double a = 0.0;
   private double b = 0.0;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {

        return a*b;
    }

    @Override
    public String toString() {
        return "Jestem prostokątem. " + super.toString() + " i powierzchnię " + getArea();

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



