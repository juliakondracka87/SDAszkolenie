package PraceDomowe;

public class Piłkarz {
    private String name = "Jan";
    private String surname = "Iksiński";
    private String pseudonim = "Lewy";
    private int age = 0;
    private String position = "attack";

    public Piłkarz(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Piłkarz(String name) {
        this.name = name;
    }

    public Piłkarz(String name, String surname, String pseudonim, int age, String position) {
        this.name = name;
        this.surname = surname;
        this.pseudonim = pseudonim;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Mój ulubiony piłkarz to " + name +" "+  surname +" "+
                "mówią na niego " + pseudonim +
                ", ma " + age + " lat, gra na pozycji "
               + position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPseudonim() {
        return pseudonim;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
