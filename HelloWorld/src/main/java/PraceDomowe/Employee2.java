package PraceDomowe;

import java.time.LocalDate;

public class Employee2 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee2(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }
    public void raiseSalary(double byPercent){
        double raise = this.salary*byPercent/100;
        this.salary+=raise;
    }
    public static void tripleSalary(Employee2 x){
        x.raiseSalary(200);
    }
    public static void swap(Employee2 x, Employee2 y){

        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("Koniec metody: x = " + x.getName());
        System.out.println("Koniec metody: y = " + y.getName());
    }
    public static void tripleVolue(double x){
        x = x*3;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
