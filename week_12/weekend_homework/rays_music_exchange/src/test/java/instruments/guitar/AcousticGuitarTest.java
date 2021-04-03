package instruments.guitar;

import instruments.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    private AcousticGuitar acousticGuitar;

    @Before
    public void before() {
        acousticGuitar = new AcousticGuitar("Epiphone", "DR-100", "Beige", InstrumentType.STRING, 0, 0, 5);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Epiphone", acousticGuitar.getBrand());
    }

    @Test
    public void getName() {
        assertEquals("DR-100", acousticGuitar.getName());
    }

    @Test
    public void getColor() {
        assertEquals("Beige", acousticGuitar.getColor());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.STRING, acousticGuitar.getInstrumentType());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(0, acousticGuitar.getBuyPrice(), 0.0);
    }

    @Test
    public void setBuyPrice() {
        acousticGuitar.setBuyPrice(100.56);
        assertEquals(100.56, acousticGuitar.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(0, acousticGuitar.getSellPrice(), 0.0);
    }

    @Test
    public void setSellPrice() {
        acousticGuitar.setSellPrice(200.67);
        assertEquals(200.67, acousticGuitar.getSellPrice(), 0.0);
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(5, acousticGuitar.getNumberOfStrings());
    }

    @Test
    public void calculateMarkup() {
        acousticGuitar.setBuyPrice(10);
        acousticGuitar.setSellPrice(15);
        double markup = acousticGuitar.calculateMarkup(acousticGuitar.getSellPrice(), acousticGuitar.getBuyPrice());
        assertEquals(50, markup, 0.1);
    }

}