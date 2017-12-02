package PraceDomowe;

public class CMain {

    public static void main(String[] args) {
        Circle c1 = new Cylinder(6,"red", 7);
        c1.setRadius(5);
        System.out.println(c1);
        System.out.println(c1.test());
//        System.out.println("Volumne is " + c1.getVolume());
//        System.out.format("Volumne is %.2f", c1.getVolume());
    }
}
