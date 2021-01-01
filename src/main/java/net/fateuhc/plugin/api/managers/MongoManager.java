/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bukkit.plugin.IllegalPluginAccessException;

public class MongoManager {

    /**
     * @return MongoDB stats collection
     */
    public MongoCollection<Document> getStatsCollection() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @return MongoDB servers collection
     */
    public MongoCollection<Document> getServersCollection() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
