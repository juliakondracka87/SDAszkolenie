package PraceDomowe;
/*Zadanie 4:
        Stwórz klasę Employee, która ma spełniać następujące wymogi:
        1. Mieć prywatne atrybuty:
        * `id` - atrybut ten powinien trzymać numer identyfikacyjny pracownika,
        * `firstName` - atrybut określający imię pracownika,
        * `lastName` - atrybut określający nazwisko pracownika,
        * `salary` - atrybut określający ile pracownik zarabia za godzinę.
        2. Posiadać konstruktor przyjmujący id, imię, nazwisko i płace za godzinę.
        3. Posiadać getery i setery do atrybutów `firstName`, `lastName` i `salary`. Do atrybutu `id` będzie potrzebny tylko geter.
        4. Posiadać metodę 'raiseSalary($percent)' której rolą będzie zwiększenie wartości atrybutu `salary` o podany procent.
        Pamiętaj o sprawdzeniu czy podana wartość jest:
        * Wieksza (lub równa) od 0*/

public class Employee {

    private int id;
    private StringMain firstName;
    private StringMain lastName;
    private double salary;

    public Employee(int id, StringMain firstName, StringMain lastName, double salary) {
        if(id > 0){
            this.id = id;
        }
        else {
            System.out.println("Nieprawidłowe id");
        }
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);

    }

    public StringMain getFirstName() {
        return firstName;
    }

    public void setFirstName(StringMain firstName) {
        this.firstName = firstName;
    }

    public StringMain getLastName() {
        return lastName;
    }

    public void setLastName(StringMain lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public int getId() {
        return id;
    }

    public double raiseSalary(double percent) {
        if (percent >= 0 && percent <= 100) {
            double raise = salary * percent/100;
            double result = salary + raise;

            return result;
        }
        else {
            System.out.println("Sprawdź wprowadzone dane!");
        }
        return 0;
    }
}
