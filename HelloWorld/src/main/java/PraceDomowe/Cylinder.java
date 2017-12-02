package PraceDomowe;

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "This is a " + getColor() + " Cylinder, which has " + height + " height and "+ getRadius() + " radius.";
    }

    public String test(){
        return "To jest CYLINDER";
    }


}
