package shop.stock.instruments.keyboard;

import shop.stock.instruments.InstrumentType;

public class ArrangerKeyboard extends Keyboard {

    public ArrangerKeyboard(String brand, String name, String color, InstrumentType instrumentType, double buyPrice, double sellPrice, int numberOfKeys) {
        super(brand, name, color, instrumentType, buyPrice, sellPrice, numberOfKeys);
    }
}
