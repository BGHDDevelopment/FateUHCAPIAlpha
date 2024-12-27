/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bukkit.plugin.IllegalPluginAccessException;

@SuppressWarnings("unused")
public class MongoManager {

    /**
     * @return MongoDB stats collection
     */
    public MongoCollection<Document> getStatsCollection() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
