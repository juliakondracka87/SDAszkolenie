package Projekt1;

public enum Item {
    BROŃ(30, 10),
    TARCZA(10,30),
    WINO(20,5);
    final double dodatkoweAp;
    final double dodatkoweDp;
    Item(double dodatkoweAp, double dodatkoweDp){
        this.dodatkoweAp = dodatkoweAp;
        this.dodatkoweDp = dodatkoweDp;
    }

    public double getDodatkoweAp() {
        return dodatkoweAp;
    }

    public double getDodatkoweDp() {
        return dodatkoweDp;
    }
}
