package net.fateuhc.plugin.api.managers;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bukkit.plugin.IllegalPluginAccessException;

public class MongoManager {

    public MongoCollection<Document> getStatsCollection() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public MongoCollection<Document> getServersCollection() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
