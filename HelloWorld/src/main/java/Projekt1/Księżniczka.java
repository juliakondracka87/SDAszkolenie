package Projekt1;

public class Księżniczka extends Charakter {

    public Księżniczka (double hp, double ap, double dp) {
        super(hp, ap, dp);
    }


    public void attack() {
        System.out.println(Księżniczka.class.getSimpleName()+ " zadaje " + getAp() + " punktów obrażeń." );

    }


    public void defend() {
        System.out.println(Księżniczka.class.getSimpleName()+ "pochłąnia" + getDp() + "punktów obrażeń.");

    }


}
