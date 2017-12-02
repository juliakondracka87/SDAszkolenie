package Projekt1;

public class Król extends Charakter {

    public Król (double hp, double ap, double dp) {
        super(hp, ap, dp);
    }


    public void attack() {
        System.out.println(Król.class.getSimpleName()+ " zadaje " + getAp() + " punktów obrażeń." );

    }


    public void defend() {
        System.out.println(Król.class.getSimpleName()+ "pochłąnia" + getDp() + "punktów obrażeń.");

    }
}
