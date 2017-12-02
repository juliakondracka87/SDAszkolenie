package PraceDomowe;

public class Employee2Main {
    public static void main(String[] args) {

        Employee2[] staff = new Employee2[3];
        staff[0] = new Employee2("Julia Kondracka",7000, 2006,8,1);
        staff[1] = new Employee2("Dariusz Kondracki", 10000, 2010,9,24);
        staff[2] = new Employee2("Tomasz Zubilewicz", 20000, 1990,8,21);

        //zwiększenie pensji pracowników o 5 %
        for(Employee2 e:staff){
            e.raiseSalary(5);
            System.out.println("name = " + e.getName()+ "salary = " + e.getSalary() + ", hireDay: " + e.getHireDate());
        }

        //metody nie mogą modyfikować parametrów liczbowych
        System.out.println("Testowanie tripleVolue");
        double percent = 10;
        System.out.println("Przed percent: " + percent);
        Employee2.tripleVolue(percent);
        System.out.println("Po percent: " + percent);

        //metody mogą zmieniać stan parametrów bedących obiektami
        System.out.println("\n Testowanie tripleSalary:");
        Employee2 harry = new Employee2("Grzegorz Kondracki", 5000, 2000,6,1);
        System.out.println("Przed salary: " + harry.getSalary());
        Employee2.tripleSalary(harry);
        System.out.println("Po salary: " + harry.getSalary());

        //metody nie mogą dodawać nowych obiektów do parametrów obiektowych

        System.out.println("Testowanie swap");
        Employee2 a = new Employee2("Alicja Czerwińska", 7000, 2012,9,1);
        Employee2 b = new Employee2("Dorota Dąbrowska", 4000, 2010,2,1);
        System.out.println("Przed a: " + a.getName());
        System.out.println("Przed b: " + b.getName());
        Employee2.swap(a,b);
        System.out.println("Po a: " + a.getName());
        System.out.println("Po b: " + b.getName());

    }
}
