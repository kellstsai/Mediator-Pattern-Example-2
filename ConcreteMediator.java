
/**
 * 
 */

import java.util.*;

public class ConcreteMediator implements Mediator {
    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueID = 0;

    public ConcreteMediator() {
        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSellOffers = new ArrayList<StockOffer>();
    }

    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);// add the colleague to the arraylist
        colleagueID++;// increment the id number
        newColleague.setColleageID(colleagueID);// we also set the newColleague ID onto the Colleague.java because it
                                                // has the Mediator interface
    }

    public void saleOffer(String stockName, int numberOfShares, int colleagueID) {
        boolean stockSold = false; // set the stock to false if it has not been sold
        for (StockOffer temp : stockBuyOffers) {// go through the array list
            if ((temp.getStockSymbol() == stockName) && (temp.getStockShares() == numberOfShares)) {// if the stock name
                                                                                                    // with the same
                                                                                                    // amount of shares
                                                                                                    // has been found
                                                                                                    // then print the
                                                                                                    // line
                System.out.println(
                        numberOfShares + "shares of " + stockName + " sold to colleague " + temp.getColleageID());

                stockBuyOffers.remove(temp);
                stockSold = true;
            }
            if (stockSold) {
                break;
            }
        }
        if (!stockSold) {
            System.out.println(numberOfShares + " shares of " + stockName + " has been added to inventory");
            StockOffer newOffering = new StockOffer(numberOfShares, stockName, colleagueID);
            stockSellOffers.add(newOffering);
        }
    }

    public void buyOffer(String stockName, int numberOfShares, int colleagueID) {
        boolean stockBought = false; // set the stock to false if it has not been sold
        for (StockOffer temp : stockSellOffers) {// go through the array list
            if ((temp.getStockSymbol() == stockName) && (temp.getStockShares() == numberOfShares)) {// if the stock name
                                                                                                    // with the same
                                                                                                    // amount of shares
                                                                                                    // has been found
                                                                                                    // then print the
                                                                                                    // line
                System.out.println(
                        numberOfShares + " shares of " + stockName + " bought by colleague " + temp.getColleageID());

                stockSellOffers.remove(temp);
                stockBought = true;
            }
            if (stockBought) {
                break;
            }
        }
        if (!stockBought) {
            System.out.println(numberOfShares + " shares of " + stockName + " has been added to inventory");
            StockOffer newOffering = new StockOffer(numberOfShares, stockName, colleagueID);
            stockBuyOffers.add(newOffering);
        }
    }

    public void getStockOfferings() {
        System.out.println("\nStocks for Sale:");

        for (StockOffer temp : stockSellOffers) {
            System.out.println(temp.getStockShares() + " of " + temp.getStockSymbol());
        }

        System.out.println("\nStock Buy Offers:");

        for (StockOffer temp : stockBuyOffers) {
            System.out.println(temp.getStockShares() + " of " + temp.getStockSymbol());
        }
    }

}
