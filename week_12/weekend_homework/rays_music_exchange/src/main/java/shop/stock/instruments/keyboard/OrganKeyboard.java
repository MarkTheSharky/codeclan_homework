package shop.stock.instruments.keyboard;

import shop.stock.instruments.InstrumentType;

public class OrganKeyboard extends Keyboard {

    public OrganKeyboard(String brand, String name, String color, InstrumentType instrumentType, double buyPrice, double sellPrice, int numberOfKeys) {
        super(brand, name, color, instrumentType, buyPrice, sellPrice, numberOfKeys);
    }
}
