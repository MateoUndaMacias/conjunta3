package ec.edu.espe.exam.model;

import javax.swing.JOptionPane;

/**
 *
 * @author danielpalacios
 */
public class MediumParcel extends Parcel {

    public MediumParcel(String type, double weight, double declaredValue, String contentDescription, String trackingCode, boolean fragile, double basePrice) {
        super(type, weight, declaredValue, contentDescription, trackingCode, fragile, basePrice);
        pack();
        transport();
    }

    @Override
    public void pack() {
        JOptionPane.showMessageDialog(null, "Packing medium package.", "In Proccess", JOptionPane.INFORMATION_MESSAGE);
    }


    @Override
    public void transport() {
       JOptionPane.showMessageDialog(null, "Parcel transported in truck", "In Proccess", JOptionPane.INFORMATION_MESSAGE);
    }
}
