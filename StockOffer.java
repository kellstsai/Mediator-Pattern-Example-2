/**
 * This class will allow us to create the indicated variables for testing
 * purposes
 */

public class StockOffer {
    private int stockShares = 0;
    private String stockSymbol = "";
    private int colleageID = 0;

    public StockOffer(int numberOfShares, String newStock, int newColleageID) {
        stockShares = numberOfShares;
        stockSymbol = newStock;
        colleageID = newColleageID;
    }

    public int getStockShares() {
        return stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getColleageID() {
        return colleageID;
    }
}
