package instruments;

import shop.ISell;

import static java.lang.Math.abs;

public abstract class Instrument implements IPlay, ISell {

    private String brand;
    private String name;
    private String color;
    private InstrumentType instrumentType;
    private double buyPrice;
    private double sellPrice;


    public Instrument(String brand, String name, String color, InstrumentType instrumentType, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.instrumentType = instrumentType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(double buyPrice, double sellPrice) {
        double markup = sellPrice - buyPrice;
        markup = markup / sellPrice;
        markup = markup * 100;
        return abs(markup);
    }
}
