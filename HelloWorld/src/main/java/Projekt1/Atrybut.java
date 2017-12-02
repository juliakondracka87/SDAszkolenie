package Projekt1;

public class Atrybut {
    private double dodatkoweAp = 0;
    private double dodatkoweDp = 0;
    private boolean jestWybrany = true;


    public Atrybut() {

    }

    public Atrybut(double dodatkoweAp, double dodatkoweDp) {
        this.dodatkoweAp = dodatkoweAp;
        this.dodatkoweDp = dodatkoweDp;
    }

    public double getDodatkoweAp() {
        return dodatkoweAp;
    }

    public void setDodatkoweAp(double dodatkoweAp) {
        this.dodatkoweAp = dodatkoweAp;
    }

    public double getDodatkoweDp() {
        return dodatkoweDp;
    }

    public void setDodatkoweDp(double dodatkoweDp) {
        this.dodatkoweDp = dodatkoweDp;
    }

    public boolean isJestWybrany() {
        return jestWybrany;
    }

    public void setJestWybrany(boolean jestWybrany) {
        this.jestWybrany = jestWybrany;
    }
}
