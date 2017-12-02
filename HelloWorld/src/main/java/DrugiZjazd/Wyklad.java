package DrugiZjazd;

public class Wyklad {
    //zamiast Wyklad wpisujemy Czlowiek

    public String imie;
    private int wiek;
    //private int plec;
    private Sex plec;

    public Wyklad(){

    }

    public Wyklad(String imie, int wiek, Sex plec){
        this.imie = imie;
        setWiek(wiek);
        this.plec = plec;
    }

    public void setWiek(int wiek) {
        if (wiek>0) {
            this.wiek = wiek;
        }
    }
    public void setPlec(Sex plec){

        this.plec = plec;
    }

    public void jedz() {
        System.out.println("Mam na imie: "+ imie);
        System.out.println("I jem:) ");
        System.out.println("...........");
    }
        public void pij() {
        System.out.println("Mam na imie: "+ imie);
        System.out.println("I pije:) ");
        System.out.println("...........");

        }
        public void przedstawSie() {
            System.out.println("Mam na imie: "+ imie);
            System.out.println("Mam " + wiek + " lat");
            if (plec == Sex.KOBIETA){
                System.out.println("Jestem kobietą!");
            }
            else {
                System.out.println("Jestem mężczyzną!");
            }

            System.out.println("Jestem: "+ plec);
        }
    }




