package ec.edu.espe.exam.model;

public class CityDeliveryService extends DeliveryService {
    public CityDeliveryService(ParcelType type) { super(type); }
    @Override
    public double calculateCost(double baseRate) {
        return baseRate * parcelType.weightFactor();
    }
}
