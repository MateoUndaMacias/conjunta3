package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam.model.Delivery;
import ec.edu.espe.exam.utils.MongoClientConnection;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author danielpalacios
 */
public class DeliveryFileManager {

    public static MongoClientConnection connection = MongoClientConnection.getInstance();
    public static MongoDatabase database = connection.getDatabase();
    public static MongoCollection<Document> collection = database.getCollection("shipments");

    //Method Create
    public static void saveShipmentMongoDB(Delivery shipment) {
        
        Document clientDoc = new Document("idClient", shipment.getClient().getIdClient())
                .append("name", shipment.getClient().getName())
                .append("phone", shipment.getClient().getPhone())
                .append("email", shipment.getClient().getEmail())
                .append("address", shipment.getClient().getAddress())
                .append("vip", shipment.getClient().isVip());

        Document packageDoc = new Document("type", shipment.getPack().getType())
                .append("weight", shipment.getPack().getWeight())
                .append("declaredValue", shipment.getPack().getDeclaredValue())
                .append("contentDescription", shipment.getPack().getContentDescription())
                .append("trackingCode", shipment.getPack().getTrackingCode())
                .append("fragile", shipment.getPack().isFragile())
                .append("basePrice", shipment.getPack().getBasePrice());

        Document shipmentDoc = new Document("client", clientDoc)
                .append("package", packageDoc)
                .append("finalPrice", shipment.getFinalPrice());

        try {
            collection.insertOne(shipmentDoc);
            JOptionPane.showMessageDialog(null, "Delivery saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error saving in MongoDB", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
