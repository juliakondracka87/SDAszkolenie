package pl.kondracka.hello;

public class WarunekLogiczny {
    public static void main(String[] args) {
        /*if(3 > 2){
            System.out.println(";)");}
        if(4 < 5){
            System.out.println(";)");}
        if((2 -2) == 0) {
            System.out.println(";)");
        }
            System.out.println("Przed blokiem");

        if(2 > 3) {
            System.out.println(":)");
        }
        else {
            System.out.println(";(");
        }

            System.out.println("Po bloku");

        }*/
        int a = 30;
        int b = 40;
        int c = 25;

        if (a > b && a > c) {
                System.out.println(a);
            }
        else if (b > c) {
            System.out.println(b);
        }
        else {
            System.out.println("tutaj "+c);
        }
    }
}


