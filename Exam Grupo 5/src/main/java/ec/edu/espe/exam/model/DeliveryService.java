package ec.edu.espe.exam.model;

/**
 * Bridge Abstraction
 * @author danielpalacios
 */
public abstract class DeliveryService {
    protected ParcelType parcelType;

    public DeliveryService(ParcelType parcelType) {
        this.parcelType = parcelType;
    }

    public abstract double calculateCost(double baseRate);

    public String describe() {
        return parcelType.describe();
    }
}
