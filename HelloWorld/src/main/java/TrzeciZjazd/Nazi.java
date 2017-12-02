package TrzeciZjazd;

public class Nazi extends Enemy {


    public Nazi() {
        super(555, 60, 200);
    }


    @Override
    public void attack() {
        System.out.println(Nazi.class.getSimpleName() + " zadaje " + getAttackPoints() + " punktów obrażeń.");

    }

    @Override
    public void defend() {
        System.out.println(Nazi.class.getSimpleName() + " pochłania " + getDefendPoint() + " punktów obrażeń.");

    }
}


