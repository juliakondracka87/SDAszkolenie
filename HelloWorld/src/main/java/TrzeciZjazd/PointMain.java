package TrzeciZjazd;

import java.util.ArrayList;
import java.util.List;

public class PointMain {
    public static void main(String[] args) {
        //ćwiczenie 3 z prezentacji
        System.out.println("********ćwiczenie 3**********");

        Point point1 = new Point(6, 7);
        Point point2 = new Point(8, 10);
        Point point3 = new Point();//0,0

        System.out.println("Point1:" + point1);
        System.out.println("Point2:" + point2);
        System.out.println("Point3:" + point3);

        point1.introduce("Point1");
        point2.introduce("Point2");
        point3.introduce("Point3");

        System.out.println();
        System.out.println("Odległość Point1 do Point2: " + point1.distance(point2));
        System.out.println("Odległość Point1 do (0,0): " + point1.distance());
        System.out.println("Odległość Point3 do (3, 4): " + point3.distance(3, 4));


//        double distance2 = point1.distance(point.getX(), point.getY());
//        double distance = point1.distance(point);
//        System.out.println(distance);
//        System.out.println(distance2);

        //ćwiczenie 4

        System.out.println("**********ćwiczenie4***********");
        Line l1 = new Line(point1, point2);
        Line l2 = new Line(point2, point3);
        Line l3 = new Line(point1, new Point(5, 9));

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println("Długość lini L1: " + l1.getLength());
        System.out.println("Równa odleglość między punktami składowymi: " + point1.distance(point2));

        //ćwiczenie 5
        System.out.println("*************ćwiczenie 5************");
        Student s1 = new Student("Marek", "Marszałkowska 5");
        System.out.println("średnia ocen " + s1 + ":" + s1.getAvgGrade());
        s1.addCourseGrade("Matematyka", 4);
        s1.addCourseGrade("Fizyka", 5);
        System.out.println("Średnia ocen:" + s1 + ":" + s1.getAvgGrade());
        System.out.println("Teacher go!");
        Teacher t1 = new Teacher("Zenon", "Broniewskiego");
        t1.addCourse("Matma");
        t1.addCourse("Fizyka");
        t1.addCourse("Matma");

        t1.removeCourse("Matma");

        System.out.println("Wyświetl liczbę kursów: " + t1.getNumCourses());

        //ćwiczenie 6
        System.out.println("***********ćwiczenie 6*************");
        //Pc e1 = new Pc (7.8, 9.0, 1.9);
        Enemy e2 = new Yeti();
        Enemy e3 = new Nazi();
        Enemy e4 = new Orc();

        List<Enemy> enemies = new ArrayList<>();
        //enemies.add(e1);
        enemies.add(e2);
        enemies.add(e3);
        enemies.add(e4);
        enemies.add(new Yeti());

        for (Enemy e : enemies) {
            e.attack();
            e.defend();
        }

        System.out.println("********Ćwiczenie 7**********");
        Shape sh1 = new Rectangle("niebieski", 5, 10);
        //Shape sh2 = new Shape(); cannot instantiate abstract class
        Shape sh2 = new Triangle("zielony", 7, 8);
        System.out.println(sh1);
        System.out.println(sh2);

        printShapeData(sh1);
        printShapeData(sh2);

        System.out.println("********Ćwiczenie 8**********");
        Rect rect = new Rect(5, 8);
        Interfacowe si1 = rect;
        Interfacowe si2 = new Tria(6, 8);

        System.out.println(si1);
        System.out.println(si2);

        printInterfacoweData(si1);
        printInterfacoweData(si2);

        printPaperDoc(rect);

    }

    public static void printShapeData(Shape s) {
        System.out.println("Wspólny interfejs - powierzchnia: " + s.getArea());
    }

    public static void printInterfacoweData(Interfacowe s) {
        System.out.println("Wspolny interfejs - powierzchnia: " + s.getArea());
    }

    public static void printPaperDoc(Printable p) {

    }

}



