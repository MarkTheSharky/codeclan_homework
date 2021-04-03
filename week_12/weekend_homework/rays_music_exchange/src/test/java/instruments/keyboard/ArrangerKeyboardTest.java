package instruments.keyboard;

import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ArrangerKeyboardTest {

    ArrangerKeyboard arrangerKeyboard;

    @Before
    public void before() {
        arrangerKeyboard = new ArrangerKeyboard("Korg", "PA300", "Grey", InstrumentType.KEYBOARD, 0, 0, 32);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Korg", arrangerKeyboard.getBrand());
    }

    @Test
    public void getName() {
        assertEquals("PA300", arrangerKeyboard.getName());
    }

    @Test
    public void getColor() {
        assertEquals("Grey", arrangerKeyboard.getColor());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, arrangerKeyboard.getInstrumentType());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(0, arrangerKeyboard.getBuyPrice(), 0.0);
    }

    @Test
    public void setBuyPrice() {
        arrangerKeyboard.setBuyPrice(100.56);
        assertEquals(100.56, arrangerKeyboard.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(0, arrangerKeyboard.getSellPrice(), 0.0);
    }

    @Test
    public void setSellPrice() {
        arrangerKeyboard.setSellPrice(200.67);
        assertEquals(200.67, arrangerKeyboard.getSellPrice(), 0.0);
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(32, arrangerKeyboard.getNumberOfKeys());
    }

    @Test
    public void calculateMarkup() {
        arrangerKeyboard.setBuyPrice(100);
        arrangerKeyboard.setSellPrice(200);
        double markup = arrangerKeyboard.calculateMarkup(arrangerKeyboard.getSellPrice(), arrangerKeyboard.getBuyPrice());
        assertEquals(100, markup, 0.1);
    }
}