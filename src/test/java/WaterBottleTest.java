import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    //Has volume property and starts at 100
    @Test
    public void hasVolume100() {
        assertEquals(100, waterBottle.getVolume(), 0.01);
    }

    //volume decrease by -10 when drink is called
    @Test
    public void canDecreaseVolumeBy10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume(), 0.01);
    }

}





    // -10 function
    //empty function set volume to 0
    // fill function to set volume as 100


