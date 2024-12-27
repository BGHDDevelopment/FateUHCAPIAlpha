/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import org.bukkit.plugin.IllegalPluginAccessException;

@SuppressWarnings("unused")
public class WorldsManager {

    /**
     * Stops the loading of UHC worlds.
     */
    public void stopLoading() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Starts the loading process for UHC worlds.
     */
    public void startLoading() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Saves the mapUsed value to the uhcconfigurations.yml file under UHC-WORLD-USED.
     */
    public void handleConfigSave() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Returns whether the map is used.
     *
     * @return true if the map is used, false otherwise.
     */
    public boolean isMapUsed() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Returns whether the world is currently loading.
     *
     * @return true if the world is currently loading, false otherwise.
     */
    public boolean isLoading() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Returns whether the world is restarting to generate.
     *
     * @return true if the world is restarting to generate, false otherwise.
     */
    public boolean isRestartingToGenerate() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Returns whether the world seed setting is enabled.
     *
     * @return true if the world seed setting is enabled, false otherwise.
     */
    public boolean isSeedGenerated() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Returns whether the chunks are loaded.
     *
     * @return true if the chunks are loaded, false otherwise.
     */
    public boolean isChunksLoaded() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Returns the world seed if set.
     *
     * @return the world seed.
     */
    public long getWorldSeed() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

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
