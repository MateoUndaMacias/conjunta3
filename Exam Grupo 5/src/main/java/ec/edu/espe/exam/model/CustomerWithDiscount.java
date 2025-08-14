package ec.edu.espe.exam.model;

/**
 *
 * @author danielpalacios
 */
public class CustomerWithDiscount implements PricingStrategy {

    @Override
    public double calculateDiscount(double basePrice, Customer client) {
        if (client.isVip()) {
            return basePrice * 0.8; // 20% discount
        }
        return basePrice;
    }
}
