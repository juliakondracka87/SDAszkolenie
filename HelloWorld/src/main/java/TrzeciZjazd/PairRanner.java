package TrzeciZjazd;

public class PairRanner {

    public static void main(String[] args){
        //BRAK SPRAWDZANIA ZE WZGLEDU NA TYP!
        /*  Box box = new Box();
        Yeti y = new Yeti();
        box.setO(y);
        Object o = box.getO();
        Yeti y1 = (Yeti) o;
        box.setO(new String("Hello!"));
        Yeti y2 = (Yeti) box.getO();*/



        GenericBox<Yeti> genericYeti = new GenericBox<Yeti>();
        genericYeti.setO(new Yeti());

        GenericBox<String> genericString = new GenericBox<>();
        genericString.setO("Hello!");

        System.out.println(genericYeti.getO());
        System.out.println(genericString.getO());

        Pair <Integer, String> p1 = new Pair<>(1, "apple");

        Pair <String, String> p2 = new Pair<>("Poland", "Warsaw");

        System.out.println(p2);
    }
}
