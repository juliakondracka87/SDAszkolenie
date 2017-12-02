package Projekt1;

public abstract class Charakter {

    private double hp;
    private double ap;
    private double dp;
    //private List<Item> atrybuty = new ArrayList<>();



    public Charakter() {
    }

    public Charakter(double hp, double ap, double dp) {
        this.hp = hp;
        this.ap = ap;
        this.dp = dp;
        //dodajAtrybut();

    }

    //    public Charakter(double hp, double ap, double dp) {
//        this.hp = hp;
//        this.ap = ap;
//        this.dp = dp;
//    }
//
//    public void dodajAtrybut(Gra wylosowanyAtrybut){
//        if(!atrybuty.contains(wylosowanyAtrybut)){
//            atrybuty.add(wylosowanyAtrybut);
//        }
//    }

    public abstract void attack();
    public abstract void defend();

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAp() {
        return ap;
    }

    public void setAp(double ap) {
        this.ap = ap;
    }

    public double getDp() {
        return dp;
    }

    public void setDp(double dp) {
        this.dp = dp;
    }
}
