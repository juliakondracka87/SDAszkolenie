package DrugiZjazd;

public class Czlowiek {

    public String imie;
    private int wiek;
    private Sex plec;

    public Czlowiek() {

    }

    @Override
    public String toString() {
        return "Czlowiek{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", plec=" + plec +
                '}';
    }

    public Czlowiek(String imie, int wiek, Sex plec) {
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;
    }

    public void setWiek(int wiek) {
        if (wiek > 0) {
            this.wiek = wiek;
        }
    }
    public void setPlec(Sex plec){

        this.plec = plec;
    }

    public void jedz() {
        System.out.println("Mam na imię: " + imie);
        System.out.println("I jem:) ");
        System.out.println("....................");
    }
    public void pij(){
        System.out.println("Mam na imię: " + imie);
        System.out.println("I piję :) ");
        System.out.println("....................");
    }

    public void przedstawSie(){
        System.out.println("Mam na imię: " + imie);
        System.out.println("Mam " + wiek + "lat");
        if(plec == Sex.KOBIETA){
            System.out.println("Jestem kobietą!");
        }
        else {
            System.out.println("Jestem mężczyzną!");
        }
        //System.out.println("Moja plec to: " + plec);
    }

}
