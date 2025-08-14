package ec.edu.espe.exam.model;

/**
 *
 * @author danielpalacios
 */

public class CustomerNoDiscount implements PricingStrategy {

    @Override
    public double calculateDiscount(double basePrice, Customer client) {
        if (!client.isVip()) {
            return basePrice * 1.5; // add tax
        }
        return basePrice;
    }
}
