package TrzeciZjazd;

public abstract class Enemy {

    private double healthPoints;
    private double attackPoints;
    private double defendPoint;

    public Enemy() {
    }

    public Enemy(double healthPoints, double attackPoints, double defendPoint) {
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
        this.defendPoint = defendPoint;
    }

    abstract public void attack();
    //{
        //System.out.println("Wróg zadaje "+ attackPoints + " punktów obrażeń.");
    //}
    abstract public void defend();
//    {
//        System.out.println("Wróg pochłania "+ defendPoint + " punktów obrażeń.");
//    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public double getDefendPoint() {
        return defendPoint;
    }

    public void setDefendPoint(double defendPoint) {
        this.defendPoint = defendPoint;
    }

}
