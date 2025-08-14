package ec.edu.espe.exam.model;

import javax.swing.JOptionPane;

/**
 *
 * @author danielpalacios
 */
public class LargeParcel extends Parcel {

    public LargeParcel(String type, double weight, double declaredValue, String contentDescription, String trackingCode, boolean fragile, double basePrice) {
        super(type, weight, declaredValue, contentDescription, trackingCode, fragile, basePrice);
        pack();
        transport();
    }

    @Override
    public void pack() {
        JOptionPane.showMessageDialog(null, "Packing large package.", "In Proccess", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void transport() {
        JOptionPane.showMessageDialog(null, "Parcel transported in airplane", "In Proccess", JOptionPane.INFORMATION_MESSAGE);
    }

}
