package TrzeciZjazd;

public class Yeti extends Enemy {


    public Yeti() {
        super(300, 75, 100);
    }

    @Override
    public void attack() {
        System.out.println(Yeti.class.getSimpleName() + " zadaje " + getAttackPoints() + " punktów obrażeń.");
    }

    @Override
    public void defend() {
        System.out.println(Yeti.class.getSimpleName() + " pochłąnia " + getDefendPoint() + " punktów obrażeń.");
    }

    public static double printReward() {

        return 1500.0;
    }
}


