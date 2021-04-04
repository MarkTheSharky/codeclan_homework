package shop.stock.instruments.keyboard;

import shop.stock.instruments.Instrument;
import shop.stock.instruments.InstrumentType;

public abstract class Keyboard extends Instrument {

    private int numberOfKeys;

    public Keyboard(String brand, String name, String color, InstrumentType instrumentType, double buyPrice, double sellPrice, int numberOfKeys) {
        super(brand, name, color, instrumentType, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String playSound() {
        return "'keyboard sound'";
    }
}
