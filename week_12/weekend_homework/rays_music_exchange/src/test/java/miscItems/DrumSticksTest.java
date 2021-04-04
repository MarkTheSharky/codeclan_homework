package miscItems;

import org.junit.Before;
import org.junit.Test;
import shop.stock.miscItems.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("ThickSticks", "Stickz", 0, 0);
    }

    @Test
    public void canGetBrand() {
        assertEquals("ThickSticks", drumSticks.getBrand());
    }

    @Test
    public void getName() {
        assertEquals("Stickz", drumSticks.getName());
    }


    @Test
    public void getBuyPrice() {
        assertEquals(0, drumSticks.getBuyPrice(), 0.0);
    }

    @Test
    public void setBuyPrice() {
        drumSticks.setBuyPrice(100.56);
        assertEquals(100.56, drumSticks.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(0, drumSticks.getSellPrice(), 0.0);
    }

    @Test
    public void setSellPrice() {
        drumSticks.setSellPrice(200.67);
        assertEquals(200.67, drumSticks.getSellPrice(), 0.0);
    }

    @Test
    public void calculateProfit() {
        drumSticks.setBuyPrice(10);
        drumSticks.setSellPrice(15);
        double profit = drumSticks.calculateProfit(drumSticks.getSellPrice(), drumSticks.getBuyPrice());
        assertEquals(5, profit , 0.0);
    }

    @Test
    public void calculateMarkup() {
        drumSticks.setBuyPrice(10);
        drumSticks.setSellPrice(15);
        double markup = drumSticks.calculateMarkup(drumSticks.getSellPrice(), drumSticks.getBuyPrice());
        assertEquals(50, markup, 0.1);
    }
}
