package Dodatkowe;

public class Main {

    public static void main(String[] args) {
        Person michal = new Person();//konstruktor domyslny
        michal.name = "Michał";
        michal.surname = " Makaruk";
        michal.age = 30;
        System.out.println(michal.name+" "+ michal.age);

        Person jola = new Person();
        jola.name ="Jola";
        jola.surname = "Kowalska";
        System.out.println(jola.age);

    }
}