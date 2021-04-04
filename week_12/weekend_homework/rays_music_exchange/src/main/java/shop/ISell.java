package shop;

public interface ISell {

    double calculateProfit(ISell item);
//    double calculateProfit(double buyPrice, double sellPrice);
    double calculateMarkup(double buyPrice, double sellPrice);
}
