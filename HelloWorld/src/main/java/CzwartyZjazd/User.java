package CzwartyZjazd;

import CzwartyZjazd.Java8.StanCywilny;

import java.time.LocalDate;

public class User {
    private String name = "";
    private String surname = "";
    private LocalDate birthdayDate;
    private double salary = 0;
    private StanCywilny stanCywilny;
    private int liczbaDzieci;

    public User(String jan, String kowalski, int i) {
    }

    public User(String name, String surname, LocalDate birthdayDate, double salary, StanCywilny stanCywilny, int liczbaDzieci) {
        this.name = name;
        this.surname = surname;
        this.birthdayDate = birthdayDate;
        this.salary = salary;
        this.stanCywilny = stanCywilny;
        this.liczbaDzieci = liczbaDzieci;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdayDate=" + birthdayDate +
                ", salary=" + salary +
                ", stanCywilny=" + stanCywilny +
                ", liczbaDzieci=" + liczbaDzieci +
                '}';
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

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public StanCywilny getStanCywilny() {
        return stanCywilny;
    }

    public void setStanCywilny(StanCywilny stanCywilny) {
        this.stanCywilny = stanCywilny;
    }

    public int getLiczbaDzieci() {
        return liczbaDzieci;
    }

    public void setLiczbaDzieci(int liczbaDzieci) {
        this.liczbaDzieci = liczbaDzieci;
    }
}
