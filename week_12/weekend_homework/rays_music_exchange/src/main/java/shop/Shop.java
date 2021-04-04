package shop;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;


    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stock.size();
    }

    public void addToStock(ISell stockItem) {
        stock.add(stockItem);
    }

    public void removeFomStock(int index) {
        stock.remove(index);
    }

//    public double calculateTotalPotentialProfit() {
//        double totalProfit = 0;
//        for (ISell item : stock) {
//            double profit = item.calculateProfit();
//            totalProfit += profit;
//        }
//    }

}
