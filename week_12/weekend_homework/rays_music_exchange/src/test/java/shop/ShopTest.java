package shop;

import org.junit.Before;
import org.junit.Test;
import shop.stock.instruments.InstrumentType;
import shop.stock.instruments.guitar.ElectricGuitar;
import shop.stock.instruments.keyboard.OrganKeyboard;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Shop shopStock;
    ElectricGuitar instrument1;
    OrganKeyboard instrument2;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");
        instrument1 = new ElectricGuitar("Epiphone", "DR-100", "Beige", InstrumentType.STRING, 100, 200, 5);
        instrument2 = new OrganKeyboard("Yamaha", "YC", "White", InstrumentType.KEYBOARD, 50, 100, 37);
    }

    @Test
    public void getName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void getStockQuantity() {
        assertEquals(0, shop.getStockQuantity());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(instrument1);
        assertEquals(1, shop.getStockQuantity());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(instrument1);
        shop.removeFomStock(0);
        assertEquals(0, shop.getStockQuantity());
    }

    @Test
    public void calculateTotalPotentialProfit() {
        shop.addToStock(instrument1);
        shop.addToStock(instrument2);
        assertEquals(150, shop.calculateTotalPotentialProfit(), 0.0);
    }

}