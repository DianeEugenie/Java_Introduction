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

    //volume does not decrease by -10 if volume is less than 10
    @Test
    public void cannotDecreaseVolumeBy10(){
        waterBottle.empty();
        waterBottle.drink();
        assertEquals(0, waterBottle.getVolume(), 0.01);
    }

    //empty function set volume to 0
    @Test
    public void canEmptyWaterBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume(), 0.01);
    }

    // fill function to set volume as 100
    @Test
    public void canFillWaterBottle(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume(), 0.01);
    }
}









