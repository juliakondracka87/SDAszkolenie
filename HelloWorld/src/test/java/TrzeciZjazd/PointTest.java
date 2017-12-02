package TrzeciZjazd;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PointTest {

    private Point testPoint;
    private static final double delta = 0.00001;

    @Before
    public void setUp(){
        System.out.println("Setting up PointTest.");
        testPoint = new Point();
    }

    @Test
    public void testCalcDistToPointZero(){

    double dist = testPoint.distance(0,0);

    assertEquals(0, dist, delta);

    }
    @Test
    public void testCalcDistToFiveFive(){
        Point pt2 = new Point(5,5);
        double dist = testPoint.distance(pt2);
        assertEquals(7.071067, dist, delta);
    }



}
