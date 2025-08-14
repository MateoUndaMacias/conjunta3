package ec.edu.espe.exam.controller;

import ec.edu.espe.exam.model.Customer;
import ec.edu.espe.exam.model.CustomerWithDiscount;
import ec.edu.espe.exam.model.CustomerNoDiscount;
import ec.edu.espe.exam.model.PricingStrategy;
import ec.edu.espe.exam.model.LargeParcel;
import ec.edu.espe.exam.model.MediumParcel;
import ec.edu.espe.exam.model.SmallParcel;
import ec.edu.espe.exam.model.Parcel;
import ec.edu.espe.exam.model.Delivery;
import ec.edu.espe.exam.view.FrmNewDelivery;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author danielpalacios
 */
public class FrmNewDeliveryController implements ActionListener {

    private static FrmNewDeliveryController instance;
    private FrmNewDelivery frmCreateShipment;

    private PricingStrategy discountStrategy;
    private Parcel pack;

    private FrmNewDeliveryController() {
        this.frmCreateShipment = FrmNewDelivery.getInstance();
        frmCreateShipment.getBtmProcessShipment().addActionListener(this);

    }

    public static FrmNewDeliveryController getInstance() {
        if (instance == null) {
            instance = new FrmNewDeliveryController();
        }
        return instance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmCreateShipment.getBtmProcessShipment()) {

            int idClient = Integer.parseInt(frmCreateShipment.getTxtId().getText());
            String name = frmCreateShipment.getTxtName().getText();
            String phone = frmCreateShipment.getTxtPhone().getText();
            String email = frmCreateShipment.getTxtEmail().getText();
            String address = frmCreateShipment.getTxtAddress().getText();
            boolean vip = frmCreateShipment.getCbxVip().isSelected();
            String type = frmCreateShipment.getCmbType().getSelectedItem().toString();
            double weight = Double.parseDouble(frmCreateShipment.getTxtWeight().getText());
            double declaredValue = Double.parseDouble(frmCreateShipment.getTxtDeclaredValue().getText());
            String contentDescription = frmCreateShipment.getTxtDescription().getText();
            String trackingCode = frmCreateShipment.getTxtTrackingCode().getText();
            boolean fragile = frmCreateShipment.getCbxFragility().isSelected();
            double basePrice = Double.parseDouble(frmCreateShipment.getTxtBasePrice().getText());

            Customer client = new Customer(idClient, name, phone, email, address, vip);

            //Context of Template Method
            switch (type) {
                case "Small":
                    pack = new SmallParcel(type, weight, declaredValue, contentDescription, trackingCode, fragile, basePrice);
                    break;
                case "Medium":
                    pack = new MediumParcel(type, weight, declaredValue, contentDescription, trackingCode, fragile, basePrice);
                    break;
                case "Large":
                    pack = new LargeParcel(type, weight, declaredValue, contentDescription, trackingCode, fragile, basePrice);
                    break;
            }

            Delivery shipment = new Delivery(client, pack);

            DeliveryFileManager.saveShipmentMongoDB(shipment);

            StringBuilder sb = new StringBuilder();
            sb.append("=== Datos del Envío ===\n")
                    .append("Cliente:\n")
                    .append("ID: ").append(client.getIdClient()).append("\n")
                    .append("Nombre: ").append(client.getName()).append("\n")
                    .append("Teléfono: ").append(client.getPhone()).append("\n")
                    .append("Email: ").append(client.getEmail()).append("\n")
                    .append("Dirección: ").append(client.getAddress()).append("\n")
                    .append("VIP: ").append(client.isVip() ? "Sí" : "No").append("\n\n")
                    .append("Paquete:\n")
                    .append("Tipo: ").append(pack.getType()).append("\n")
                    .append("Peso: ").append(pack.getWeight()).append(" kg\n")
                    .append("Valor declarado: $").append(pack.getDeclaredValue()).append("\n")
                    .append("Descripción: ").append(pack.getContentDescription()).append("\n")
                    .append("Código de seguimiento: ").append(pack.getTrackingCode()).append("\n")
                    .append("Frágil: ").append(pack.isFragile() ? "Sí" : "No").append("\n")
                    .append("Precio base: $").append(pack.getBasePrice()).append("\n")
                    .append("Precio Final: $").append(shipment.getFinalPrice()).append("\n");

            javax.swing.JOptionPane.showMessageDialog(
                    frmCreateShipment,
                    sb.toString(),
                    "Resumen del Envío",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE
            );

        }
    }
}
