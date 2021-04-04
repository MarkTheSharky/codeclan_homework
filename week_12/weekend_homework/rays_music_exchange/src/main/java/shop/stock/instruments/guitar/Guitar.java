package shop.stock.instruments.guitar;

import shop.stock.instruments.Instrument;
import shop.stock.instruments.InstrumentType;

public abstract class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String brand, String name, String color, InstrumentType instrumentType, double buyPrice, double sellPrice, int numberOfStrings) {
        super(brand, name, color, instrumentType, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playSound() {
        return "'guitar sound'";
    }
}
