package shop;

public interface ISell {

    double calculateProfit(ISell item);
    double calculateMarkup(double buyPrice, double sellPrice);
}
