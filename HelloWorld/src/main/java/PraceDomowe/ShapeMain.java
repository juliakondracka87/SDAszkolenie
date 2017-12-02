package PraceDomowe;

public class ShapeMain {
    public static void main(StringMain[] args){

        Shape shape = new Shape(3.5, 4.5, KolorytEnum.PINK, KolorytEnum.WHITE);
        //shape.info();
        Shape shape2 = new Shape (6.7, 8.9, KolorytEnum.BLACK, KolorytEnum.RED);
        double odleglosc = shape2.odleglosc(shape);
        System.out.println(odleglosc);
        double odleglosc2 = shape2.odleglosc(shape.getX(), shape.getY());
        System.out.println(odleglosc2);
    }
}
