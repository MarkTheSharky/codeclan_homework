package shop.stock;

import shop.ISell;

import static java.lang.Math.abs;

public abstract class Stock implements ISell{

    private String brand;
    private String name;
    private double buyPrice;
    private double sellPrice;

    public Stock(String brand, String name, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
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

    public double calculateProfit(double buyPrice, double sellPrice) {
        return abs(sellPrice - buyPrice);
    }

    public double calculateMarkup(double buyPrice, double sellPrice) {
        double markup = sellPrice - buyPrice;
        markup = markup / sellPrice;
        markup = markup * 100;
        return abs(markup);
    }
}
