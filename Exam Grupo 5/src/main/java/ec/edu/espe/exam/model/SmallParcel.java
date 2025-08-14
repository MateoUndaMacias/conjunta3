package ec.edu.espe.exam.model;

import javax.swing.JOptionPane;

/**
 *
 * @author danielpalacios
 */
public class SmallParcel extends Parcel {

    public SmallParcel(String type, double weight, double declaredValue, String contentDescription, String trackingCode, boolean fragile, double basePrice) {
        super(type, weight, declaredValue, contentDescription, trackingCode, fragile, basePrice);
        pack();
        transport();
    }

    @Override
    public void pack() {
        JOptionPane.showMessageDialog(null, "Packing small package.", "In Proccess", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void transport() {
        JOptionPane.showMessageDialog(null, "Parcel transported in car.", "In Proccess", JOptionPane.INFORMATION_MESSAGE);
    }

}
