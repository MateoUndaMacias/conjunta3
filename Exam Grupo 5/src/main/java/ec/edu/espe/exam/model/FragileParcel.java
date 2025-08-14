package ec.edu.espe.exam.model;

public class FragileParcel implements ParcelType {
    @Override
    public double weightFactor() { return 1.2; }
    @Override
    public String describe() { return "Fragile parcel"; }
}
