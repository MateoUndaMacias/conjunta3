package ec.edu.espe.exam.model;

import javax.swing.JOptionPane;

/**
 *
 * @author danielpalacios
 */
public abstract class Parcel {

    private String type;
    private double weight;
    private double declaredValue;
    private String contentDescription;
    private String trackingCode;
    private boolean fragile;
    private double basePrice;
            
    private PricingStrategy discountStrategy;

    public Parcel(String type, double weight, double declaredValue, String contentDescription, String trackingCode, boolean fragile, double basePrice) {
        this.type = type;
        this.weight = weight;
        this.declaredValue = declaredValue;
        this.contentDescription = contentDescription;
        this.trackingCode = trackingCode;
        this.fragile = fragile;
        this.basePrice = basePrice;
    }

    //Template Method
    public final void processShipping() {
        registerReception();
        pack();
        transport();
    }

    private void registerReception() {
        JOptionPane.showMessageDialog(null, "Parcel registered.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public abstract void pack();

    public abstract void transport();


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(double declaredValue) {
        this.declaredValue = declaredValue;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public PricingStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(PricingStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

}
