import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.Iterator;

public class MongoDbJdbc {
    public static void main(String[] args) {
        MongoClient mongoClient =
                new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        MongoDatabase database = mongoClient.getDatabase("mano_test");

        MongoCollection<Document> collection = database.getCollection("my_collection");

//        Document asmuo = new Document("name", "Vardas").append("surname", "Pavarde");
//
//        collection.insertOne(asmuo);

//        Iterator it = collection.find().iterator();
//        while (it.hasNext()) {
//
//            Document document = (Document) it.next();
//            System.out.println(document.get("name"));
//
//        }

        collection.deleteOne(Filters.eq("name", "Vardas"));

        mongoClient.close();
    }
}