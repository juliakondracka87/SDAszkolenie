package pl.kondracka.hello;

public class ZadaniePlanLekcji {
    public static void main(String[] args) {
       /* Program wykładów na pewnej uczelni wygląda następująco
        8-10 – Matematyka
        11-12 – Prawo
        13 – przerwa
        14 – 15 laboratorium
        16-18 Systemy


                [9:33]
        Napisz program który po podaniu godziny wyświetli informacje o wszystkich zajęciach które wydarzą się w tej
        i następnych godzinach.
                Np. 11 => 11 Prawo, 12 Prawo, 13 Przerwa, 14 Laboratorium, 15 Laboratorium,
                16 Systemy, 17 Systemy, 18 Systemy*/

        int h = 11;
        switch (h) {
            case 8:
                System.out.println("8 - Matematyka");


            case 9:
                System.out.println("9 - Matematyka");


            case 10:
                System.out.println("10 - Matematyka");

            case 11:
                System.out.println("11 - Prawo");


            case 12:
                System.out.println("12 - Prawo");


            case 13:
                System.out.println("13 - przerwa");

            case 14:
                System.out.println("14 - labolatorium");


            case 15:
                System.out.println("15 - labolatorium");


            case 16:
                System.out.println("16 - Systemy");

            case 17:
                System.out.println("17 - Systemy");


            default:
                System.out.println("Impreza");
        }
    }
}
