/**
 * This mediator will handle all the colleagues that will be created
 * They will have all the indicated methods
 */
public interface Mediator {
    public void saleOffer(String stockName, int numberOfShares, int colleagueID);

    public void buyOffer(String stockName, int numberOfShares, int colleagueID);

    public void addColleague(Colleague colleague);

}