/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import org.bukkit.plugin.IllegalPluginAccessException;

public class WorldsManager {

    /**
     * @return True/False depending on status of UHC worlds
     */
    public boolean areUHCWorldsValid() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Starts the biomes swap if TerrainControl is not installed.
     */
    public void handleBiomesSwap() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
