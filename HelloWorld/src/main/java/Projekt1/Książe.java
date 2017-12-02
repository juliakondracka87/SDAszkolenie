package Projekt1;

public class Książe extends Charakter {
    public Książe (double hp, double ap, double dp) {
        super(hp, ap, dp);
    }

    public void attack() {
        System.out.println(Książe.class.getSimpleName()+ " zadaje " + getAp() + " punktów obrażeń." );

    }


    public void defend() {
        System.out.println(Książe.class.getSimpleName()+ "pochłąnia" + getDp() + "punktów obrażeń.");

    }
}
