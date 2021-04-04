package miscItems;

import org.junit.Before;
import org.junit.Test;
import shop.stock.miscItems.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
       sheetMusic = new SheetMusic("CodeclanMusic", "PopHits", 0, 0);
    }

    @Test
    public void canGetBrand() {
        assertEquals("CodeclanMusic", sheetMusic.getBrand());
    }

    @Test
    public void getName() {
        assertEquals("PopHits", sheetMusic.getName());
    }


    @Test
    public void getBuyPrice() {
        assertEquals(0, sheetMusic.getBuyPrice(), 0.0);
    }

    @Test
    public void setBuyPrice() {
        sheetMusic.setBuyPrice(100.56);
        assertEquals(100.56, sheetMusic.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(0, sheetMusic.getSellPrice(), 0.0);
    }

    @Test
    public void setSellPrice() {
        sheetMusic.setSellPrice(200.67);
        assertEquals(200.67, sheetMusic.getSellPrice(), 0.0);
    }

    @Test
    public void calculateProfit() {
        sheetMusic.setBuyPrice(10);
        sheetMusic.setSellPrice(15);
        assertEquals(5, sheetMusic.calculateProfit(sheetMusic) , 0.0);
    }

    @Test
    public void calculateMarkup() {
        sheetMusic.setBuyPrice(10);
        sheetMusic.setSellPrice(15);
        double markup = sheetMusic.calculateMarkup(sheetMusic.getSellPrice(), sheetMusic.getBuyPrice());
        assertEquals(50, markup, 0.1);
    }
}
