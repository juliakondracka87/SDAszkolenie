package CzwartyZjazd.Java8;

public interface Formula {
    double calculate(double x);
    default double sqrt(double x){
        return Math.sqrt(x);

    }


}
