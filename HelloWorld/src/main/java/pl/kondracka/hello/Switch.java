package pl.kondracka.hello;

public class Switch {
    public static void main(String[] args) {
        int zmienna = 2;

        switch (zmienna) {
            case 1:
                System.out.println("Poniedziałek");
                break;

            case 2:
                System.out.println("Wtorek");
                break;

            case 3:
                System.out.println("Środa");
                break;

            default:
                System.out.println("Nic!");


        }
    }
}
