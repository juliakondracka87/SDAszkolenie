package DrugiZjazd;

public class Calculator {
    private String[] opHistory;
    private int opNumber;

    public Calculator() {
        this.opHistory = new String[10];
        this.opNumber = 0;//zmienna ta bedzie nam rosla z kazdym dodaniem operacji, zero bo wczesniej nic nie bylo
    }

    public int add(int a, int b) {
        addOperation("Dodawanie " + a + "do" + b);
        return a + b;
    }

    public int multiply(int a, int b) {
        addOperation("Dodawanie " + a + "do" + b);
        return a * b;

    }

    public int subtract(int a, int b) {
        addOperation("Dodawanie " + a + "do" + b);
        return a - b;
    }

    public double divide(int a, int b) {
        addOperation("Podzielenie " + a + "/" + b);
        return a / b;
    }

    public int pow(int n, int k) {
        int wynik = n;
        for (int i = 1; i <= k; i++) {
            System.out.println(wynik);
            wynik *= n;
        }
        addOperation("Potega" + n + "do" + k);
        return wynik;
    }

    public int abs(int a) {
        addOperation("Liczba bezwzgledna z " + a);
        if (a < 0) {
            return a * (-1);
        }
        return a;
    }

    public void printOperation() {
        for (int i = opNumber; i < opNumber + 10; i++) {
            System.out.println(opHistory[i % 10]);
        }
    }

    private void addOperation(String operation) {
        opHistory[opNumber] = operation;
        opNumber++;//zwiekszam operacje o jeden
        opNumber = opNumber % 10;// czy opnaumber nie przekroczyło 10
    }

    public void clearOperation() {
        for (int i = 0; i < 0; i++) {
            opHistory[i] = null;
        }
    }
}




