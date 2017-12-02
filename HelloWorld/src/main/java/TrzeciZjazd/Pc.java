package TrzeciZjazd;

import java.util.Random;

public class Pc {

    private Ship ship;

    public Pc() {

        ship = new Ship();
    }

    public void placeShip(){
        Random random = new Random();
        ship.setX(random.nextInt(11));
        ship.setY(random.nextInt(11));

    }
    public void placeShip(int x, int y){

        ship.setX(x);
        ship.setY(y);
    }

    public Pc(Ship ship) {
        this.ship = ship;
    }

    public void calculateShot(int x, int y){
        if(ship.getX() == x && ship.getY() == y){
            ship.setIsAlive(false);
        }
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
