/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.api.FateUHCAPI;
import net.fateuhc.plugin.api.StubGuard;
import org.bukkit.plugin.IllegalPluginAccessException;

@SuppressWarnings("unused")
public class BorderManager {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.api.managers.BorderManager");
    }

    /** Internal — constructed by the FateUHC plugin. */
    public BorderManager(FateUHCAPI api) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves information about the border.
     *
     * @return A string containing information about the border. Format taken from UHC-BORDER-INFO-FORMAT.
     */
    public String getBorderInfo() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
