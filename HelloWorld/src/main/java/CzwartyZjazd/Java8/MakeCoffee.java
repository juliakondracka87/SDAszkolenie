package CzwartyZjazd.Java8;

public interface MakeCoffee {

    default void addSugar( Caffee c){
        c.setSugar(3);
    }
}
