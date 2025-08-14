package ec.edu.espe.exam.model;

/**
 *
 * @author danielpalacios
 */
public class Delivery {

    private Customer client;
    private Parcel pack;
    private double finalPrice;
    private PricingStrategy discountStrategy;

    public Delivery(Customer client, Parcel pack) {
        this.client = client;
        this.pack = pack;
        this.finalPrice = applyDiscount(client);
    }

    //Strategy
    private double applyDiscount(Customer client) {
        if (client.isVip()) {
            discountStrategy = new CustomerWithDiscount();
        } else {
            discountStrategy = new CustomerNoDiscount();
        }

        return discountStrategy.calculateDiscount(pack.getBasePrice(), client);
    }

    public Customer getClient() {
        return client;
    }

    public Parcel getPack() {
        return pack;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void process() {
        getPack().processShipping();
    }

    public void setClient(Customer client) {
        this.client = client;
    }

    public void setPack(Parcel pack) {
        this.pack = pack;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

}
