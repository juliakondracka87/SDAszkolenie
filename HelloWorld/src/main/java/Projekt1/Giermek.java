package Projekt1;

public class Giermek extends Charakter {

    private Item atrybut;


    @Override
    public String toString() {
        return super.toString();
    }

    public Giermek(double hp, double ap, double dp, Item atrybut) {
        super(hp, ap, dp);
        this.atrybut = atrybut;

    }




    public void attack() {
        System.out.println(Giermek.class.getSimpleName()+ " zadaje " + getAp() + " punktów obrażeń." );

    }


    public void defend() {
        System.out.println(Giermek.class.getSimpleName()+ "pochłąnia" + getDp() + "punktów obrażeń.");

    }

}
