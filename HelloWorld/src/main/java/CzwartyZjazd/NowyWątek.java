package CzwartyZjazd;

public class NowyWątek extends Thread {

    private String nazwa;
    private int counterLimit = 5;

//    public NowyWątek() {
//    }

    public NowyWątek(String name, int limit) {
        super();
        this.nazwa = name;
        this.counterLimit = limit;
    }


    public String getNazwa() {
        return nazwa;
    }


    public void setNazwa(String name) {
        this.nazwa = name;
    }

    public int getCounterLimit() {
        return counterLimit;
    }

    public void setCounterLimit(int counterLimit) {
        this.counterLimit = counterLimit;
    }

    @Override
    public void run() {
        for(int i = 0; i<counterLimit; i++){
            System.out.println(nazwa + ": " + i);
            //daje możliwość innym watkom na wykonanie siebie;
            yield();
    }


}
}
