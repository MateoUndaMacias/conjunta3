package ec.edu.espe.exam.model;

public class StandardParcel implements ParcelType {
    @Override
    public double weightFactor() { return 1.0; }
    @Override
    public String describe() { return "Standard parcel"; }
}
