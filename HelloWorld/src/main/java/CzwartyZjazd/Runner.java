package CzwartyZjazd;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        Properties prop = new Properties();
//        InputStream input = null;
//        //
//        try{
//        //input = new FileInputStream("config.properties");
//            String filename = "config.properties";
//            input = Runner.class.getClassLoader().getResourceAsStream(filename)
//        prop.load(input);
//    } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }


//        List<User> ludzie = new ArrayList<>();
//        User u1 = new User("Jan", "Kowalski",
//                LocalDate.of(1985, 2, 20),
//                3500.0,
//                StanCywilny.WOLNY,
//                1);
//        User u2 = new User("Julia", "Konradcka",
//                LocalDate.of(1987, 3, 20),
//                10000.0,
//                StanCywilny.ZAJĘTY,
//                2);
//        User u3 = new User("Konrad", "Karwowski",
//                LocalDate.of(1992, 10, 22),
//                2500.0,
//                StanCywilny.WOLNY,
//                0);
//        User u4 = new User("Norbert", "Urbanski",
//                LocalDate.of(1972, 5, 6),
//                7500.0,
//                StanCywilny.ZAJĘTY,
//                3);
//        User u5 = new User("Ula", "Gwozdz",
//                LocalDate.of(1967, 12, 5),
//                6500.0,
//                StanCywilny.ZAJĘTY,
//                4);
//        User u6 = new User("Janek", "Poranek",
//                LocalDate.of(1998, 2, 5),
//                8500.0,
//                StanCywilny.WOLNY,
//                0);
//        User u7 = new User("Karol", "Bobko",
//                LocalDate.of(1928, 1, 25),
//                2500.0,
//                StanCywilny.ZAJĘTY,
//                5);
//        User u8 = new User("Marek", "Starek",
//                LocalDate.of(1978, 2, 5),
//                18500.0,
//                StanCywilny.ZAJĘTY,
//                10);
//        User u9 = new User("Marek", "Warek",
//                LocalDate.of(2010, 6, 7),
//                0.0,
//                StanCywilny.WOLNY,
//                0);
//        User u10 = new User("Zbyszek", "Kiszek",
//                LocalDate.of(1948, 12, 23),
//                500.0,
//                StanCywilny.WOLNY,
//                2);
//        ludzie.add(u1);
//        ludzie.add(u2);
//        ludzie.add(u3);
//        ludzie.add(u4);
//        ludzie.add(u5);
//        ludzie.add(u6);
//        ludzie.add(u7);
//        ludzie.add(u8);
//        ludzie.add(u9);
//        ludzie.add(u10);
//
//        System.out.println("Osoby zarabiające powyżej 5000: ");
//        //Predicate<User> pensjaWiększaNiż5000 = u -> u.getSalary()>5000;
//
//        ludzie
//                .stream()
//                //.filter(pensjaWiększaNiż5000) i for Each
//                .filter((u) -> u.getSalary()>5000)
//                .forEach(u -> System.out.println(u.toString()));
//        long count = ludzie
//                .stream()
//                .filter(u -> ChronoUnit.YEARS.between(u.getBirthdayDate(),LocalDate.now())>30)
//                .count();
//
//        ludzie
//                .stream()
//                .filter((l) -> l.getLiczbaDzieci()>0)
//                .filter ((l) -> l.getStanCywilny()== StanCywilny.WOLNY)
//                .forEach(l -> System.out.println(l.toString()));
//        System.out.println("Ludzie w związku: ");
//        ludzie
//                .stream()
//                .filter((l) -> l.getStanCywilny()== StanCywilny.ZAJĘTY)
//                .forEach(l -> System.out.println(l.toString()));
//        System.out.println("osoby wolne z dziećmi");
//        int sum = ludzie
//                .stream()
//                .filter((l) -> ChronoUnit.YEARS.between(l.getBirthdayDate(), LocalDate.now()) > 30)
//                .mapToInt(User::getLiczbaDzieci)//u.getLiczbaDzieci()>0
//                .sum();
//        System.out.println("liczba osób z dziećmi w iweku >30"+sum);
//        System.out.println("OD NAJWIĘKSZA PENSJA");
//
//        ludzie
//                .stream()
//                .sorted((l1,l2)-> new Double(l1.getSalary())
//                        .compareTo(l2.getSalary()))
//                .forEach(l -> System.out.println(l));
//
//        Optional<User> first = ludzie
//                .stream()
//                .sorted((ua,ub)->new Double(ub.getSalary()).compareTo(ua.getSalary()))
//                .findFirst();
//        System.out.println("osoba największa pensja " + first);
//
//        OptionalDouble max = ludzie
//                .stream()
//                .mapToDouble(User::getSalary)
//                .max();
//        System.out.println("osoby posortowane");

        NowyWątek nw1 = new NowyWątek("nw1 ", 5);
        NowyWątek nw2 = new NowyWątek("nw2 ", 4);
        NowyWątek nw3 = new NowyWątek("nw3 ", 3);


        List<NowyWątek> wątki = new ArrayList<>();

        wątki.add(nw1);
        wątki.add(nw2);
        wątki.add(nw3);

        for (NowyWątek w : wątki) {
            w.start();
        }


        Thread incrementTread = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    SynchronizedCounter.increment();
                    try {
                        sleep(1);
                    } catch (InterruptedException ie) {
                    }


                }
                for (int i = 0; i < 10; i++) {
                    SynchronizedCounter.decrement();
                    try {
                        sleep(1);
                    } catch (InterruptedException ie) {
                    }


                }
                incrementTread.start();
                decrementTread.start();
            }


            SynchronizedCounter incrementTread = new SynchronizedCounter(5);
            SynchronizedCounter decrementTread = new SynchronizedCounter(4);

            List<SynchronizedCounter> metody = new ArrayList<>();
            //metody.add(incrementTread);
            //metody.add(decrementTread);

            //for()
            //incrementTread.start();
            //decrementTread.start();

        };
    }
}










