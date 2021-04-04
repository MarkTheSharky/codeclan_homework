package instruments.guitar;

import shop.stock.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.stock.instruments.guitar.ElectricGuitar;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar electricGuitar;

    @Before
    public void before() {
        electricGuitar = new ElectricGuitar("Fender", "Telecaster", "Blue", InstrumentType.STRING, 0, 0, 5);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Fender", electricGuitar.getBrand());
    }

    @Test
    public void getName() {
        assertEquals("Telecaster", electricGuitar.getName());
    }

    @Test
    public void getColor() {
        assertEquals("Blue", electricGuitar.getColor());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.STRING, electricGuitar.getInstrumentType());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(0, electricGuitar.getBuyPrice(), 0.0);
    }

    @Test
    public void setBuyPrice() {
        electricGuitar.setBuyPrice(100.56);
        assertEquals(100.56, electricGuitar.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(0, electricGuitar.getSellPrice(), 0.0);
    }

    @Test
    public void setSellPrice() {
        electricGuitar.setSellPrice(200.67);
        assertEquals(200.67, electricGuitar.getSellPrice(), 0.0);
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(5, electricGuitar.getNumberOfStrings());
    }

    @Test
    public void calculateProfit() {
        electricGuitar.setBuyPrice(10);
        electricGuitar.setSellPrice(15);
        double profit = electricGuitar.calculateProfit(electricGuitar.getSellPrice(), electricGuitar.getBuyPrice());
        assertEquals(5, profit, 0.0);
    }

    @Test
    public void calculateMarkup() {
        electricGuitar.setBuyPrice(100);
        electricGuitar.setSellPrice(150);
        double markup = electricGuitar.calculateMarkup(electricGuitar.getSellPrice(), electricGuitar.getBuyPrice());
        assertEquals(50, markup, 0.1);
    }
}