package shop.stock.instruments.guitar;

import shop.stock.instruments.InstrumentType;

public class ElectricGuitar extends Guitar {

    public ElectricGuitar(String brand, String name, String color, InstrumentType instrumentType, double buyPrice, double sellPrice, int numberOfStrings) {
        super(brand, name, color, instrumentType, buyPrice, sellPrice, numberOfStrings);
    }
}
