/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import com.mongodb.client.MongoCollection;
import net.fateuhc.plugin.api.FateUHCAPI;
import net.fateuhc.plugin.api.StubGuard;
import org.bson.Document;
import org.bukkit.plugin.IllegalPluginAccessException;

@SuppressWarnings("unused")
public class MongoManager {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.api.managers.MongoManager");
    }

    /** Internal — constructed by the FateUHC plugin. */
    public MongoManager(FateUHCAPI api) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @return MongoDB stats collection
     */
    public MongoCollection<Document> getStatsCollection() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
