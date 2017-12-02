package CzwartyZjazd.Java8;

public class CoffeeWithoutSugar extends Caffee implements MakeCoffee{


    public CoffeeWithoutSugar(int sugar) {
        super(sugar);
    }

    public void addSugar(Caffee c) {
         c.setSugar(0);

    }

}
