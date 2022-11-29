/**
 * This class will represent all the colleagues or the "people" that will be
 * used to create the stockOffer
 * All the colleagues will have these methods available to them... therefore,
 * the colleagues must be a child to this class
 */
public abstract class Colleague {
    private Mediator mediator;
    private int colleageID;

    // The constructor so that every colleague will use the same mediator
    public Colleague(Mediator newMediator) {
        this.mediator = newMediator;
    }

    public void saleOffer(String stock, int shares) {
        mediator.saleOffer(stock, shares, this.colleageID);
    }

    public void buyOffer(String stock, int shares) {
        mediator.buyOffer(stock, shares, this.colleageID);
    }

    public void setColleageID(int ID) {
        this.colleageID = ID;
    }
}
