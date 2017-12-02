package TrzeciZjazd;

public class Orc extends Enemy{

    public Orc() {
        super(100, 60,60);
    }

    public void attack() {
        System.out.println(Orc.class.getSimpleName() + " zadaj" + getAttackPoints() + " punktów obrażeń");
    }

    public void defend() {
        System.out.println(Orc.class.getSimpleName() + " pochłania" + getDefendPoint() + " punktów obrażeń");
    }

}
