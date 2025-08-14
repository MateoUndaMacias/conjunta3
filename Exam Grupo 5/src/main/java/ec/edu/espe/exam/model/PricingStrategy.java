package ec.edu.espe.exam.model;

/**
 *
 * @author danielpalacios
 */
public interface PricingStrategy {

    public abstract double calculateDiscount(double basePrice, Customer client);
}
