package PraceDomowe.Kompozycja;

public class Osoba {

    private String name;
    private String surname;

    public Osoba() {
    }

    public Osoba(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Autor" + name +" "+ surname;
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
}
