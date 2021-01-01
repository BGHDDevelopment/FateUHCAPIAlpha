/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

public class BorderManager {

    /**
     * Starts the border shrink.
     */
    public void startBorderShrink() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @return Information about border size
     */
    public String getBorderInfo() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to check the border size against a player
     *
     * @param player Player's name
     * @param size   Border size
     */
    public void checkBorder(Player player, int size) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
