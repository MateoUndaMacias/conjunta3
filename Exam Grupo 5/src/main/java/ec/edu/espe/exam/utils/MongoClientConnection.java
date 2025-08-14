package ec.edu.espe.exam.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author danielpalacios
 */
public class MongoClientConnection {

    private static MongoClientConnection instance;
    private MongoClient mongoClient;
    private MongoDatabase database;

    private MongoClientConnection() {
        String connectionString = "mongodb+srv://neolukk:neolukk@cluster0.gj7cw6m.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("OOP");
    }

    public static MongoClientConnection getInstance() {
        if (instance == null) {
            synchronized (MongoClientConnection.class) {
                if (instance == null) {
                    instance = new MongoClientConnection();
                }
            }
        }
        return instance;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }
}
