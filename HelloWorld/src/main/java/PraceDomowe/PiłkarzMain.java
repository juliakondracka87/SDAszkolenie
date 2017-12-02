package PraceDomowe;

public class PiłkarzMain {
    public static void main(String[] args) {

        Piłkarz p1 = new Piłkarz("Filip");
        Piłkarz p2 = new Piłkarz("Robert", "Lewandowski", "Lewy", 21, "attack");
        System.out.println(p1.getName());
        p2.setAge(25);

        System.out.println(p2);

    }
}
