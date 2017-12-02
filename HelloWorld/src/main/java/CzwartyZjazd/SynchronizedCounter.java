package CzwartyZjazd;

public class SynchronizedCounter extends Thread {

    private static int counter = 0;

    public SynchronizedCounter(int counter) {
        super();
        this.counter = counter;

    }


    public static synchronized void increment(){
        ++counter;
        System.out.println("Counter inc to " + counter);
    }

    public static synchronized void decrement(){
        --counter;
        System.out.println("Counter dec to " + counter);
    }

}
