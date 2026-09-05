/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.api.FateUHCAPI;
import net.fateuhc.plugin.api.StubGuard;
import net.fateuhc.plugin.api.data.SelectCall;
import org.bukkit.plugin.IllegalPluginAccessException;

public class MySQLManager {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.api.managers.MySQLManager");
    }

    /** Internal — constructed by the FateUHC plugin. */
    public MySQLManager(FateUHCAPI api) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Execute an update to the database.
     *
     * @param query  The statement to the database.
     * @param values The values to be inserted into the statement.
     */
    public void execute(String query, Object... values) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Execute a query to the database.
     *
     * @param query    The statement to the database.
     * @param callback The data callback (Async).
     * @param values   The values to be inserted into the statement.
     */
    public void select(String query, SelectCall callback, Object... values) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
