package instruments.keyboard;


import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganKeyboardTest {

    OrganKeyboard organKeyboard;

    @Before
    public void before() {
        organKeyboard = new OrganKeyboard("Yamaha", "YC", "White", InstrumentType.KEYBOARD, 0, 0, 37);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Yamaha", organKeyboard.getBrand());
    }

    @Test
    public void getName() {
        assertEquals("YC", organKeyboard.getName());
    }

    @Test
    public void getColor() {
        assertEquals("White", organKeyboard.getColor());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, organKeyboard.getInstrumentType());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(0, organKeyboard.getBuyPrice(), 0.0);
    }

    @Test
    public void setBuyPrice() {
        organKeyboard.setBuyPrice(100.56);
        assertEquals(100.56, organKeyboard.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(0, organKeyboard.getSellPrice(), 0.0);
    }

    @Test
    public void setSellPrice() {
        organKeyboard.setSellPrice(200.67);
        assertEquals(200.67, organKeyboard.getSellPrice(), 0.0);
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(37, organKeyboard.getNumberOfKeys());
    }

    @Test
    public void calculateMarkup() {
        organKeyboard.setBuyPrice(75);
        organKeyboard.setSellPrice(100);
        double markup = organKeyboard.calculateMarkup(organKeyboard.getSellPrice(), organKeyboard.getBuyPrice());
        assertEquals(33.33, markup, 0.1);
    }


}