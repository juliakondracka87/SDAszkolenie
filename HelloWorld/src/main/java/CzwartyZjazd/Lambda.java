package CzwartyZjazd;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {


        BiConsumer<Integer,Integer> multiplier = (Integer x, Integer y) ->System.out.println(x*y);
        multiplier.accept(2,5);

        BiConsumer<Integer, String> print = (Integer x, String b ) -> System.out.println(x + "złotych");


        Supplier<String> someString = () -> "some return value";

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(integerConsumer);
        Predicate<Double> isGratesThen200 = d -> d>200;
        System.out.println("Czy 500 jest wuększe od 200 " + isGratesThen200.test(500.0));
        //GreaterThen200Predicate pred = new GreaterThan200Predicate();
        System.out.println();
        DoubleFunction<String> printWithCurrency = d -> "$" + d;
        System.out.println(printWithCurrency.apply(50));

//        Supplier<List<String>> supplyWithCities = () -> {
//                return Arrays.<String>asList("Warsaw", "Tricity", "Mombaj");
//            supplyWithCities.get();
//        };

    }}



