package shop.stock.instruments;

import shop.stock.Stock;

public abstract class Instrument extends Stock implements IPlay {

    private String color;
    private InstrumentType instrumentType;

    public Instrument(String brand, String name, String color, InstrumentType instrumentType, double buyPrice, double sellPrice) {
        super(brand, name, buyPrice, sellPrice);
        this.color = color;
        this.instrumentType = instrumentType;
    }

    public String getColor() {
        return color;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

}
