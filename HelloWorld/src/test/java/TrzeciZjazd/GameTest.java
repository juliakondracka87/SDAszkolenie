package TrzeciZjazd;

//Komputer stawia statek o wymiarach 1 x 1
//Statek ten moge postawic na planszy o wymiarach 10 x 10
//Gracz strzela do statku

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class GameTest {
    private Pc pc;
    private Player player;

    @Before
    public void setUp(){

        pc = new Pc(new Ship());
        player = new Player();

    }

    @Test
    public void testShipPlacement() {
        pc.placeShip(); //no args - set randomly

        assertTrue(pc.getShip().getX()>=0&&pc.getShip().getX()<=10);
        assertTrue(pc.getShip().getY()>=0&&pc.getShip().getY()<=10);
    }

    @Test
    public void testShipShotFailed() {
        pc.placeShip(4, 5);
        player.shot(pc, 1, 1);
        assertTrue(pc.getShip().isAlive());



    }
}
