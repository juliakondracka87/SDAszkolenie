package TrzeciZjazd;

public class Point {
    private int x = 0;
    private int y = 0;

    public Point(){

    }

    public Point( int x, int y){
        this.x = x;
        this.y = y;

    }
//    public double distance(int x, int y){
//        System.out.println("Pierwszy sposób");
//        double result = Math.sqrt((Math.pow((x - this.x), 2)) + (Math.pow((y - this.y), 2)));
//        return result;
        //return Math.sqrt((Math.pow((point.x - this.x), 2)) + (Math.pow((point.y - this.y), 2))); króce
    //}
    public double distance(int x, int y) {

        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        //double result = Math.sqrt((Math.pow((point.x - this.x), 2)) + (Math.pow((point.y - this.y), 2)));
        // return result;
    }

    public double distance(Point point) {
        System.out.println("Drugi sposób");

        return distance(point.getX(), point.getY());
    }

    //Liczy odleglosc tego punktu od punktu (0, 0)
    public double distance() {
        //return Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2));
        return distance(0, 0);
    }

    @Override//PRZECIAZENIE METODY Z KLASY BAZOWEJ, KOMPILATOR NAS OSTRZEŻE ŻE NIE MOŻNA PRZECIĄZYĆ METODY BO JEJ NIE MA
    public String toString (){
        return "(" + this.x + ", " + this.y + ")";
        //return new String ("(" + this.x + ", " + this.y + ")");
        //System.out.printl(...)
    }
    //DRY = Don't Repeat Yourself practice
    public void introduce (String name){

        System.out.println(name + this);// this zawoła toString
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

}
