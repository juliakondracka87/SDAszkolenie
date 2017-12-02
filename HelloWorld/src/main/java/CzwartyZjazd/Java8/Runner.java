package CzwartyZjazd.Java8;

public class Runner {
    public static void main(String[] args) {
//        Formula f1 = new FormulaDefault();
//        Formula f2 = new FormulaOverloaded();

        //System.out.println("Formula default: " + f1.sqrt());

        MakeCoffee cs = new CoffeWithSugar(0);
        MakeCoffee cws = new CoffeeWithoutSugar(0);

        cs.addSugar((Caffee)cs);
        cws.addSugar((CoffeeWithoutSugar)cws);


        System.out.println("Kawa z cukrem " + ((Caffee)cs).getSugar());
        System.out.println("Kawa bez cukru " + ((Caffee)cws).getSugar());

    }
}
