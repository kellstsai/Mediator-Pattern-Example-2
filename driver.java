public class driver {
    public static void main(String[] args) {
        ConcreteMediator NYSE = new ConcreteMediator();

        // Stock1 and Stock2 are the colleagues... from the classes we created, they do
        // not interact with each other directly but instead use the mediator to keep
        // trach of each others changes
        Stock1 broker = new Stock1(NYSE);

        Stock2 broker2 = new Stock2(NYSE);

        broker.saleOffer("NFT", 100);
        broker.saleOffer("TFN", 50);

        broker2.buyOffer("NFT", 100);
        broker2.saleOffer("SEN", 20);

        broker.buyOffer("SEN", 20);

        NYSE.getStockOfferings();
    }
}
