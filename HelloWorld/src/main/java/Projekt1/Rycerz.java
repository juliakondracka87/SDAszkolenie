package Projekt1;

public class Rycerz extends Charakter {

    public Rycerz (double hp, double ap, double dp) {
        super(hp, ap, dp);
    }

    public void attack() {
        System.out.println(Rycerz.class.getSimpleName()+ " zadaje " + getAp() + " punktów obrażeń." );

    }


    public void defend() {
        System.out.println(Rycerz.class.getSimpleName()+ "pochłąnia" + getDp() + "punktów obrażeń.");

    }


}
